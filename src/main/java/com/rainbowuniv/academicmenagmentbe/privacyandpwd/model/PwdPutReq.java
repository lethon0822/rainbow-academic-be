package com.rainbowuniv.academicmenagmentbe.privacyandpwd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PwdPutReq {
    private int userId;
    private String password;
}
