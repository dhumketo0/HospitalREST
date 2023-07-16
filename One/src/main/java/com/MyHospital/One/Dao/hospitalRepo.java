package com.MyHospital.One.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyHospital.One.entities.StaffEntity;

@Repository
public interface hospitalRepo extends JpaRepository<StaffEntity, Integer> {

	StaffEntity findByUsername(String uname);

}
