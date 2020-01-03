package com.email.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.email.models.User;
import com.email.controller.EmailController;

public class AppStarter {
	final static Logger logger = Logger.getLogger(AppStarter.class);

	public static void main(String[] args) {
		// configure logger
		BasicConfigurator.configure();
		// entry point: testing the service for email verification: Calling
		// registerUser()
		EmailController ec = new EmailController();
		// User1: setting attributes
		User user1 = new User();
		user1.setName("Amita");
		user1.setPassword("Singh");
		user1.setEmailId("amita@gmail.com");
		logger.info("Registering User1 with following details: Name= " + user1.getName() + " ," + "Password="
				+ user1.getPassword() + " and EmailId=" + user1.getEmailId());
		String userDetails1 = ec.registerUser(user1);
		logger.info("Registering User1 Response: " + userDetails1+"\n");

		// User2: setting attributes
		User user2 = new User();
		user2.setName("Sachin");
		user2.setPassword("Gupta");
		user2.setEmailId("sachin@gmail.com");
		logger.info("Registering User2 with following details: Name= " + user2.getName() + " ," + "Password="
				+ user2.getPassword() + " and EmailId=" + user2.getEmailId());
		String userDetails2 = ec.registerUser(user2);
		logger.info("Registering User2 Response: " + userDetails2+"\n");

		// User3: setting attributes
		User user3 = new User();
		user3.setName("Amita");
		user3.setPassword("Singh");
		user3.setEmailId("amita@gmail.com");
		logger.info("Registering User3 with following details: Name= " + user3.getName() + " ," + "Password="
				+ user3.getPassword() + " and EmailId=" + user3.getEmailId());
		String userDetails3 = ec.registerUser(user3);
		logger.info("Registering User3 Response: " + userDetails3+"\n");

	}
}
