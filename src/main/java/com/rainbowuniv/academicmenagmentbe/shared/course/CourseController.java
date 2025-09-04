package com.rainbowuniv.academicmenagmentbe.shared.course;
import com.rainbowuniv.academicmenagmentbe.shared.course.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/course")
public class CourseController {
    private final CourseService courseService;

    // 연도 목록을 가져옴
    @GetMapping("/filter/year")
    public ResponseEntity<?> getYear(){
        List<GetYearsRes> result = courseService.getYear();
        return ResponseEntity.ok(result);
    }

    // 학과 목록을 가져옴
    @GetMapping("/filter/department")
    public ResponseEntity<?> getDepartment(){
        List<GetDepartmentRes> result = courseService.getDepartment();
        return ResponseEntity.ok(result);
    }

    // 필터에 따른 강의 조회
    @GetMapping
    public ResponseEntity<?> findAllCourses(@ModelAttribute CourseFilterReq req){
        List<CourseFilterRes> result = courseService.findCoursesByFilter(req);
        return ResponseEntity.ok(result);
    }

    // 강의 계획서 조회
    @GetMapping("/{course_id}")
    public ResponseEntity<?> findByCourseId(@PathVariable("course_id") int courseId){
        CourseGetDetailRes result = courseService.findByCourseId(courseId);
        return ResponseEntity.ok(result);
    }
















}
