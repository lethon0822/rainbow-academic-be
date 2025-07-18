package com.rainbowuniv.academicmenagmentbe.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

        private int save;
        private int userId;
        private String name;
        private String address;
        private String phone;
        private String email;
        private String role; // 사용자 역할 (student, professor 등)

        private StudentInfo studentInfo;


        //학생전용
        @Getter
        @Setter
        public static class StudentInfo {
            private String BirthCredit;
            private int  TotalCredit;
            private int  GetCredit;
        }


}

