package com.rainbowuniv.academicmenagmentbe.account.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountLoginRes {
    private int userId;
    private String userRole;
    private String userName;
    private int loginId;
    private int semesterId;

    @JsonIgnore
    private String password;

}
