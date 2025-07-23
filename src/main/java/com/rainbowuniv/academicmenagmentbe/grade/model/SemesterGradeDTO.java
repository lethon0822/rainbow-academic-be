package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;

@Data
public class SemesterGradeDTO {
    private int grade;              // 학년
    private String semester;        // 학기
    private int requestedCredits;   // 신청학점
    private int acquiredCredits;    // 취득학점
    private double avgScore;        // 평균점수
    private double avgGradePoint;   // 평균평점
    private String grading;             // 석차
    private int totalStudents;      // 인원
}
