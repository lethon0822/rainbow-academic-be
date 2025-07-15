package com.rainbowuniv.academicmenagmentbe.course;

import com.rainbowuniv.academicmenagmentbe.course.model.CourseReq;

public interface CourseMapper {
    int courseFindById(CourseReq p);
}
