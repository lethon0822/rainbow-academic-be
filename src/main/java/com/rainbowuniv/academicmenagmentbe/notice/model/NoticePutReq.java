package com.rainbowuniv.academicmenagmentbe.notice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NoticePutReq {
    int noticeId;
    String title;
    String content;
}
