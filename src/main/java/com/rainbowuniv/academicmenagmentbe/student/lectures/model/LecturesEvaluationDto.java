package com.rainbowuniv.academicmenagmentbe.student.lectures.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class LecturesEvaluationDto {
    private int enrollmentId;
    private Integer userId;
    private String review;
    private int evScore;
}