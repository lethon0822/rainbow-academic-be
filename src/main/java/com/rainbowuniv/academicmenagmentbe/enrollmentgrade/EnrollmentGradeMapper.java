package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;

import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnrollmentGradeMapper {

    void enrollmentGrade(GradePutReq req);
}
