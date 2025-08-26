package com.rainbowuniv.academicmenagmentbe.notice;

import com.rainbowuniv.academicmenagmentbe.notice.model.NoticeGetReq;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticeGetRes;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticePostReq;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticePutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notice")
public class NoticeController {
    private final NoticeService noticeService;

    @PostMapping
    public ResponseEntity<?> postNotice (@RequestBody NoticePostReq req) {
        int result = noticeService.insertNoticeByStaff(req);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping
    public ResponseEntity<?> searchNotice(@RequestParam(value = "search_text", required = false) String searchText) {
        List<NoticeGetRes> result = noticeService.selectNoticeByTitleORContent(searchText);
        return ResponseEntity.ok(result);
    }

    // 제목으로만 검색
    @GetMapping("/title")
    public ResponseEntity<?> searchNoticeByTitle(@RequestParam("search_text") String searchText) {
        List<NoticeGetRes> result = noticeService.selectNoticeByTitle(searchText);
        return ResponseEntity.ok(result);
    }

    // 내용으로만 검색
    @GetMapping("/content")
    public ResponseEntity<?> searchNoticeByContent(@RequestParam("search_text") String searchText) {
        List<NoticeGetRes> result = noticeService.selectNoticeByContent(searchText);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{notice_id}")
    public ResponseEntity<?> putNotice(@PathVariable (name = "notice_id") int noticeId) {
        NoticeGetRes result = noticeService.selectNoticeById(noticeId);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putNotice(@RequestBody NoticePutReq req) {
        int result = noticeService.updateNoticeByNoticeId(req);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteNotice(@RequestParam (name = "notice_id") int noticeId) {
        int result = noticeService.deleteNoticeByNoticeId(noticeId);
        return ResponseEntity.ok().body(result);
    }
}
