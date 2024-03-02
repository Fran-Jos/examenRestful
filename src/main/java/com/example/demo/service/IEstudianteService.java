package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;


public interface IEstudianteService {
		
	//CRUD TO
	public void guardarTO(EstudianteTO estudiante);
	//public List<EstudianteTO> buscarTodosTO();
	public EstudianteTO buscarTO(Integer id);

}
