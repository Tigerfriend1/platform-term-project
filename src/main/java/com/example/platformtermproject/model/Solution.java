package com.example.platformtermproject.model;

import lombok.Data;

//문제 정답을 담고있다. 이 정답과 제출한 코드의 컴파일 결과가 일치하면 정답

public class Solution {
    private final String answer = "정답";
    public String getAnswer() {
        return answer;
    }
}
