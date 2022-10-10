package com.testsupergiros.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testsupergiros.demo.models.RolesModel;
import com.testsupergiros.demo.services.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {

	@Autowired
    RolesService rolesService;
	
	 @GetMapping()
	    public ArrayList<RolesModel> obtenerUsuarios(){
	        return rolesService.obtenerRoles();
	    }

	    @PostMapping()
	    public RolesModel guardarUsuario(@RequestBody RolesModel rol){
	        return this.rolesService.guardarRol(rol);
	    }

	    @GetMapping( path = "/{id}")
	    public Optional<RolesModel> obtenerRolPorId(@PathVariable("id") int idrol) {
	        return this.rolesService.obtenerPorId(idrol);
	    }

	    @DeleteMapping( path = "/{id}")
	    public String eliminarPorId(@PathVariable("id") int idrol){
	        boolean ok = this.rolesService.eliminarRol(idrol);
	        if (ok){
	            return "Se eliminó el usuario con id " + idrol;
	        }else{
	            return "No pudo eliminar el usuario con id" + idrol;
	        }
	    }
	
}
