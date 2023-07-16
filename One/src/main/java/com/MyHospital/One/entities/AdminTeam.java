package com.MyHospital.One.entities;

import jakarta.persistence.*;

@Table(name="Staff")
@Entity
public class AdminTeam extends StaffEntity {
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
