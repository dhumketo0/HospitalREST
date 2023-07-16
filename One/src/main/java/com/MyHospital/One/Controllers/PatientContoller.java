package com.MyHospital.One.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.MyHospital.One.ServiceClasses.PatientService;
import com.MyHospital.One.entities.Patient;

public class PatientContoller {
    @Autowired
    private PatientService patientService;
	 @PostMapping("/patients/admit")
	    public ResponseEntity<String> admitPatient(@RequestBody Patient patient) {
	        patientService.AddPatient(patient);
	    	return ResponseEntity.ok("Patient admitted successfully");
	    }

	    @GetMapping("/patients/admitted")
	    public ResponseEntity<List<Patient>> getAllAdmittedPatients() {
	    	System.out.println("you reached here");
	         List<Patient> admittedPatients =patientService.getAllPatients(); // retrieve admitted patients
	        return ResponseEntity.ok(admittedPatients);
	    }

	    @PutMapping("/patients/discharge/{patientId}")
	    public ResponseEntity<String> dischargePatient(@PathVariable int patientId) {

	    	Patient p=patientService.getPatient(patientId);
	    	patientService.discharge(p);
	    	return ResponseEntity.ok("Patient discharged successfully");
	    }
}
