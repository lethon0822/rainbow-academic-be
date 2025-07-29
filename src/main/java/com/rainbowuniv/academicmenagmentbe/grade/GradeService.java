package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.*;
import com.rainbowuniv.academicmenagmentbe.sugang.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final GradeMapper gradeMapper;
    private final StudentMapper studentMapper;

    // 성적 간단 조회
    public List<GradeDTO> findBySimpleGrade(GradeSearchReq searchReq) {
        return studentMapper.studentFindById(searchReq);
    }

    // 성적 전체 조회

    public List<GradeBySubjectDTO> getGradesBySubject(Map<String, Object> params) {
        return gradeMapper.gradesbyCourse(params);
    }

    public List<CreditByCategoryDTO> getCreditByCategory(Map<String, Object> params) {
        return gradeMapper.selectCreditByCategory(params);
    }

    public List<SemesterGradeDTO> getSemesterGrades(Map<String, Object> params) {
        return gradeMapper.selectSemesterGradesByUser(params);
    }

}