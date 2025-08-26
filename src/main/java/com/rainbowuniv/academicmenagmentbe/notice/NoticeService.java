package com.rainbowuniv.academicmenagmentbe.notice;

import com.rainbowuniv.academicmenagmentbe.notice.model.NoticeGetReq;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticeGetRes;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticePostReq;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticePutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeMapper noticeMapper;

    public int insertNoticeByStaff (NoticePostReq req){
        return noticeMapper.insertNoticeByStaff(req);
    }

    public List<NoticeGetRes> selectNoticeByTitleORContent (NoticeGetReq req){
        req.setType("all");
        return noticeMapper.selectNoticeByTitleORContent(req);
    }

    public List<NoticeGetRes> selectNoticeByTitle(NoticeGetReq req){
        req.setType("title");
        return noticeMapper.selectNoticeByTitle(req);
    }

    public List<NoticeGetRes> selectNoticeByContent(NoticeGetReq req){
        req.setType("content");
        return noticeMapper.selectNoticeByContent(req);
    }

    public NoticeGetRes selectNoticeById(int noticeId){
        return noticeMapper.selectNoticeById(noticeId);
    }

    public int updateNoticeByNoticeId(NoticePutReq req){
        return noticeMapper.updateNoticeByNoticeId(req);
    }

    public int deleteNoticeByNoticeId(int noticeId){
        return noticeMapper.deleteNoticeByNoticeId(noticeId);
    }
}
