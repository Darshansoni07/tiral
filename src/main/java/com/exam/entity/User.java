package com.exam.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
 	private Long id;
	private String username;
	private String passward;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;	
	private boolean enabled=true;
	private String profile;
	
	
	
	//har ek user ke pass me multiple roles hoskte h ,mtlb, single user h many roles ho skte h 
	//user many roles  so we use LIST  or  #SET                 /*MappedBy nhi likhe ge to ek or table create hojye gi */
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
	@JsonIgnore /*Circulate dependency create nhi ho isliye isko create kre ge */
	private Set<UserRole> userRoles=new HashSet<>();
	
	
	
	
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}


	
	
	
	
	//Defoualt constructor
	public User() {
		
	}
	
	
	// Perameterized Constructor	

	public User(Long id, String username, String passward, String firstname, String lastname, String email,
			String phone, boolean enabled, String profile) {
		super();
		this.id = id;
		this.username = username;
		this.passward = passward;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.profile = profile;
	}






	public String getProfile() {
		return profile;
	}



	public void setProfile(String profile) {
		this.profile = profile;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
}
