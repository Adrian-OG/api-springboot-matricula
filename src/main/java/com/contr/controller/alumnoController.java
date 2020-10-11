package com.contr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contr.entity.alumno;

import com.contr.repository.alumnoRepository;

@RestController
@RequestMapping("/alumnos")
public class alumnoController {
	@Autowired
   public alumnoRepository alumnoRepositorys;
	
  @GetMapping("/all")
  public List<alumno> getAllAlumnos(){
	  return alumnoRepositorys.findAll();
	  
	  
  }
  
  @PostMapping("/create")
  public String createAlumno(@RequestBody alumno a) {
	  alumno insertAlumno = alumnoRepositorys.insert(a);
	return "Alumno Creado "+insertAlumno.getNombre()  ;
	  
  }
  @DeleteMapping("/delete/{id}")
  public String delete(@PathVariable String id) {
	  
	  
	  alumnoRepositorys.deleteById(id);
	 return "el alumno con el id "+id+" fue eliminado";
  }
  
  @PutMapping("/update/{id}")
  public String update(@PathVariable String id,@RequestBody alumno a) {
	  
	  Optional <alumno> alumnos =alumnoRepositorys.findById(id);
		if(alumnos.isPresent()) {
			alumno alumnoupdate = alumnos.get();
			alumnoupdate.setid(a.getid());
			alumnoupdate.setNombre(a.getNombre());
			alumnoupdate.setCodigo(a.getCodigo());;
			alumnoupdate.setDni(a.getDni());
			alumnoupdate.setTelefono(a.getTelefono());
		    alumnoRepositorys.save(a);	
		}  
		  return "ESte id: " +id+ " fue modificado";
	  
  }
}
