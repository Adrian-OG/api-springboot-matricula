package com.contr.controller;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.Finishings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.contr.entity.curso;

import com.contr.repository.cursoRepository;


@RestController
@RequestMapping("/cursos")
public class cursoController {
	public curso cursos;
	@Autowired
	   public cursoRepository cursoRepositorys;
	
	 @GetMapping("/all")
	  public List<curso> getAllCursos(){
		  return cursoRepositorys.findAll();
		  
		  
	  }
	  
	  @PostMapping("/create")
	  public String createCurso(@RequestBody curso c) {
		  curso insertCurso = cursoRepositorys.insert(c);
		return "Curso Creado "+insertCurso.getNombre()  ;
		  
	  }
	  @DeleteMapping("/delete/{id}")
	  public String delete(@PathVariable String id) {
		  cursoRepositorys.deleteById(id);
		 return "el curso con el "+id+" fue eliminado";
	  }
	  
	  @PutMapping("/update/{id}")
	  public String update(@RequestBody curso c ,@PathVariable String id) {
		
		Optional <curso> cursos =cursoRepositorys.findById(id);
		if(cursos.isPresent()) {
			curso cursoupdate = cursos.get();
			cursoupdate.setid(c.getid());
			cursoupdate.setNombre(c.getNombre());
			cursoupdate.setCreditos(c.getCreditos());
		    cursoRepositorys.save(c);	
		}  
		  return "ESte id: " +id+ " fue modificado";
		  
	  }
}
