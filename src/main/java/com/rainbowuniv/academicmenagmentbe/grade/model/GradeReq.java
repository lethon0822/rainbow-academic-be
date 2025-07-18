package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;

@Data
public class GradeReq {
    private int enrollmentId;
    private Integer score;
    private String grade;
}
