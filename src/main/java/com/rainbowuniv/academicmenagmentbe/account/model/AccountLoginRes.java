package com.rainbowuniv.academicmenagmentbe.account.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

@Getter
public class AccountLoginRes {
    private int userId;
    private String userRole;
    private String userName;

    @JsonIgnore
    private String password;

}
