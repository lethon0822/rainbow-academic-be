package com.rainbowuniv.academicmenagmentbe.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseEnrollReq {
    private int userId;
    private int courseId;
}
