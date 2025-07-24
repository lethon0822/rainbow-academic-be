package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GradeReq {
    private int enrollmentId;
    private Integer score;
    private String grade;
}
