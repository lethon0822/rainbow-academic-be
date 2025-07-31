package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;

import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnrollmentGradeMapper {
    // 성적 저장 (UPDATE)
    void enrollmentGrade(GradePutReq req);

    List<GradePutReq> getStudentsByCourseId(Long courseId);
}
