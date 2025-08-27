package com.rainbowuniv.academicmenagmentbe.staff.member.model;

import lombok.Getter;

@Getter
public class MemberGetRes {
    private int loginId;
    private String username;
    private String address;
    private String email;
    private String phone;
    private String deptName;
    private String status;
    private int grade;
}
