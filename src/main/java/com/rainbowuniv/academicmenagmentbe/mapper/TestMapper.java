package com.rainbowuniv.academicmenagmentbe.mapper;

import com.rainbowuniv.academicmenagmentbe.dto.AttendanceDto;
import com.rainbowuniv.academicmenagmentbe.dto.GradeDto;
import com.rainbowuniv.academicmenagmentbe.dto.StudentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface TestMapper{
    List<StudentDto> selectStudentsByCourseId(int courseId);

    List<AttendanceDto> selectAttendanceByCourseAndDate(int courseId, Date attendDate);

    //  추가된 기능: user_id 기반 출결 등록
    void checkAttendance(AttendanceDto dto);

    //  추가된 기능: user_id 기반 중간/기말 성적 수정
    void updateMidFinGrades(GradeDto dto);
}



