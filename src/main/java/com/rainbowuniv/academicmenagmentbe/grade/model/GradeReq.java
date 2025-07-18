package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;

@Data
public class GradeReq {
    private int enrollmentId; // 수강신청 ID
    private Integer score; // 점수
    private String grade; // 등급 (예: A+)
}
