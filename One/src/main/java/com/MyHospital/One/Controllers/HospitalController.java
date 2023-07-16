package com.MyHospital.One.Controllers;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MyHospital.One.ServiceClasses.EmployeeService;
import com.MyHospital.One.ServiceClasses.EmployeeServiceImpl;
import com.MyHospital.One.ServiceClasses.PatientService;
import com.MyHospital.One.ServiceClasses.PatientServiceImpl;
import com.MyHospital.One.entities.Patient;
import com.MyHospital.One.entities.StaffEntity;


@RestController
@RequestMapping("/HospitalCentral")
public class HospitalController {
    @Autowired
    private PatientService patientService;

    @Autowired
    private EmployeeService staffService;
    
    @GetMapping("/Home")
    public String WelcomePage() {
    	return "welcome to vedantta";
    }
    
    @RequestMapping(value ="/login", method=RequestMethod.GET)
    public String LoginPage() {
    	return "front.jsp";
    }
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest req){
//		String sid=req.getUsername();
//		String Pass=req.getPassword();
//		StaffEntity s=staffService.getEmployeeByUNAME(req);
//			    if (s != null) {
//			        String redirectUrl = "https://example.com/redirect"; // Replace with the desired URL
//			        HttpHeaders headers = new HttpHeaders();
//			        headers.setLocation(URI.create(redirectUrl));
//			        return new ResponseEntity<>(headers, HttpStatus.FOUND);
//			    }
//
//			    // Return an appropriate response if 's' is null
//			    // For example, you can return an error message
//			    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid credentials");
//
//    	
//    }

//    @PostMapping("/staff/signup")
//    public ResponseEntity<Staff> staffSignup(@RequestBody Staff staff) {
//    	return ResponseEntity.status(HttpStatus.CREATED).body(staffService.AddEmloyee(staff));  	
//    }
//
////    @PostMapping("/staff/login")
////    public ResponseEntity<String> staffLogin(@RequestBody LoginRequest loginRequest) {
////        return ResponseEntity.ok("Staff logged in successfully");
////    }
//
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