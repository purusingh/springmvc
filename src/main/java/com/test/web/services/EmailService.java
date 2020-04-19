package com.test.web.services;

import javax.security.auth.Subject;

import org.springframework.stereotype.Service;

import com.test.web.models.containers.EmailContainer;

@Service
public class EmailService {
	
	public void send(EmailContainer email) {
		System.out.println(email.getEmail() + email.getSubject() + email.getBody());
	}
	
	public void save(EmailContainer email) {
		
		
		
	}

}
