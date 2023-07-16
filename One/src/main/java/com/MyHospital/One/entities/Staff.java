package com.MyHospital.One.entities;

import jakarta.persistence.Entity;


public interface Staff {
	
	//this is a default staff interface for all the employees in the hospital
	   String getUsername();
	    void setUsername(String username);
	    
	    String getPassword();
	    void setPassword(String password);
	    
	    String getName();
	    void setName(String name);
	    
	    String getRole();
	    void setRole(String role);
	   
	    Double getSalary();
	    

}
