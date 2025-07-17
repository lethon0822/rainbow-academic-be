package com.rainbowuniv.academicmenagmentbe.student;

import com.rainbowuniv.academicmenagmentbe.student.model.CourseEnrollReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    int courseEnrollment(CourseEnrollReq courseEnrollReq);
}
