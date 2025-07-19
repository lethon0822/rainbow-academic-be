package com.rainbowuniv.academicmenagmentbe.privacyandpwd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PwdPutReq {
    private int userId;
    private String password;
}
