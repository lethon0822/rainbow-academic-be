package com.rainbowuniv.academicmenagmentbe.schedule.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleUpdateReq {
    private Integer scheduleId;
    private Integer semesterId;
    private String scheduleType;
    private String startDate;    // "yyyy-MM-dd"
    private String endDate;      // "yyyy-MM-dd"
    private String description;
}