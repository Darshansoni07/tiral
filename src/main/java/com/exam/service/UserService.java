package com.exam.service;

import java.util.Set;

import com.exam.entity.User;
import com.exam.entity.UserRole;

public interface UserService {

	//Creating User
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	//get user by username
	public User getUser(String username);
	
	
	//delete user by id
	public void deleteUser(Long userId);
	
	
	//update use by Id Chandani will be impelement living 
	
	
	

}


/* In Web service creating API USER data can send AND  User data  Take  service  */