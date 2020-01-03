package com.email.util;

import java.util.List;
import java.util.regex.Pattern;

import com.email.models.User;

public class UserValidator {

	public static boolean validateUserEmail(String email) {
		// validating the fields

		if (email != null) {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
					+ "A-Z]{2,7}$";

			Pattern pat = Pattern.compile(emailRegex);
			return pat.matcher(email).matches();
		}
		return false;
	}
   
	public static boolean isEmailExist(String email, List<User> userList) {
		for (User user : userList) {
			if (user.getEmailId().equalsIgnoreCase(email)) {
				return true;
			}
		}
		return false;
	}
}
