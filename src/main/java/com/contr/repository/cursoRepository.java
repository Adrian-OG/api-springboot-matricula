package com.contr.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.contr.entity.curso;


@Repository
public interface cursoRepository extends MongoRepository<curso, String>{
	

}
