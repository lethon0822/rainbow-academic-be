package com.rainbowuniv.academicmenagmentbe.staff.department;


import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentGetRes;
import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentPatchReq;
import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentPostReq;
import com.rainbowuniv.academicmenagmentbe.staff.department.model.DepartmentPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentMapper departmentMapper;


    public void saveDept(DepartmentPostReq req){
        departmentMapper.save(req);
    }

    public List<DepartmentGetRes> findAllDepartment(){
        return departmentMapper.findAll();
    }

    public void updateDept(DepartmentPutReq req){
        int result = departmentMapper.modifyDepartment(req);
    }

    public void updateStatus(DepartmentPatchReq req){
        departmentMapper.modifyStatus(req);
    }
}
