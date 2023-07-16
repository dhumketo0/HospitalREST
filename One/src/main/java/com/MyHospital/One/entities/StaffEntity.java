package com.MyHospital.One.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Staff")
@Entity
public class StaffEntity implements Staff {


	 @Id
		@GeneratedValue
	    private int uid;
	    @Column(name="username")
	    private String username;
	    @Column(name="password")
	    private String password;
	    @Column(name ="name")
	    private String name;
	    @Column(name ="role")
	    private String role;
	    @Column(name ="salary")
	    private Double salary;
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRole(String role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
