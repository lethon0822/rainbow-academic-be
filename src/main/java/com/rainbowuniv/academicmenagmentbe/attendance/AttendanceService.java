package com.rainbowuniv.academicmenagmentbe.attendance;

import com.rainbowuniv.academicmenagmentbe.attendance.model.AttendancePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceMapper attendanceMapper;

    public int checkExist(AttendancePutReq req) {
        return attendanceMapper.checkExist(req);
    }
    public void insertAttendance(AttendancePutReq req) {
        attendanceMapper.insertAttendance(req);
    }
    public void updateAttendance(AttendancePutReq req) {
        attendanceMapper.updateAttendance(req);
    }
}
