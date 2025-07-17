package com.rainbowuniv.academicmenagmentbe.course;


import com.rainbowuniv.academicmenagmentbe.course.model.CourseGetReq;
import com.rainbowuniv.academicmenagmentbe.course.model.CourseGetRes;
import com.rainbowuniv.academicmenagmentbe.course.model.CoursePostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    int saveCourse(CoursePostReq req);
    List<CourseGetRes> findByUserId(CourseGetReq req);
}
