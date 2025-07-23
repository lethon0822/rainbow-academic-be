package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;

@Data
public class GradeBySubjectDTO {
    private int grade;
    private String semester;
    private String courseId;
    private String title;
    private int credit;
    private String rank;
    private String type;
    private int userId;
}