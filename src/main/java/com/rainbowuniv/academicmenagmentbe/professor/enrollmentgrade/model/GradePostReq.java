package com.rainbowuniv.academicmenagmentbe.professor.enrollmentgrade.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GradePostReq {

    private int midScore;
    private int finScore;
    private String rank;
    private int enrollmentId;
}
