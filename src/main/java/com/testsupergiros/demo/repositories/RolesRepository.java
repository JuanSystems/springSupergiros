package com.testsupergiros.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testsupergiros.demo.models.RolesModel;


@Repository
public interface RolesRepository extends CrudRepository<RolesModel,Integer>{

}
