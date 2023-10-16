package com.example.platformtermproject.model;

import lombok.Data;
import org.springframework.stereotype.Component;

//사용자가 입력하는 code 객체

public class Code {
   private String content = "System.out.println(\"정답\");";
   public String getContent(){
      return content;
   }

}
