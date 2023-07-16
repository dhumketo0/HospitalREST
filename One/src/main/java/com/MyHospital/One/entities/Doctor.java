package com.MyHospital.One.entities;

import jakarta.persistence.*;

@Table(name="Staff")
@Entity
public class Doctor extends StaffEntity {

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

    
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int uid, String username, String password, String name, String role, Double salary) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.salary=salary;
	}
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

	@Override
	public Double getSalary() {
		// TODO Auto-generated method stub
		return salary;
		
	}

	public int getuid() {
		return uid;
	}

	public void setuid(int uid) {
		this.uid = uid;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
