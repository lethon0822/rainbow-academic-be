package com.rainbowuniv.academicmenagmentbe.notice;

import com.rainbowuniv.academicmenagmentbe.notice.model.NoticeGetReq;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticeGetRes;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticePostReq;
import com.rainbowuniv.academicmenagmentbe.notice.model.NoticePutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    int insertNoticeByStaff(NoticePostReq req);

    List<NoticeGetRes> selectNoticeByTitleORContent(String searchText);
    List<NoticeGetRes> selectNoticeByTitle(String searchText);
    List<NoticeGetRes> selectNoticeByContent(String searchText);
    NoticeGetRes selectNoticeById(int noticeId);

    int updateNoticeByNoticeId(NoticePutReq req);

    int deleteNoticeByNoticeId(int noticeId);
}
