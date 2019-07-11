package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.exception.PasswordNotMatchException;
import com.stackroute.exception.UserNameNotFoundException;
import com.stackroute.exception.UserNameOrPasswordEmptyException;
import com.stackroute.jwt.SecurityTokenGenrator;
import com.stackroute.userservice.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/* @RestController = @Controller + @ResponseBody */

@CrossOrigin(value = "*")
@RequestMapping("api/v1")
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }

//    @ApiOperation(value = "Accept user into repository and generating token")
    @PostMapping("/user")
    public ResponseEntity<?>  login(@RequestBody User loginDetails) throws UserNameOrPasswordEmptyException, UserNameNotFoundException, PasswordNotMatchException {

        String name = loginDetails.getName();
        String password = loginDetails.getPassword();

        if (name == null || password == null) {

            throw new UserNameOrPasswordEmptyException();
        }

        User user = userService.findByNameAndPassword(name,password);

        if (user == null) {
            throw new UserNameNotFoundException();
        }

        String fetchedPassword = user.getPassword();

        if (!password.equals(fetchedPassword)) {
            throw new PasswordNotMatchException();
        }

        // generating token

        SecurityTokenGenrator securityTokenGenrator = (User userDetails) -> {
            String jwtToken = "";

            jwtToken = Jwts.builder().setId(""+user.getName()).setIssuedAt(new Date())

                    .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

            Map<String, String> map1 = new HashMap<>();

            map1.put("token", jwtToken);

            map1.put("message", "User successfully logged in");

            return map1;

        };
        Map<String, String> map = securityTokenGenrator.generateToken(user);
        return new ResponseEntity<>(map, HttpStatus.OK);

    }

}

