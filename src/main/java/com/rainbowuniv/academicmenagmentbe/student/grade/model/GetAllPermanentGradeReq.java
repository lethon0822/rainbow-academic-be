package com.rainbowuniv.academicmenagmentbe.student.grade.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAllPermanentGradeReq {
    private Integer semester;
    private int semesterId;
    private Integer grade;
}
