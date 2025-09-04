package com.rainbowuniv.academicmenagmentbe.student.sugang;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.student.sugang.model.MySugangListRes;
import com.rainbowuniv.academicmenagmentbe.student.sugang.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.student.sugang.model.currentMySugangListReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> findAllMySugangCourses(HttpServletRequest httpReq, @ModelAttribute currentMySugangListReq req) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

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

    //연도, 학기별 수강한 강의의 전체 목록 조회
}
