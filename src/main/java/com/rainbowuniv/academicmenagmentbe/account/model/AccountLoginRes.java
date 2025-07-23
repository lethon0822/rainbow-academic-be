package com.rainbowuniv.academicmenagmentbe.account.model;

import lombok.Getter;

@Getter
public class AccountLoginRes {
    private int userId;
    private String password;
    private String userRole;
    private String userName;
}
