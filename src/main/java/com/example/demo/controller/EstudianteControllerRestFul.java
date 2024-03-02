package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IEstudianteService;
import com.example.demo.service.to.EstudianteTO;


@RestController // Servicio
@RequestMapping(path = "/estudiantes")
@CrossOrigin
//@CrossOrigin(value="http://localhost:8080")
public class EstudianteControllerRestFul {
	

	@Autowired
	private IEstudianteService estudianteService;

	
	@GetMapping(path = "/{id}", produces = "application/json")
	public ResponseEntity<EstudianteTO> buscarTO(@PathVariable() Integer id) {

		EstudianteTO estu =this.estudianteService.buscarTO(id);
		return ResponseEntity.status(240).body(estu);
	}


	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void guardar(@RequestBody EstudianteTO estudiante) {
		this.estudianteService.guardarTO(estudiante);
	}


}
