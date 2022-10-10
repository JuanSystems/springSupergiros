package com.testsupergiros.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.testsupergiros.demo.models.RolesModel;
import com.testsupergiros.demo.repositories.RolesRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesService {
	
	@Autowired
    RolesRepository rolesRepository;
	
	 public ArrayList<RolesModel> obtenerRoles(){
	        return (ArrayList<RolesModel>) rolesRepository.findAll();
	    }

	    public RolesModel guardarRol(RolesModel rol){
	        return rolesRepository.save(rol);
	    }

	    public Optional<RolesModel> obtenerPorId(int id){
	        return rolesRepository.findById(id);
	    }

	   
	    public boolean eliminarRol(int id) {
	        try{
	           rolesRepository.deleteById(id);
	            return true;
	        }catch(Exception err){
	            return false;
	        }
	    }

}
