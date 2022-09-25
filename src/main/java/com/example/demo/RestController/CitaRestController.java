package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Cita;
import com.example.demo.service.ICitaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("cita")
public class CitaRestController {
	@Autowired
	private ICitaService citaService;
	
	 @GetMapping("/listar/{id}")
	 public List<Cita> findAll2(@PathVariable Long id){
		 return citaService.listarPorPaciente(id);
	 }
	 
	 @GetMapping("/buscar/{id}")
	 public Cita buscar(@PathVariable Long id){
		 
		 return citaService.buscar(id);
	 }
	 
	 @PostMapping("/crear")
	 public Cita crear(@RequestBody Cita cita) {
		 return citaService.guardar(cita);
	 }
	 
	 
	 @PutMapping("/editar")
	 public Cita editar(@RequestBody Cita cita) {
		 return citaService.guardar(cita);
		 //return cita;
	 }
	 
	 @GetMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable Long id) {
		 System.out.println(id);
		  citaService.eliminar(id);
		  return "eliminado correctamente";
	 }
	
}
