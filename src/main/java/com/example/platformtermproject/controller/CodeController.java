package com.example.platformtermproject.controller;

import com.example.platformtermproject.model.Code;
import com.example.platformtermproject.model.Solution;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //view를 쓰지 않기 때문에 데이터 값을 바로 리턴
public class CodeController
{

//    코드 입력하면 채점하여 결과를 돌려줌
//        1. code.getContent를 받아서
//        2. 컴파일 프로그램을 실행하고
//        3. 컴파일 결과와 저장된 답을 비교하고
//        4. 결과를 리턴한다.
    @PostMapping("/code/upload")
    public String upload(Code code){
        Solution solution = new Solution();
        String submitCode = code.getContent();
        //컴파일 프로그램 호출 후 출력값을 받음
        String submitCodeResult = "정답";
        if (submitCodeResult == solution.getAnswer()){
            return "정답입니다.";
        }
        else return "틀렸습니다.";


    }
}
