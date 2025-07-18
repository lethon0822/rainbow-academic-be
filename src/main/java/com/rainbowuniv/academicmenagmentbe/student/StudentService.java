package com.rainbowuniv.academicmenagmentbe.student;


import com.rainbowuniv.academicmenagmentbe.student.model.CourseEnrollReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentMapper studentMapper;

    public int enrollment(CourseEnrollReq req) {
        return studentMapper.courseEnrollment(req);
    }

}
