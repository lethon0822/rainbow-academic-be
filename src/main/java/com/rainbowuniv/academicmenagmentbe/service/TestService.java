package com.rainbowuniv.academicmenagmentbe.service;

import com.rainbowuniv.academicmenagmentbe.dto.AttendanceDto;
import com.rainbowuniv.academicmenagmentbe.dto.GradeDto;
import com.rainbowuniv.academicmenagmentbe.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;


    public void checkAttendance(AttendanceDto dto) {
        testMapper.checkAttendance(dto);
    }

    public void updateMidFinalGrades(GradeDto dto) {
        testMapper.updateMidFinGrades(dto);
    }
}