package com.contr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.contr.entity.alumno;


@Repository
public interface alumnoRepository extends MongoRepository< alumno, String>{


}
