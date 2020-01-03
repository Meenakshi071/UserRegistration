package com.email.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.email.models.User;
import com.email.service.RegisterUserService;

@Path("/register")
public class EmailController {
	RegisterUserService service = new RegisterUserService();

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/email")
	public String registerUser(User user) {
		return service.registerUser(user);
	}

}
