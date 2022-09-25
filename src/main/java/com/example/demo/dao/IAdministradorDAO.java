package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Administrador;

public interface IAdministradorDAO extends JpaRepository<Administrador,Long>{

	public Administrador findByUsuarioAndContrasenia(String usuario,String contrasenia);
	
	public Administrador findByUsuario(String usuario);
}
