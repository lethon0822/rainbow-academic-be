package com.rainbowuniv.academicmenagmentbe.professor.model;

import lombok.Getter;

@Getter
public class ProfessorGetRes {
    private int courseId;
    private String name;
    private String deptName;
    private String classroom;
    private String type;
    private int semester;
    private String time;
    private String title;
    private int credit;
    private int maxStd;
}
