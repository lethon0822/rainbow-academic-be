package com.rainbowuniv.academicmenagmentbe.semester;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/semesters")
@RequiredArgsConstructor
public class SemesterController {
    private final SemesterService semesterService;

    @GetMapping("/{id}/next")
    public ResponseEntity<Integer> getNext(@PathVariable int id) {
        Integer nextId = semesterService.findNextSemesterId(id);
        if (nextId == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(nextId);
    }
}