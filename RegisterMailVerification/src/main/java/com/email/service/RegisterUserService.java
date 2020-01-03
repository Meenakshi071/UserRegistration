package com.email.service;

import java.util.List;
import com.email.dao.UserDao;
import com.email.models.User;
import com.email.util.UserValidator;

public class RegisterUserService {
	UserDao userdao = new UserDao();

	// service method starts
	public String registerUser(User user) {
		String emailResponse = null;
		try {
			// validating user's email format starts
			boolean checkValidationResult = UserValidator.validateUserEmail(user.getEmailId());
			if (!checkValidationResult) {
				emailResponse = "Enter a valid Email!";
			}
			// getting userlist from in memory DAO
			else {
				List<User> userList = userdao.getAllRegisteredUser();

				// checking if email exists or not
				boolean isExistingEmail = UserValidator.isEmailExist(user.getEmailId(), userList);
				if (isExistingEmail) {
					emailResponse = "Email already exists!";

				}
				// adding user and sending verification code
				else {
					userdao.addNewUser(user);
					emailResponse = "Email successfully Verified and Registered!";

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return emailResponse;

	}

}
