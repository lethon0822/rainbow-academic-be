package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;

import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.EnrollmentGradePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnrollmentGradeService {

    private final EnrollmentGradeMapper enrollmentGradeMapper;

    public void updateGrade(EnrollmentGradePutReq req) {
        enrollmentGradeMapper.updateGrade(req);
    }
}
