package com.rainbowuniv.academicmenagmentbe.privacyandpwd.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrivacyGetRes {
    private int loginId;
    private String userName;
    private String address;
    private String phone;
    private String email;
}
