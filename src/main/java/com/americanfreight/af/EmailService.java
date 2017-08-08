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

	    public void sendMail(String fromEmail, String subject, String message, String name) {
	        SimpleMailMessage mailMessage = new SimpleMailMessage();
	        mailMessage.setTo(toEmail);
	        mailMessage.setSubject(subject);
	        mailMessage.setText("Name: "+name + "\n \nMessage:\n \n"+message +"\n \neMail: "+fromEmail);
	        mailMessage.setFrom(fromEmail);
	        javaMailSender.send(mailMessage);
	    }
}
