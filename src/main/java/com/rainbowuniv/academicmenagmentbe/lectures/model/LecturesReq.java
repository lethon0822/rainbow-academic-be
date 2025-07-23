package com.rainbowuniv.academicmenagmentbe.lectures.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LecturesReq {
    private int courseId;
    private String title;
    private int credit;
}
