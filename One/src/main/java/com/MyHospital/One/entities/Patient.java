package com.MyHospital.One.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Table(name="Patient")
@Entity
public class Patient {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int patientId;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "age")
	    private int age;

	    @Column(name = "room")
	    private String room;

	    @Column(name = "doctor_name")
	    private String doctorName;

	    @Column(name = "admit_date")
	    private LocalDate admitDate;

	    @Column(name = "expenses")
	    private double expenses;

	    @Enumerated(EnumType.STRING)
	    @Column(name = "status")
	    private Status status;
    // Default constructor (required for JPA)
    public Patient() {
    }

    // Constructor
    public Patient(int patientId, String name, int age, String room, String doctorName, LocalDate admitDate, double expenses, Status status) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.room = room;
        this.doctorName = doctorName;
        this.admitDate = admitDate;
        this.expenses = expenses;
        this.status = status;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public LocalDate getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(LocalDate admitDate) {
        this.admitDate = admitDate;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
