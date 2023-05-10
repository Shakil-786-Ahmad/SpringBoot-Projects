package com.bkc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.bkc.service.MailService;

@SpringBootApplication
public class MailDemoApplication {

	@Autowired
	private MailService mailService;
	
	public static void main(String[] args) {
		SpringApplication.run(MailDemoApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		mailService.sendMail("shakilahmadboss1@gmail.com", "So Happy to send this mail", "Hi Shakil, I have been trying to send you mail through java application but never successfull. Today using SpringBoot I am sending mail and it is being successfully sent.");
		System.out.println("Mail Sent....");
	}

}
