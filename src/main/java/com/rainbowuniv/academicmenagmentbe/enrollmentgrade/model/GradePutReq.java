package com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GradePutReq {
    private int midScore; // 중간고사
    private int finScore; // 기말고사
    private int attendanceScore; // 출석
    private int assignmentScore; // 과제
    private String rank; // 등급 (A+, B))
    private int enrollmentId; // 수강 Id
    private String departmentName; // 학과명
}
