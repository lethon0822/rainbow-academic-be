package com.rainbowuniv.academicmenagmentbe.Attendance;

import com.rainbowuniv.academicmenagmentbe.Attendance.model.AttendanceReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;

@Mapper
public interface AttendanceMapper {
    int checkExist(AttendanceReq req);

    void insertAttendance(AttendanceReq req);

    void updateAttendance(AttendanceReq req);

    AttendanceReq getAttendanceByEnrollmentAndDate(@Param("enrollmentId") int enrollmentId, @Param("attendDate") LocalDate attendDate);
}




