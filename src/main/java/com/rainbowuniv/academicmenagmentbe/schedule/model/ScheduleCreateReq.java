package com.rainbowuniv.academicmenagmentbe.schedule.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleCreateReq {
    private Integer semesterId;
    private String scheduleType; // ENUM 그대로 문자열
    private String startDate;    // "yyyy-MM-dd"
    private String endDate;      // "yyyy-MM-dd"
    private String description;
}