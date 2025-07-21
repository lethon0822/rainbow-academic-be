package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.GradeUpdateReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GradeMapper {
    void updateGrade(GradeUpdateReq req);
}
