package com.rainbowuniv.academicmenagmentbe.shared.schedule.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleRes {
    private Integer id;
    private Integer semesterId;
    private String scheduleType;
    private String startDate;   // "yyyy-MM-dd"
    private String endDate;     // "yyyy-MM-dd"
    private String description;
    private String createdAt;   // "yyyy-MM-dd HH:mm:ss"
}
