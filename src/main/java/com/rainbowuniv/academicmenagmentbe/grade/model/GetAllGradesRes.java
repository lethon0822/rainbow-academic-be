package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GetAllGradesRes {
    private int year;
    private int semester;
    private String type;
    private int grade;
    private String professorName;
    private String courseCode;
    private String title;
    private int credit;
    private String rank;
    private double point; // 평점 4.5, 4.0 ...

}
