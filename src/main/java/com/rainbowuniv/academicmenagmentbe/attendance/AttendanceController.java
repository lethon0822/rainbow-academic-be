package com.rainbowuniv.academicmenagmentbe.attendance;

import com.rainbowuniv.academicmenagmentbe.attendance.model.AttendancePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/professor/course/check")
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;

    // 존재 여부 확인
    @PostMapping("/exist")
    public ResponseEntity<Integer> checkExist(@RequestBody AttendancePutReq req) {
        int count = attendanceService.checkExist(req);
        return ResponseEntity.ok(count);
    }

    // 출결 등록
    @PostMapping
    public ResponseEntity<String> insertAttendance(@RequestBody AttendancePutReq req) {
        attendanceService.insertAttendance(req);
        return ResponseEntity.ok("출결 등록 완료");
    }
    // 출결 수정
    @PutMapping
    public ResponseEntity<String> updateAttendance(@RequestBody AttendancePutReq req) {
        attendanceService.updateAttendance(req);
        return ResponseEntity.ok("출결 등록 완료");
    }
}