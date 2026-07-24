package com.klef.soa.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "doctor_table")

public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "did")
   private long id;
	@Column(name = "dname", length = 100, nullable = false)
   private String name;
	@Column(name="dgender", length = 20, nullable = false)
   private String gender;
	@Column(nullable = false)
   private String specialization;
	@Column(name = "dsalary", nullable = false)
   private double salary;
	@Column(name = "demail", length = 100, nullable = false, unique = true)
   private String email;
	@Column(length = 20, nullable = false, unique = true)
   private String contact;
	@Column(nullable = false)
   private String location;
	@Column(name="dstatus",nullable = false)
   private boolean status;
	@Column(nullable = false)
   private double experience;
	@CreationTimestamp
   private LocalDateTime createdAt;
	@UpdateTimestamp
   private LocalDateTime updateAt;
   
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public double getExperience() {
	return experience;
}
public void setExperience(double experience) {
	this.experience = experience;
}
public LocalDateTime getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}
public LocalDateTime getUpdateAt() {
	return updateAt;
}
public void setUpdateAt(LocalDateTime updateAt) {
	this.updateAt = updateAt;
}
@Override
public String toString() {
	return "Doctor [id=" + id + ", name=" + name + ", gender=" + gender + ", specialization=" + specialization
			+ ", salary=" + salary + ", email=" + email + ", contact=" + contact + ", location=" + location
			+ ", status=" + status + ", experience=" + experience + "]";
}
}
