package com.rainbowuniv.academicmenagmentbe.lectures.model;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class LecturesEvaluationDto {
    private int courseId;
    private Integer userId;
    private String review;
    private int evScore;
    private int enrollmentId;
}