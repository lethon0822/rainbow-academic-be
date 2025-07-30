package com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GradePutReq {
    private int midScore;
    private int finScore;
    private int attendanceScore;
    private int assignmentScore;
    private String rank;
    private int enrollmentId;
    private String departmentName;
}
