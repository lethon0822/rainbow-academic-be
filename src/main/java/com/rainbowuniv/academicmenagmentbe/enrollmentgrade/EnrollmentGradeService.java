package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;


import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollmentGradeService {
    private final EnrollmentGradeMapper enrollmentGradeMapper;

    public void EnrollmentGrade(GradePutReq req) {

        enrollmentGradeMapper.enrollmentGrade(req);
    }
    // 학생 목록 조회 메서드 추가
    public List<GradePutReq> getStudentsByCourseId(Long courseId) {
        return enrollmentGradeMapper.getStudentsByCourseId(courseId);
    }
}
