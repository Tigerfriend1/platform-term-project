package com.example.platformtermproject.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

public class CodeRequest {
    @Data
    public static class codeDTO{
        @NotEmpty
        private String content;
    }
}
