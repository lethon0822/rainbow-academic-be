package com.rainbowuniv.academicmenagmentbe.user;

import com.rainbowuniv.academicmenagmentbe.user.model.UserGetRes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class UserController {

    private final UserService userService;

    // 개인정보 조회 (공통)
    @PostMapping("/mypage")
    public ResponseEntity<?> getUserInfo(@RequestBody int userId) {
        UserGetRes res = userService.getUserInfo(userId);
        return ResponseEntity.ok(res);
    }

    @PostMapping("/mypage")
    public ResponseEntity<?> getStudentAcademicInfo(@RequestBody int userId){
        UserGetRes res = userService.getStudentAcademicInfo(userId);
        return ResponseEntity.ok(res);
    }
}