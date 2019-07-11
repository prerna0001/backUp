import { Component, OnInit } from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
import { LoginService } from '../login.service';

import  { JwtHelperService } from '@auth0/angular-jwt';


@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  loggedIn:any = null;

  constructor(private loginService:LoginService, private route: ActivatedRoute, private router:Router) { }
  arrayOfUser:any=[];

  helper = new JwtHelperService();

  ngOnInit() {
    console.log("in ngoninit")
  }

  authenticateUser(emailId, password) {
    console.log("in authenticateUser " + emailId  +password);
    var userdata = {
      emailId:emailId,
      password: password
    }
    console.log("in authenticateUser1 " + emailId  +password);
    this.loginService.authenticateUser(userdata);
    console.log("in authenticateUser0 "+ userdata);
    console.log("in authenticateUser1 " + emailId  +password);
    

    this.loginService.authenticateUser(userdata).subscribe(userdata => {
      console.log("in authenticateUser2");
      console.log(userdata)
    if (userdata.token) {
      console.log("in if");

     let role =  this.helper.decodeToken(userdata.token).sub;
     console.log("we are having this......",userdata.token);

    //  console.log("in if print email   "+ emailId);
    //  console.log("in if print password   "+ password);
    //  console.log("in if print role   ", role);

    // let sendEmailId=userdata.emailId;
    console.log("the email id to be sent "+emailId);

     if (role==null) {
      console.log("role is "+role);
      console.log("in if1 user login");
      
      this.router.navigateByUrl('/innovatorprofiledashboard/'+emailId);
     }
      if(role!=null)
      {
      console.log("in else user login");
      this.router.navigateByUrl('/serviceProviderdashboard/'+emailId);
      
     }
    }
    else{
      this.loggedIn = true;
    }

    }, err  => {
      this.loggedIn = true;
    })
  }

}


