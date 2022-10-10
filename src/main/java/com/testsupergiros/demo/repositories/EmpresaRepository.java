package com.testsupergiros.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testsupergiros.demo.models.EmpresaModel;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaModel,Integer>{

}
