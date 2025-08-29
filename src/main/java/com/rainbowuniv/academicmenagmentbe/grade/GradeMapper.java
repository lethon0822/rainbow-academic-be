package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface GradeMapper {

    // 성적 조회 (간단 조회용)
    List<GradeDTO> findBySimpleGrade(GradeSearchReq searchReq);

    // 성적 전체 조회
    List<GradeBySubjectDTO> gradesbyCourse(Map<String, Object> params);
    List<CreditByCategoryDTO> selectCreditByCategory(Map<String, Object> params);
    List<SemesterGradeDTO> selectSemesterGradesByUser(Map<String, Object> params);

    // ------------------영구 성적 조회  --------------- //
    List<GetAllPermanentGradeRes> getAllPermanentGrade(@Param("userId") long userId, @Param("req") GetAllPermanentGradeReq req);

    // --------------- 금학기 성적 조회 ----------------- //
    List<GetMyCurrentGradeRes> getMyCurrentGrades(long userId, int semesterId);

}
