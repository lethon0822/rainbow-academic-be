package com.rainbowuniv.academicmenagmentbe.schedule.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleCreateReq {

    @JsonIgnore            // 요청/응답 바디에 안보내고 서버 내부에서만 사용
    private Long scheduleId;

    private Integer semesterId;
    private String scheduleType; // ENUM 그대로 문자열
    private String startDate;    // "yyyy-MM-dd"
    private String endDate;      // "yyyy-MM-dd"
    private String description;
}