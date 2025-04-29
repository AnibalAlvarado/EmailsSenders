package com.example.emailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.emailSender.services.emailService;

@RestController
@CrossOrigin(origins = "http://localhost:4200"/* "http://172.30.0.143:4300"*/)
public class emailController {

    @Autowired
    private emailService emailService;

    @GetMapping("/email")
    public String sendBasicEmail(){
        emailService.basicEmail();
        return "Email enviado";
    }

     @GetMapping("/advancedEmail/{email}")
    public String advancedEmail(@PathVariable String email) {
        emailService.advancedEmail(email);
        return "mail sent successfully";
    }

    @GetMapping("/newAccountEmail/{email}")
    public String newAccountEmail(@PathVariable String email) {
        emailService.newAccountEmail(email);
        return "mail sent successfully";
    }

    @GetMapping("/forgotPasswordEmail/{email}")
    public String forgotPasswordEmail(@PathVariable String email) {
        emailService.forgotPasswordEmail(email);
        return "mail sent successfully";
    }

    @GetMapping("/activationEmailWithCode/{email}")
    public String activationEmailWithCode(@PathVariable String email) {
        emailService.activationEmailWithCode(email);
        return "mail sent successfully";
    }

    @GetMapping("/changedPasswordNotification/{email}")
    public String changedPasswordNotification(@PathVariable String email) {
        emailService.changedPasswordNotification(email);
        return "mail sent successfully";
    }

    @GetMapping("/lockStockNotification/{email}")
    public String lockStockNotification(@PathVariable String email) {
        emailService.lockStockNotification(email);
        return "mail sent successfully";
    }

    @GetMapping("/purchaseNotification/{email}")
    public String purchaseNotification(@PathVariable String email) {
        emailService.purchaseNotification(email);
        return "mail sent successfully";
    }
}