package com.rainbowuniv.academicmenagmentbe.staff.department;


import com.rainbowuniv.academicmenagmentbe.staff.department.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    void save(DepartmentPostReq req);
    List<DepartmentGetRes> findAll(DepartmentGetReq req);
    int modifyDepartment(DepartmentPutReq req);
    void modifyStatus(DepartmentPatchReq req);
}
