package com.rainbowuniv.academicmenagmentbe.shared.course.model;


import lombok.Getter;

@Getter
public class CourseGetDetailRes {
    private int courseId;
    private String classroom;
    private String type;
    private int year;
    private int semester;
    private String time;
    private String title;
    private int credit;
    private String weekPlan;
    private String textBook;
    private String goal;
    private int maxStd;
    private String userName;
    private String deptName;
    private int grade;
}
