package com.klef.soa.service;

import com.klef.soa.entity.Doctor;
import java.util.List;

import com.klef.soa.entity.Doctor;

public interface DoctorService 
{
	Doctor addDoctor(Doctor d);
	Doctor updateDoctor(Doctor d);
	List<Doctor> displayAllDoctors();
	Doctor displayDoctorById(int id);
	String deleteDoctorById(int id);
	List<Doctor>displayDoctorByGender(String gender);
	
	
	
	
}
