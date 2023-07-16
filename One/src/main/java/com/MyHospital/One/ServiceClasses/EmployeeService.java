package com.MyHospital.One.ServiceClasses;

import java.util.List;

import com.MyHospital.One.Controllers.LoginRequest;
import com.MyHospital.One.entities.StaffEntity;

public interface EmployeeService {
	StaffEntity AddEmloyee(StaffEntity q);
	
	List<?> getAllEmployees();
	StaffEntity getEmployee(int uid);

	StaffEntity getEmployeeByUNAME(LoginRequest req);

}
