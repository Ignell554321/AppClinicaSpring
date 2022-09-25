package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Doctor;

public interface IDoctorDAO extends JpaRepository<Doctor,Long>{

}
