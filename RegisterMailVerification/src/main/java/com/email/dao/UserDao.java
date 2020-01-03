package com.email.dao;

import java.util.ArrayList;
import java.util.List;

import com.email.models.User;

public class UserDao {

	List<User> userList = new ArrayList<User>();

	public List<User> getAllRegisteredUser() {

		return userList;
	}

	public boolean addNewUser(User user) {
		userList.add(user);
		return true;
	}

}
