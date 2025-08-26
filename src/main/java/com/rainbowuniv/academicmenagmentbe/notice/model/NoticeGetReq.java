package com.rainbowuniv.academicmenagmentbe.notice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NoticeGetReq {
    String searchText;
    String type;
}
