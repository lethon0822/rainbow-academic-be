package com.rainbowuniv.academicmenagmentbe.Attendance;

import com.rainbowuniv.academicmenagmentbe.Attendance.model.AttendanceReq;
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
    public ResponseEntity<Integer> checkExist(@RequestBody AttendanceReq req) {
        int count = attendanceService.checkExist(req);
        return ResponseEntity.ok(count);
    }

    // 출결 등록
    @PostMapping
    public ResponseEntity<String> insertAttendance(@RequestBody AttendanceReq req) {
        attendanceService.insertAttendance(req);
        return ResponseEntity.ok("출결 등록 완료");
    }
    // 출결 수정
    @PutMapping
    public ResponseEntity<String> updateAttendance(@RequestBody AttendanceReq req) {
        attendanceService.updateAttendance(req);
        return ResponseEntity.ok("출결 등록 완료");
    }
}