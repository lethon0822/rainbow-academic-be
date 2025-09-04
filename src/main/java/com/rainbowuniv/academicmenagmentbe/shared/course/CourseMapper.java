package com.rainbowuniv.academicmenagmentbe.shared.course;
import com.rainbowuniv.academicmenagmentbe.shared.course.model.*;
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

    // 강의 계획서 조회
    CourseGetDetailRes findByCourseId(int courseId);


}
