package com.rainbowuniv.academicmenagmentbe.privacyandpwd.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrivacyPutReq {
    private int userId;
    private String address;
    private String phone;
    private String email;
}
