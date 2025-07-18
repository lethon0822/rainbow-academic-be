package com.rainbowuniv.academicmenagmentbe.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SugangListRes {

    private int courseId;
    private String title;
    private String classroom;
    private String professor;
    private String time;
    private int credit;
}
