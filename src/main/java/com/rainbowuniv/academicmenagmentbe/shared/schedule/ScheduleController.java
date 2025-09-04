package com.rainbowuniv.academicmenagmentbe.shared.schedule;

import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleCreateReq;
import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleRes;
import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleUpdateReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService service;

    // 월별 조회: /api/schedule?year=2025&month=8
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ScheduleRes>> getByMonth(@RequestParam int year, @RequestParam int month) {
        List<ScheduleRes> list = service.findByMonth(year, month);
        return ResponseEntity.ok(list == null ? List.of() : list);
    }

    // 단건 조회 (선택)
    @GetMapping("/{id}")
    public ResponseEntity<ScheduleRes> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody ScheduleCreateReq req) {
        service.create(req);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody ScheduleUpdateReq req) {
        service.update(req);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
