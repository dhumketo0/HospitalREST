package com.MyHospital.One.ServiceClasses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyHospital.One.Controllers.LoginRequest;
import com.MyHospital.One.Dao.hospitalRepo;
import com.MyHospital.One.entities.StaffEntity;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private hospitalRepo hr;
	@Override
	public StaffEntity AddEmloyee(StaffEntity q) {
		// TODO Auto-generated method stub
		return hr.save(q);
		
	}

	@Override
	public List<?> getAllEmployees() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public StaffEntity getEmployee(int uid) {
		// TODO Auto-generated method stub
		return hr.getById(uid);
	}
	
	@Override
	public StaffEntity getEmployeeByUNAME(LoginRequest lr) {
		List<StaffEntity> s=hr.findAll();
		if(s.isEmpty()) {
			System.out.println("NO data in table");
			return null;
		}
		
		return s.stream()
				.filter(x->x.getUsername().equals(lr.getUsername())&&x.getPassword().equals(lr.getPassword()))
				.findFirst().orElse(null);
	}
//	public StaffEntity getEmployee(String uname){
//		return hr.findByUsername(uname);
//	}
}
