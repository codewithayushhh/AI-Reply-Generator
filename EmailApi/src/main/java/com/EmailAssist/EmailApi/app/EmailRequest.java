package com.EmailAssist.EmailApi.app;


import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
