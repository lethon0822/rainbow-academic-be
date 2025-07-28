package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;


import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnrollmentGradeService {
    private final EnrollmentGradeMapper enrollmentGradeMapper;

    public void EnrollmentGrade(GradePutReq req) {

        enrollmentGradeMapper.enrollmentGrade(req);
    }
}
