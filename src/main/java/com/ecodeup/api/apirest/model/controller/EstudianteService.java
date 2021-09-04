package com.ecodeup.api.apirest.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ecodeup.api.apirest.model.Estudiante;

@Service
public class EstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	
	public void guardar(Estudiante estudiante) {
		
		estudianteRepository.save(estudiante);
		
	}
	
	
	public List<Estudiante> obtenerTodos(){
		
		return estudianteRepository.findAll();
		
	}
	
	
	
	public Estudiante obtenerEstudiante(Integer id){
		
		return estudianteRepository.getOne(id);
		
	}
	
	
	public void actualizar(Estudiante estudiante){
		
		estudianteRepository.save(estudiante);
		
	}
	
	public void eliminar(Integer id){
		
		estudianteRepository.deleteById(id);
		
	}
	
	
	
	
	
	

}
