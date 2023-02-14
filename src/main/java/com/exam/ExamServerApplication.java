package com.exam;

//import java.util.HashSet;
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Starting code");
		// TODO Auto-generated method stub
		
		//User object created there
//		User user = new User();
//		user.setFirstname("Darshan");
//		user.setLastname("Soni");
//		user.setUsername("Darshan5011");
//		user.setPassward("abc");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(40L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 =this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
		
	}
	
	
}
