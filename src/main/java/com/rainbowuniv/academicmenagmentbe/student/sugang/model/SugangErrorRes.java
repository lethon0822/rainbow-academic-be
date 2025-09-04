package com.rainbowuniv.academicmenagmentbe.student.sugang.model;

import com.rainbowuniv.academicmenagmentbe.student.sugang.SugangErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SugangErrorRes {
    private final int code;
    private final String message;

    public SugangErrorRes(SugangErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }


}
