package com.rainbowuniv.academicmenagmentbe.attendance;

import com.rainbowuniv.academicmenagmentbe.attendance.model.AttendanceReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceMapper attendanceMapper;

    public int checkExist(AttendanceReq req) {
        return attendanceMapper.checkExist(req);
    }
    public void insertAttendance(AttendanceReq req) {
        attendanceMapper.insertAttendance(req);
    }
    public void updateAttendance(AttendanceReq req) {
        attendanceMapper.updateAttendance(req);
    }
}
