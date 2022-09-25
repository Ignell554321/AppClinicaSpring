package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.dao.IDoctorDAO;
import com.example.demo.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorDAO doctorDAO;
	@Override
	public List<Doctor> listar() {
		// TODO Auto-generated method stub
		return doctorDAO.findAll();
	}

}
