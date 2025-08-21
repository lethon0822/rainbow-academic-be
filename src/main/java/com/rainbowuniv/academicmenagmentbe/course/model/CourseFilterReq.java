package com.rainbowuniv.academicmenagmentbe.course.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseFilterReq {
    private Integer year;
    private Integer semester;
    private String type;
    private String departmentName;
    private Integer grade;
    private String keyword;
}
