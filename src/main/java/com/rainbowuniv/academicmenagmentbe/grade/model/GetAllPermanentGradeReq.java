package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAllPermanentGradeReq {
    private int year;
    private int semester;
    private String type;
    private int grade;
    private String keyword;
}
