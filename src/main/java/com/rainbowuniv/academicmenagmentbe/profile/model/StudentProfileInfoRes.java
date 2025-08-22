package com.rainbowuniv.academicmenagmentbe.profile.model;

import lombok.Getter;

@Getter
public class StudentProfileInfoRes {

    //기본 프로필탭
    private String userName;
    private int loginId;
    private int grade;
    private String deptName;
    private int semester;
    private String entDate;
    private String status;

    // 개인정보탭
    private String birthDate;
    private String email;
    private String phone;
    private String address;
    private String addDetail;

    // 총이수학점
    private int getCredit;

    // 학생 사진
    private String userPic;
}
