package com.MyHospital.One.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyHospital.One.entities.Patient;
@Repository
public interface patientRepo extends JpaRepository<Patient, Integer> {
	

}
