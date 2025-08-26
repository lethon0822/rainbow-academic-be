package com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model;


import lombok.AllArgsConstructor;
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
