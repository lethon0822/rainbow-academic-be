package com.rainbowuniv.academicmenagmentbe.lectures.model;

import lombok.*;

@Data
@Getter
@Setter
@ToString
public class LecturesEvaluationDto {
    private int enrollmentId;
    private Integer userId;
    private String review;
    private int evScore;
}
