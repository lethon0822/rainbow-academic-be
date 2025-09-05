package com.rainbowuniv.academicmenagmentbe.student.lectures.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LecturesReq {
    //설문지
    private int courseId;
    private String title;
    private int credit;
}
