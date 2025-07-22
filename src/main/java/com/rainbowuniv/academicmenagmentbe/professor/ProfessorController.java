package com.rainbowuniv.academicmenagmentbe.professor;


import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.professor.model.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    //강의 등록
    @PostMapping("/course")
    public ResponseEntity <?> saveCourse(HttpServletRequest httpReq, @RequestBody ProfessorPostReq req){
        int userId = (int)HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(userId);
        int result = professorService.saveCourse(req);
        return ResponseEntity.ok(result);
    }

    //등록한 강의 보기
    @GetMapping("/course")
    public ResponseEntity <?> findMyCourse(HttpServletRequest httpReq, @ModelAttribute ProfessorGetReq req){
        int userId = (int)HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(userId);
        log.info("야아아악:{}",req);
        List<ProfessorGetRes> result = professorService.findMyCourse(req);
        return ResponseEntity.ok(result);
    }

    //강의별 학생 리스트 조회
    @GetMapping("/student")
    public ResponseEntity<?> courseStudentList(@RequestParam("course_id") int courseId){
        List<CourseStudentGetReq> result = professorService.courseStudentList(courseId);
        return ResponseEntity.ok(result);

    }


    //강의 계획서 수정
    @PutMapping("/course")
    public ResponseEntity<?> modify(@RequestBody ProfessorPutReq req){
        int result = professorService.modify(req);
        return ResponseEntity.ok(result);
    }



}
