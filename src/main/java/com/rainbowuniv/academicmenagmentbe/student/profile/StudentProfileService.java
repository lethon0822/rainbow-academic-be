package com.rainbowuniv.academicmenagmentbe.student.profile;

import com.rainbowuniv.academicmenagmentbe.student.profile.model.StudentProfileInfoRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentProfileService {
    private final StudentProfileMapper studentProfileMapper;

    StudentProfileInfoRes findStudentProfileInfo(long userId){
        return studentProfileMapper.findStudentProfileInfo(userId);
    }
}
