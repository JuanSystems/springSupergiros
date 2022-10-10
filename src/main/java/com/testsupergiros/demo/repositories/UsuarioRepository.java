package com.testsupergiros.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testsupergiros.demo.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {
   

}