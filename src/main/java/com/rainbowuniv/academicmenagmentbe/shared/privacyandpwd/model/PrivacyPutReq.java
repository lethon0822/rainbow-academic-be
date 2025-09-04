package com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrivacyPutReq {
    private int userId;
    private String address;
    private String phone;
    private String email;
    private String addDetail;
}