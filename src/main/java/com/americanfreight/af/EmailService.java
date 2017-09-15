package com.americanfreight.af;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	 private JavaMailSender javaMailSender;
	 private final String toEmail ="myszon01@gmail.com";
	    @Autowired
	    public EmailService(JavaMailSender javaMailSender) {
	        this.javaMailSender = javaMailSender;
	    }

	    public void sendMail(String toEmail, String subject, String message, String nameSender) {
	        SimpleMailMessage mailMessage = new SimpleMailMessage();
	        mailMessage.setTo(toEmail);
	        mailMessage.setSubject(subject);
	        mailMessage.setText("sender email: "+nameSender + "\n \nMessage:\n \n"+message +"\n ");
	        mailMessage.setFrom(toEmail);
	        javaMailSender.send(mailMessage);
	    }
}
