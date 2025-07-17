package com.rainbowuniv.academicmenagmentbe.course.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CourseGetReq {
    private int userId;
    private int year;
    private int semester;


}
