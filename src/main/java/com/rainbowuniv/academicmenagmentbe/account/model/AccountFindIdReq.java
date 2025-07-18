package com.rainbowuniv.academicmenagmentbe.account.model;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class AccountFindIdReq {
    private String email;
    private String phone;
}
