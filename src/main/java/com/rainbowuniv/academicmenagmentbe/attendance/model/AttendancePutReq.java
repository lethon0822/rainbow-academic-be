package com.rainbowuniv.academicmenagmentbe.attendance.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AttendancePutReq {
    private int enrollmentId;
    private LocalDate attendDate;
    private String status;
    private String note;
}
