package com.rainbowuniv.academicmenagmentbe.course;

import com.rainbowuniv.academicmenagmentbe.course.model.CourseFilterReq;
import com.rainbowuniv.academicmenagmentbe.course.model.CourseFilterRes;
import com.rainbowuniv.academicmenagmentbe.course.model.GetDepartmentRes;
import com.rainbowuniv.academicmenagmentbe.course.model.GetYearsRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping
    public ResponseEntity<?> findAllCourses(@ModelAttribute CourseFilterReq req){
        List<CourseFilterRes> result = courseService.findCoursesByFilter(req);
        return ResponseEntity.ok(result);
    }
















}
