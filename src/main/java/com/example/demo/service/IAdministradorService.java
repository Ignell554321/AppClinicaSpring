package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Administrador;

public interface IAdministradorService {

		public List<Administrador> listar();
	    public Administrador buscar(Long id);
	    public Administrador guardar(Administrador administrador);
	    public Administrador eliminar(Long id);
	    public Administrador buscarPorNombreUsuario(String  usuario,String contrasenia);
	    public Administrador validarRepetido(String  usuario);
}
