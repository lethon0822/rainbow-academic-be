package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;


import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePostReq;
import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class EnrollmentGradeService {
    private final EnrollmentGradeMapper enrollmentGradeMapper;

    // 성적 저장
    public void save (List<GradePostReq> req){
        enrollmentGradeMapper.save(req);
    }

    // 성적 수정
    public void enrollmentGrade(List<GradePutReq> req) {
        for(GradePutReq item : req){
        enrollmentGradeMapper.enrollmentGrade(item);
        }
    }
    // 학생 목록 조회 메서드 추가
    public List<GradePutReq> getStudentsByCourseId(Long courseId) {
        return enrollmentGradeMapper.getStudentsByCourseId(courseId);
    }
}
