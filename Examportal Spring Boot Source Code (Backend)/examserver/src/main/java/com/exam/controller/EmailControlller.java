package com.exam.Controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSendException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.Smart_Contact_Manager.Service.EmailService;

@RestController
@RequestMapping("/email")
class EmailController {
@Autowired
private EmailService emailService;

// @PostMapping("/sendEmail")
// public ResponseEntity<String> sendEmail(@RequestParam String to,
// @RequestParam String subject,
// @RequestParam String message) {
// if (to == null || to.isEmpty() || subject == null || subject.isEmpty() ||
// message == null || message.isEmpty()) {
// return ResponseEntity.badRequest().body("All fields are required.");
// }
// try {
// emailService.sendEmail(to, subject, message);
// return ResponseEntity.ok("Email sent successfully");
// } catch (MailSendException e) {
// return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed
// to send email: " + e.getMessage());
// }
// }


@PostMapping("/sendEmailWithPdf")
    public ResponseEntity<String> sendEmailWithPdf(
            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String message,
            @RequestParam String filePath) {

        try {
            // Create the file object using the provided file path
            File pdfFile = new File("C:\\Users\\hp\\Downloads\\HARSHAL_RESUME[1] (1).pdf");
            
            // Call the service method to send the email with the PDF attachment
            emailService.sendEmailWithPdf(to, subject, message, pdfFile);

            return ResponseEntity.ok("Email sent successfully with PDF attachment!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to send email: " + e.getMessage());
        }
    }

 }
