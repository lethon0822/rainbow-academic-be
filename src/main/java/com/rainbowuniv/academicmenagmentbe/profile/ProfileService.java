package com.rainbowuniv.academicmenagmentbe.profile;

import com.rainbowuniv.academicmenagmentbe.profile.model.ProfileDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProfileService {
    private final ProfileMapper profileMapper;

    // 학생 프로필
    public ProfileDTO findStudentProfile(String loginId) {
        return profileMapper.selectStudentProfile(loginId);
    }
}
