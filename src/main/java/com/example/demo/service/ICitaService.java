package com.example.demo.service;

import java.util.List;
import com.example.demo.Entity.Cita;

public interface ICitaService {

	public List<Cita> listar();
	public List<Cita> listarPorPaciente(Long id);
    public Cita buscar(Long id);
    public Cita guardar(Cita administrador);
    public void eliminar(Long id);
}
