package com.rainbowuniv.academicmenagmentbe.professor.model;


import lombok.Getter;

@Getter
public class CourseStudentGetReq {
    private int userId;
    private String userName;
    private String deptName;
    private String email;
    private String phone;
    private int grade;
}
