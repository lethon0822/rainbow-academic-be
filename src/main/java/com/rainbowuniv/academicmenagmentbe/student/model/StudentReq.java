package com.rainbowuniv.academicmenagmentbe.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class StudentReq {
    private int userId; // 학생 고유 ID
    private int deptId; // 학과 ID
    private Integer grade; // 학년
    private String semester; // 학기
    private String status; // 상태 (예: 재학, 휴학 등)
}

