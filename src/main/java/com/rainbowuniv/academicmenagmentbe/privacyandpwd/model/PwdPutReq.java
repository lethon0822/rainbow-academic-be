package com.rainbowuniv.academicmenagmentbe.privacyandpwd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PwdPutReq {
    private final int userId;
    private final String password;
    private String email;
}
