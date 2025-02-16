package com.EmailAssist.EmailApi.app;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

///api/email/generate


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGenController {

    public final EmailGenService emailGenService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGenService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
