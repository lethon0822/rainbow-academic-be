package com.rainbowuniv.academicmenagmentbe.student;

import com.rainbowuniv.academicmenagmentbe.student.model.CourseEnrollReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/student/sugang")
    public ResponseEntity<?> enrollCourse(@RequestBody CourseEnrollReq req, @RequestParam int userId) {
        req.setUserId(userId);
        int result = studentService.enrollment(req);
        return ResponseEntity.ok(result);
    }




}
