package com.rainbowuniv.academicmenagmentbe.user;

import com.rainbowuniv.academicmenagmentbe.user.model.UserDto;
import com.rainbowuniv.academicmenagmentbe.user.model.UserGetReq;
import com.rainbowuniv.academicmenagmentbe.user.model.UserGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public int save(UserDto p){
        return userMapper.save(p);
    }

    // 개인정보 조회 (모든 사용자 공통)
    public UserGetRes getUserInfo(int userId) {
        UserDto dto = userMapper.selectAcademicInfo(userId); // 일반 정보만 조회
        if (dto == null) {
            throw new RuntimeException("사용자를 찾을 수 없습니다.");
        }

        return toUserGetRes(dto);
    }

    // 학적사항 포함 조회 (학생 전용)
    public UserGetRes getStudentAcademicInfo(int userId) {
        UserDto dto = userMapper.selectStudentAcademicInfo(userId); // 학적 포함 조회
        if (dto == null || !"student".equals(dto.getStudentInfo())) {
            throw new RuntimeException("학생 정보가 아닙니다.");
        }

        return toUserGetRes(dto);
    }

    // 공통 + 학적 변환
    private UserGetRes toUserGetRes(UserDto dto) {
        UserGetRes res = new UserGetRes();
        res.setUserId(dto.getUserId());
        res.setName(dto.getName());
        res.setAddress(dto.getAddress());
        res.setPhone(dto.getPhone());
        res.setEmail(dto.getEmail());
        res.setRole(dto.getRole());

        // 학생일 경우에만 학적 필드 설정
        if ("student".equals(dto.getRole()) && dto.getStudentInfo() != null) {
            res.setBirthCredit(dto.getStudentInfo().getBirthCredit());
            res.setTotalCredit(dto.getStudentInfo().getTotalCredit());
            res.setGetCredit(dto.getStudentInfo().getGetCredit());
        }

        return res;
    }


}
