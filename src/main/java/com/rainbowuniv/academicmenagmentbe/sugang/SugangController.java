package com.rainbowuniv.academicmenagmentbe.sugang;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangErrorRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangListRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangRes;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
        // ( 중복 수강 신청은 DB에서 유니크로 막아뒀으니 로직 구현 하지 않았음. )

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(userId);



        // 정원 초과 체크
        int remainingSeats = sugangService.checkRemainingSeats(req);
        if (remainingSeats <= 0) {
            SugangErrorRes error = new SugangErrorRes( 4002);
            return ResponseEntity.badRequest().body(error);
        }

        // 정원 초과가 아니라면 수강 신청
        int result = sugangService.enrollment(req);

        // 만약 서버 오류로 수강 신청 실패시 처리
        if(result <= 0){
            SugangErrorRes error = new SugangErrorRes( 5001);
            return ResponseEntity.internalServerError().body(error);
        }

        // 수강 신청 성공. 해당 강의의 잔여 인원을 -1 함
        sugangService.remMinus1(req);

        // 수강 신청 강의 차곡차곡 화면에 뿌리기 위함
        SugangRes res = sugangService.sugangCourseInfo(req);
        return ResponseEntity.ok().body(res);

    }

    // 이번 학기 수강 신청한 과목들 전체 조회
    @GetMapping
    public ResponseEntity<?> findAllMySugangCourses(HttpServletRequest httpReq) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");


        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int currentSemester = (currentMonth <= 6) ? 1 : 2;

        List<SugangListRes> sugangListRes = sugangService.findAppliedCoursesByUserId(userId, currentYear, currentSemester);
        return ResponseEntity.ok().body(sugangListRes);
    }
}
