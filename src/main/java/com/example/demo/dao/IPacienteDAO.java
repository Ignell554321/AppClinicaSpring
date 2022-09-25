package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Paciente;

public interface IPacienteDAO extends JpaRepository<Paciente,Long>{

}
