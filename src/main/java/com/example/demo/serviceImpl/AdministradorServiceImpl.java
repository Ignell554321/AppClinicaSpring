package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Administrador;
import com.example.demo.dao.IAdministradorDAO;
import com.example.demo.dao.IPacienteDAO;
import com.example.demo.service.IAdministradorService;

@Service
public class AdministradorServiceImpl implements IAdministradorService {

	@Autowired
	private IAdministradorDAO administrdorDAO;
	
	@Autowired
	private IPacienteDAO padienteDAO;
	
	@Override
	public List<Administrador> listar() {
		// TODO Auto-generated method stub
		return administrdorDAO.findAll();
	}

	@Override
	public Administrador buscar(Long id) {
		// TODO Auto-generated method stub
		return administrdorDAO.findById(id).orElse(null);
	}

	@Override
	public Administrador guardar(Administrador administrador) {
		// TODO Auto-generated method stub
		padienteDAO.save(administrador.getPaciente());
		
		return administrdorDAO.save(administrador);
	}

	@Override
	public Administrador eliminar(Long id) {
		// TODO Auto-generated method stub
		return administrdorDAO.findById(id).orElse(null);
	}

	@Override
	public Administrador buscarPorNombreUsuario(String  usuario, String contrasenia) {
		// TODO Auto-generated method stub
		return administrdorDAO.findByUsuarioAndContrasenia(usuario, contrasenia);
	}

	@Override
	public Administrador validarRepetido(String usuario) {
		// TODO Auto-generated method stub
		return administrdorDAO.findByUsuario(usuario);
	}

}
