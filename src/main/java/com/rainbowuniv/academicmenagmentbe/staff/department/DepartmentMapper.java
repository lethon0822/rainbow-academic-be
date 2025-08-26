package com.rainbowuniv.academicmenagmentbe.staff.department;


import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentGetRes;
import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentPatchReq;
import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentPostReq;
import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    void save(DepartmentPostReq req);
    List<DepartmentGetRes> findAll();
    int modifyDepartment(DepartmentPutReq req);
    void modifyStatus(DepartmentPatchReq req);
}
