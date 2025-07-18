package com.rainbowuniv.academicmenagmentbe.course;

import com.rainbowuniv.academicmenagmentbe.course.model.CourseFilterReq;
import com.rainbowuniv.academicmenagmentbe.course.model.CourseFilterRes;
import com.rainbowuniv.academicmenagmentbe.course.model.GetDepartmentRes;
import com.rainbowuniv.academicmenagmentbe.course.model.GetYearsRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    //연도 목록
    List<GetYearsRes> findAllYear();

    //학과 목록
    List<GetDepartmentRes> findAllDepartment();

    // 올해 개설된 강의 조회
    List<CourseFilterRes> findCoursesByFilter(CourseFilterReq req);
}
