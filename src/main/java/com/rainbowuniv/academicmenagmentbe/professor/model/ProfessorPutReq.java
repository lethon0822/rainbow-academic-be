package com.rainbowuniv.academicmenagmentbe.professor.model;

import lombok.Getter;

@Getter

public class ProfessorPutReq {
    private int courseId;
    private String classroom;
    private String type;
    private int semester;
    private String time;
    private String title;
    private int credit;
    private String weekPlan;
    private String evaluation;
    private String textBook;
    private String goal;
    private int maxStd;
}
