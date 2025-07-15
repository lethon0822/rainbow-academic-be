package com.rainbowuniv.academicmenagmentbe.course.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CourseReq {
    private int courseId;
    private String title;
    private int credit;
}
