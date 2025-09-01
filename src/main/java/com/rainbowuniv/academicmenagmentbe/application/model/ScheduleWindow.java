package com.rainbowuniv.academicmenagmentbe.application.model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ScheduleWindow {
    private Integer scheduleId;
    private LocalDateTime startDate; // start_datetime 매핑
    private LocalDateTime endDate;   // end_datetime   매핑
}