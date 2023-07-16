package com.MyHospital.One.ServiceClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyHospital.One.Dao.patientRepo;
import com.MyHospital.One.entities.Patient;
import com.MyHospital.One.entities.Status;



@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private patientRepo pr;
	@Override
	public Patient AddPatient(Patient p) {
		// TODO Auto-generated method stub
		p.setStatus(Status.ADMITTED);
		return pr.save(p);
		
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Patient getPatient(Integer uid) {
		// TODO Auto-generated method stub
		return pr.getById(uid);
	}

	@Override
	public Patient discharge(Patient p) {
		// TODO Auto-generated method stub
		p.setStatus(Status.DISCHARGED);
		return pr.save(p);
	}
	

}
