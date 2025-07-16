package com.rainbowuniv.academicmenagmentbe.course;


import com.rainbowuniv.academicmenagmentbe.course.model.CourseGetReq;
import com.rainbowuniv.academicmenagmentbe.course.model.CourseGetRes;
import com.rainbowuniv.academicmenagmentbe.course.model.CoursePostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/rainbowuniv.ac.kr/course")
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    public int saveCourse(@RequestBody CoursePostReq req){
        int user = 10001;
        req.setUserId(user);
        int result = courseService.saveCourse(req);
        return result;
    }
    @GetMapping
    public List<CourseGetRes> findMyCourse(CourseGetReq req){
        int user = 10001;
        req.setUserId(user);
        List<CourseGetRes> result = courseService.findMyCourse(req);
        return result;
    }
}
