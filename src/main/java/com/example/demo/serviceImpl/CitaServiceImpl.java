package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cita;
import com.example.demo.dao.ICitaDAO;
import com.example.demo.service.ICitaService;

@Service
public class CitaServiceImpl implements ICitaService {

	@Autowired
	private ICitaDAO citaDao;

	@Override
	public List<Cita> listar() {
		// TODO Auto-generated method stub
		return citaDao.findAll();
	}

	@Override
	public Cita buscar(Long id) {
		// TODO Auto-generated method stub
		return citaDao.findById(id).orElse(null);
	}

	@Override
	public Cita guardar(Cita cita) {
		// TODO Auto-generated method stub
		return citaDao.save(cita);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		Cita cita=citaDao.findById(id).orElse(null);
		citaDao.delete(cita);

	}

	@Override
	public List<Cita> listarPorPaciente(Long id) {
		// TODO Auto-generated method stub
		return citaDao.listarCitasPorPaciente(id);
	}
}
