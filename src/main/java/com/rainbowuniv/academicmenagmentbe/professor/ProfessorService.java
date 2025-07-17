package com.rainbowuniv.academicmenagmentbe.course;


import com.rainbowuniv.academicmenagmentbe.course.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CourseService {
    private final CourseMapper courseMapper;

    public int saveCourse(CoursePostReq req){
     return courseMapper.saveCourse(req);
    }

    public List<CourseGetRes> findMyCourse(CourseGetReq req){
        return courseMapper.findByUserId(req);
    }

}
