package com.rainbowuniv.academicmenagmentbe.semester;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SemesterServiceImpl implements SemesterService {
    private final SemesterMapper mapper;
    @Override public Integer findNextSemesterId(int currentId) {
        return mapper.findNextSemesterId(currentId);
    }
}
