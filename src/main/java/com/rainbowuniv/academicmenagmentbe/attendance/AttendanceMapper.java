package com.rainbowuniv.academicmenagmentbe.attendance;

import com.rainbowuniv.academicmenagmentbe.attendance.model.AttendancePutReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;

@Mapper
public interface AttendanceMapper {
    int checkExist(AttendancePutReq req);

    void insertAttendance(AttendancePutReq req);

    void updateAttendance(AttendancePutReq req);

    AttendancePutReq getAttendanceByEnrollmentAndDate(@Param("enrollmentId") int enrollmentId, @Param("attendDate") LocalDate attendDate);
}




