package com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model;

import lombok.Data;

@Data
public class EnrollmentGradePutReq {
    private int enrollmentId; // 수강신청 ID
    private Double grade; // 총점 예: 95
    private String rank; // 등급 (rank) (예: A+)
    private Integer midScore; // 중간
    private Integer finScore; // 기말
    private Integer attendanceScore; // 출석
    private Integer assignmentScore; // 과제
}
