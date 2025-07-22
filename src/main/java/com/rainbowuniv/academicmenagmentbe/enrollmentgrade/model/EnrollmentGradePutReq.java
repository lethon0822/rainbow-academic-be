package com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model;

import lombok.Data;

@Data
public class EnrollmentGradePutReq {
    private int enrollmentId; // 수강신청 ID
    private Integer midScore; // 중간
    private Integer finScore; // 기말
    private String grade; // 등급 (rank) (예: A+)
}
