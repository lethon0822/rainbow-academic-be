package com.rainbowuniv.academicmenagmentbe.professor;


import com.rainbowuniv.academicmenagmentbe.account.AccountMapper;
import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.model.*;
import com.rainbowuniv.academicmenagmentbe.profile.model.EnrollStatusReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProfessorService {
    private final ProfessorMapper professorMapper;
    private final AccountMapper accountMapper;

    public int saveCourse(ProfessorPostReq req) {
        //Random random = new Random();
        String courseCode= accountMapper.findDeptCodeByUserId(req.getUserId());
//        for(int i = 0; i<3; i++){
//            courseCode += (char)(random.nextInt(26)+65);
//        }
        for(int i = 0; i <4; i++){
            courseCode += (int)(Math.random()*10);
        }
        req.setCourseCode(courseCode);

        return professorMapper.saveCourse(req);
    }

    public List<ProfessorGetRes> findMyCourse(ProfessorGetReq req) {
        return professorMapper.findByUserId(req);
    }

    // 강의 계획서 수정
    public int modify(ProfessorPutReq req) {
        return professorMapper.modify(req);
    }

    public List<CourseStudentGetReq> courseStudentList(int courseId) {
        return professorMapper.findStudentsByUserId(courseId);
    }

    //학과 조회
    public String deptName(int userId){
        return professorMapper.findDeptNameByUserId(userId);
    }

    //강의평가 조회
    public List<ProfessorSurveyCheckRes> checkSurvey(int courseId){
        return professorMapper.findSurveyByCourseId(courseId);
    }

}
