package com.rainbowuniv.academicmenagmentbe.account.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class AccountFindIdReq {
    private String email;
    private String phone;
}
