package com.example.demo.RestController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Administrador;
import com.example.demo.service.IAdministradorService;

@CrossOrigin(origins = "*")
@RequestMapping("usuario")
@RestController
public class AdministradorRestController {
	
	@Autowired
	private IAdministradorService administradorService;
	
	 @GetMapping("/listar")
	    public List<Administrador> findAll(){
		 return administradorService.listar();
	 }
	 
	 @PostMapping("/acceso")
	  public Long findUsuario( @RequestBody Administrador administrador){
		 
		 Long id=(long) 0;
		 Administrador admin=administradorService.buscarPorNombreUsuario(administrador.getUsuario(),administrador.getContrasenia());
		 if(admin!=null) {
			 id= admin.getPaciente().getId();
		 }
		 return id;

	 }
	 
	 @GetMapping("/buscar/{id}")  
	  public Administrador buscar( @PathVariable Long id){
		 
		 return administradorService.buscar(id);

	 }
	 
	  @GetMapping("/validar/{email}")
	  public Boolean validarCorreo( @PathVariable String email){
		 
		 Boolean existe=false;
		 Administrador admin=administradorService.validarRepetido(email);
		 if(admin!=null) {
			 existe=true;
		 }
		 return existe;

	 }
	 
	 @PostMapping("/crear")
	  public Administrador guardar( @RequestBody Administrador administrador){
		 
		 return administradorService.guardar(administrador);

	 }
	
}
