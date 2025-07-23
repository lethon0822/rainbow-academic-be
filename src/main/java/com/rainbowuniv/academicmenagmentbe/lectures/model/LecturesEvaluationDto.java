package com.rainbowuniv.academicmenagmentbe.lectures.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LecturesEvaluationDto {

    private int courseId;
    private int userId;
    private String review;
    private int score;

}
