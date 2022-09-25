package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.service.IDoctorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("doctor")
public class DoctroRestController {

	@Autowired
	private IDoctorService service;
	
	 @GetMapping("/listar")
	    public List<Doctor> findAll(){
		 return service.listar();
	 }
	 
	 @PostMapping("/crear")
	 public Doctor crear(@RequestBody Doctor doctor) {
		 return doctor;
	 }
}
