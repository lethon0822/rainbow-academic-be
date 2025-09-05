package com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model;

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
    private String addDetail;
}