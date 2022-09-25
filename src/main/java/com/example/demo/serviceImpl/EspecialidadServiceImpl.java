package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Especialidad;
import com.example.demo.dao.IEspecialidadDAO;
import com.example.demo.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService {

	@Autowired
	private IEspecialidadDAO especialidadDao;
	@Override
	public List<Especialidad> listar() {
		return especialidadDao.findAll();
	}

}
