package com.rainbowuniv.academicmenagmentbe.lectures.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturesEvaluationDto {
    private int courseId;
    private int userId;
    private String review;
    private int average;
}
