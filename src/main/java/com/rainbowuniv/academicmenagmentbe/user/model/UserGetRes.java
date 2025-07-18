package com.rainbowuniv.academicmenagmentbe.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserGetRes {
    private int userId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String birth_credit;
    private int total_credit;
    private int get_credit;
    private String role;


    public void setBirthCredit(String birthCredit) {
    }


    public void setTotalCredit(int totalCredit) {

    }

    public void setGetCredit(int getCredit) {
    }
}
