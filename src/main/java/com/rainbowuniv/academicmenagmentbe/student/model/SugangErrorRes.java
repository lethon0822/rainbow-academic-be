package com.rainbowuniv.academicmenagmentbe.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SugangErrorRes {
    private String message;
    private int code;
}
