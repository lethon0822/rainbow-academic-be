package com.rainbowuniv.academicmenagmentbe.sugang;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SugangErrorCode {
    ALREADY_APPLIED(4001, "수강신청 실패! 이미 신청한 강의입니다."),
    NO_REMAINING_SLOT(4002, "수강신청 실패! 잔여 인원이 없습니다."),
    SERVER_ERROR(5001, "수강신청 실패! 서버 오류입니다.");

    private final int code;
    private final String message;

}
