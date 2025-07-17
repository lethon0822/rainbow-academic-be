package com.rainbowuniv.academicmenagmentbe.course;


import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.course.model.CourseGetReq;
import com.rainbowuniv.academicmenagmentbe.course.model.CourseGetRes;
import com.rainbowuniv.academicmenagmentbe.course.model.CoursePostReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/professor")
public class CourseController {
    private final CourseService courseService;

    //강의 등록
    @PostMapping("/course")
    public int saveCourse(HttpServletRequest httpReq, @RequestBody CoursePostReq req){
        int userId = (int)HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(userId);
        int result = courseService.saveCourse(req);
        return result;
    }

    //신청 현황보기
    @GetMapping("")
    public List<CourseGetRes> findMyCourse(HttpServletRequest httpReq,CourseGetReq req){
        int userId = (int)HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(userId);
        List<CourseGetRes> result = courseService.findMyCourse(req);
        return result;
    }
}
