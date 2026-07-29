package com.klef.soa.service;
import java.util.Optional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.Doctor;
import com.klef.soa.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService 
{
	@Autowired
	private DoctorRepository repo;

	@Override
	public Doctor addDoctor(Doctor d) {
		 return repo.save(d);
	}

	@Override
	public Doctor updateDoctor(Doctor d) {
		Optional<Doctor>optional= repo.findById(d.getId());
		if(optional.isPresent())
		{
			Doctor doctor=optional.get();
			doctor.setName(d.getName());
			doctor.setSalary(d.getSalary());
			doctor.setExperience(d.getExperience());
			doctor.setContact(d.getContact());
			return repo.save(doctor);
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public List<Doctor> displayAllDoctors() {
		return repo.findAll();
	}

	@Override
	public Doctor displayDoctorById(Long id)
	{
	    return repo.findById(id).orElse(null);
	}

	@Override
	public String deleteDoctorById(Long id) {
	boolean flag = repo.existsById(id);
	if(flag)
	{
		repo.deleteById(id);
		return "Doctor Deleted Successfully";
	}
	else
	{
		return "Doctor ID not found";
	}
	}

	@Override
	public List<Doctor> displayDoctorByGender(String gender) 
	{
		return repo.findByGender(gender);
	}

	@Override
	public Doctor displayDoctorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDoctorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long doctorCount() {
		return repo.count();	}
   
}
