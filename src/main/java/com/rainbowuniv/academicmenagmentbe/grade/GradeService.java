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

    // --------------------------------- 성적 조회 부분 아래 코드로 전면 수정-------------------------------------//

    // res의 등급으로부터 평점 set 하기 위함
    private double convertRankToPoint(String rank) {
        if (rank == null) return 0.0;

        return switch (rank) {
            case "A+" -> 4.5;
            case "A"  -> 4.0;
            case "B+" -> 3.5;
            case "B"  -> 3.0;
            case "C+" -> 2.5;
            case "C"  -> 2.0;
            case "D+" -> 1.5;
            case "D"  -> 1.0;
            case "F"  -> 0.0;
            default   -> 0.0;
        };
    }

    // 영구 성적 조회
    public List<GetAllPermanentGradeRes> getAllPermanentGrade(long userId, GetAllPermanentGradeReq req) {
        List<GetAllPermanentGradeRes> res = gradeMapper.getAllPermanentGrade(userId, req);

        for (GetAllPermanentGradeRes item : res){
            // res의 등급으로부터 평점 set 하기 위함
            item.setPoint(convertRankToPoint(item.getRank()));
        }
        return res;
    }

    // 금학기 성적 조회
    public List<GetMyCurrentGradeRes> getMyCurrentGrades(long userId, int semesterId){

        List<GetMyCurrentGradeRes> res = gradeMapper.getMyCurrentGrades(userId, semesterId);

        for (GetMyCurrentGradeRes item : res){
            // 만약 강의 평가를 안 했다면 특정 정보를 숨기기 위해 null 셋팅
            if(item.getEvScore()==null){
                item.setAttendanceScore(null);
                item.setFinScore(null);
                item.setMidScore(null);
                item.setRank(null);
                item.setOtherScore(null);
                item.setPoint(null);
            }else{
                // 강의 평가를 했다면 실제 성적 공개
                // res의 등급으로부터 평점 set 하기 위함
                item.setPoint(convertRankToPoint(item.getRank()));

            }
        }

        return res;
    }




}