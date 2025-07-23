package com.rainbowuniv.academicmenagmentbe.professor.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProfessorPostReq {
    private int userId;
    private String classroom;
    private String type;
    private int semester;
    private String time;
    private String title;
    private int credit;
    private String weekPlan;
    private String textBook;
    private String goal;
    private int maxStd;
    private int grade;
}
