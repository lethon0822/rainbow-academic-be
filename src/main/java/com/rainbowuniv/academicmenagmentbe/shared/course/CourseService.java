package com.rainbowuniv.academicmenagmentbe.shared.course;
import com.rainbowuniv.academicmenagmentbe.shared.course.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseMapper courseMapper;

    public List<GetYearsRes> getYear(){
        return courseMapper.findAllYear();
    }

    public List<GetDepartmentRes> getDepartment(){
        return courseMapper.findAllDepartment();
    }

    public List<CourseFilterRes> findCoursesByFilter(CourseFilterReq req){
        return courseMapper.findCoursesByFilter(req);
    }

    public CourseGetDetailRes findByCourseId(int courseId){
        return courseMapper.findByCourseId(courseId);
    }

}
