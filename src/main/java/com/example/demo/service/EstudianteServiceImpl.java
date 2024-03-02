package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
	@Autowired
	private IEstudianteRepository estudianteRepository;




	@Override
	public EstudianteTO buscarTO(Integer id) {
		// TODO Auto-generated method stub
		return this.convertirEstu(this.estudianteRepository.buscar(id));
	}


	@Override
	public void guardarTO(EstudianteTO estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(this.convertirTO(estudiante));
	}


	

	private EstudianteTO convertirEstu(Estudiante estudiante) {
		EstudianteTO estudianteTO = new EstudianteTO();
		estudianteTO.setApellido(estudiante.getApellido());
		estudianteTO.setNombre(estudiante.getNombre());
		estudianteTO.setCedula(estudiante.getCedula());
		estudianteTO.setId(estudiante.getId());

		return estudianteTO;
	}

	private Estudiante convertirTO(EstudianteTO estudiante) {
		Estudiante estudianteTO = new Estudiante();
		estudianteTO.setApellido(estudiante.getApellido());
		estudianteTO.setCedula(estudiante.getCedula());
		estudianteTO.setNombre(estudiante.getNombre());
		estudianteTO.setId(estudiante.getId());
		
		return estudianteTO;
	}
}
