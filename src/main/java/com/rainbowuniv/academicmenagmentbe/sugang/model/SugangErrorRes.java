package com.rainbowuniv.academicmenagmentbe.sugang.model;

import com.rainbowuniv.academicmenagmentbe.sugang.SugangErrorCode;
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
