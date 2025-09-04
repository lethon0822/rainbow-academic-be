package com.rainbowuniv.academicmenagmentbe.shared.notice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class NoticeGetReq {
    String searchText;
    String type;
}
