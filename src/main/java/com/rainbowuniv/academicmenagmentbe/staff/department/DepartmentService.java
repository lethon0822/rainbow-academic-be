package com.rainbowuniv.academicmenagmentbe.staff.department;


import com.rainbowuniv.academicmenagmentbe.staff.department.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentMapper departmentMapper;

    //TODO 예외처리
    // 예외 처리 메소드 따로 만들고 호출 saveDept, updateDept


    public void saveDept(DepartmentPostReq req){

        departmentMapper.save(req);
    }

    public List<DepartmentGetRes> findAllDepartment(DepartmentGetReq req){
        return departmentMapper.findAll(req);
    }

    public List<DepartmentHeadName> findDeptHead(int deptId){
        return departmentMapper.findUserByDeptId(deptId);
    }

    public void updateDept(DepartmentPutReq req){
        int result = departmentMapper.modifyDepartment(req);
    }

    public void updateStatus(DepartmentPatchReq req){
        departmentMapper.modifyStatus(req);
    }
}
