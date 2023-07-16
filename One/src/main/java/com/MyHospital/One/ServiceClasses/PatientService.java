package com.MyHospital.One.ServiceClasses;

import java.util.List;
import com.MyHospital.One.entities.Patient;

public interface PatientService {
	Patient AddPatient(Patient p);
	List<Patient> getAllPatients();
	
	Patient getPatient(Integer uid);
	
	Patient discharge(Patient p);
}
