package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Especialidad;
import com.example.demo.service.IEspecialidadService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("especialidad")
public class EspecialidadRestController {
	
	@Autowired
	private IEspecialidadService service;
	
	@GetMapping("/listar")
    public List<Especialidad> findAll(){
	 return service.listar();
 }

}
