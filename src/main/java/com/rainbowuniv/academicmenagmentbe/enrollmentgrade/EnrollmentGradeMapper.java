package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;

import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.EnrollmentGradePutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnrollmentGradeMapper {
    void updateGrade(EnrollmentGradePutReq req);
}
