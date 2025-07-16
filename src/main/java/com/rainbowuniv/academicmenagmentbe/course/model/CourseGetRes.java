package com.rainbowuniv.academicmenagmentbe.course.model;

import lombok.Getter;

@Getter
public class CourseGetRes {
    private int courseId;
    private String classroom;
    private String type;
    private int semester;
    private String time;
    private String title;
    private int credit;
    private int maxStd;
}
