package com.rainbowuniv.academicmenagmentbe.student.grade;

import com.rainbowuniv.academicmenagmentbe.student.grade.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface GradeMapper {


    // ------------------영구 성적 조회  --------------- //
    List<GetAllPermanentGradeRes> getAllPermanentGrade(@Param("userId") long userId, @Param("req") GetAllPermanentGradeReq req);

    // --------------- 금학기 성적 조회 ----------------- //
    List<GetMyCurrentGradeRes> getMyCurrentGrades(long userId, int semesterId);

}
