package com.exam.service.impl;

import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	//creating user
	@Override
	public User createUser(User user,Set<UserRole> userRoles) throws Exception{
		
		User local = userRepository.findByUsername(user.getUsername());
		if(local!=null)
		{
			System.out.println("User is already there!!");
			//throw new Exception("User already Present !!");
			
		}else {
			//user create   user ke bhoot sare roles honge or user rolls me nikal ke save kiya role wali class data save kiya 
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			
			//user will asgin the roles 
			user.getUserRoles().addAll(userRoles);
			
			//return krega user roll
			local = this.userRepository.save(user);
			
		}
		
		return local;
		
	}

	
	
	//getting user by username
	
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}



	@Override
	public void deleteUser(Long userId) {
		
		
		// TODO Auto-generated method stub
	   this.userRepository.deleteById(userId);;
		
		
	}
	

}
