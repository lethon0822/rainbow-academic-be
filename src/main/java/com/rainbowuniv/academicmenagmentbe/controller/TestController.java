package com.rainbowuniv.academicmenagmentbe.controller;

import com.rainbowuniv.academicmenagmentbe.dto.AttendanceDto;
import com.rainbowuniv.academicmenagmentbe.dto.GradeDto;
import com.rainbowuniv.academicmenagmentbe.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

    private final TestService testService;

    @PutMapping("/grade/check/")
    public void checkAttendance(@RequestBody AttendanceDto dto) {
        testService.checkAttendance(dto);
    }

    @PutMapping("/grade/score")
    public void updateMidFinalGrades(@RequestBody GradeDto dto) {
        testService.updateMidFinalGrades(dto);
    }
}

