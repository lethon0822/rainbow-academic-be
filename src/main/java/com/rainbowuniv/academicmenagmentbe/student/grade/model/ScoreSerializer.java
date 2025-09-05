package com.rainbowuniv.academicmenagmentbe.student.grade.model;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

// Number 타입(Integer, Double 등)을 JSON으로 변환할 때 null이면 "-"로 내려주기
public class ScoreSerializer extends JsonSerializer<Number> {

    //mid_score, fin_score 등 일부 필드의 경우 조건에 따라 데이터 타입이 Integer 혹은 String으로 바뀌기 때문에

    @Override
    public void serialize(Number value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString("-"); // 강평 안 했을 때는 숫자를 "-" 문자열로 출력
        } else {
            gen.writeNumber(value.toString()); // 강평 완료시 성적을 숫자 그대로 출력
        }
    }
}