package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Cita;

public interface ICitaDAO extends JpaRepository<Cita,Long>{

	@Query("select c from Cita c join fetch c.paciente p where p.id=?1")
	public List<Cita> listarCitasPorPaciente(Long id);
}
