package com.rainbowuniv.academicmenagmentbe.course.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseFilterReq {
    private Integer year;
    private Integer semester;
    private String departmentName;
    private String type;
    private String keyword;
    private Integer grade;
}
