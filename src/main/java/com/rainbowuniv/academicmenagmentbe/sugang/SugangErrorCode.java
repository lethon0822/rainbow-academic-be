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

    // 추후에 추가될 수 있는 부분
    // 토큰 만료, 해당 학과/학년만 신청 가능한 강의
    // 신청 기간 아님 ( 신청 시간 1초 지났을 때 등등 ? )
    // 시간표가 겹칠 때 ( 월 34 이미 신청 했는데 월 23 다른 강의 또 신청 등등)
    // 최대 학점 초과
    // 짧은 시간 다중 클릭해서 몇 분 정지되는 경우 ?

}
