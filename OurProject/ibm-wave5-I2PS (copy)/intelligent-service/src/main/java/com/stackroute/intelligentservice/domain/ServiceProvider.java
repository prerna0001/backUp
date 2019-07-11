package com.stackroute.intelligentservice.domain;

import lombok.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceProvider {

    private String emailId;
    private String password;
    String name;
    String domain;
    List<String> subDomain;
    String role;
    ArrayList<SkillsAndExperience> skillsAndExperiences;      //array list reference of SKillsAndExperiance
    String about;
    BigDecimal chargePerHour;


    @Override
    public String toString() {
        return "ServiceProvider{" +
                "emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", subDomain=" + subDomain +
                ", role='" + role + '\'' +
                ", skillsAndExperiences=" + skillsAndExperiences +
                ", about='" + about + '\'' +
                ", chargePerHour=" + chargePerHour +
                '}';
    }
}
