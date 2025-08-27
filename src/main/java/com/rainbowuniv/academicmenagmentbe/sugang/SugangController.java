package com.rainbowuniv.academicmenagmentbe.sugang;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.sugang.model.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/student/sugang")
public class SugangController {
    private final SugangService sugangService;

    @PostMapping
    public ResponseEntity<?> enrollCourse(@RequestBody SugangReq req, HttpServletRequest httpReq) {

        // 프론트에서 수강 신청 버튼을 눌렀을 떄

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(userId);

        return sugangService.handleEnrollCourse(req);

    }

    // 금학기 수강 신청한 과목들 전체 조회
    @GetMapping("current")
    public ResponseEntity<?> findAllMySugangCourses(HttpServletRequest httpReq, currentMySugangListReq req) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

        // 테스트할 때 currentDateTime 조작해보기 위함. 테스트 때는 true로 바꾸고 진행.
        boolean testMode = true;
        int currentDateTime;
        if (testMode) {
            currentDateTime = 20251012; //yyyyMMdd 하드 코딩
        }else { //테스트 모드가 아닐 때는 현재 실제 시간 반영
            currentDateTime = Integer.parseInt(
                    LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))
            );
        }
        int currentSemesterId = sugangService.findCurrentSemesterId(currentDateTime);
        req.setCurrentSemesterId(currentSemesterId);


        List<MySugangListRes> mySugangListRes = sugangService.findAppliedCoursesByUserId(userId, req);
        return ResponseEntity.ok().body(mySugangListRes);
    }

    // 수강 취소
    @DeleteMapping("/cancel/{courseId}")
    public ResponseEntity<?> deleteMySugangCourses(@PathVariable int courseId, HttpServletRequest httpReq) {
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

        int result = sugangService.cancelCourse(courseId, userId);

        if (result > 0) {
            return ResponseEntity.ok().body(result);
        }
        else{
            return ResponseEntity.badRequest().body(result);
        }
    }
}
