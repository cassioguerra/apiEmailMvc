package com.example.enviarEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class EnviarEmailApplication {
	@Autowired
	private Email email;

	public static void main(String[] args) {
		SpringApplication.run(EnviarEmailApplication.class, args);
	}


	@EventListener(ApplicationReadyEvent.class)
	public void triggerMain() throws MessagingException {

		email.sendMailWithAttachment("rita",
				"cassio guerra direto da aplicação java ",
				"This is email subject","/Users/arjungautam/Downloads/resume.pdf");

	}
}
