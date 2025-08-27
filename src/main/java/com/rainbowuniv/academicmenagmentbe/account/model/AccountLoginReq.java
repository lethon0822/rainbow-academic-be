package com.rainbowuniv.academicmenagmentbe.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter

@AllArgsConstructor
@NoArgsConstructor
public class AccountLoginReq {
    private String loginId;
    private String password;
}
