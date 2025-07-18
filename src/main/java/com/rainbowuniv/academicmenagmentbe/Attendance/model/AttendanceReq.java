package com.rainbowuniv.academicmenagmentbe.Attendance.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AttendanceReq {
    private int enrollmentId;
    private LocalDate attendDate;
    private String status;
    private String note;
}
