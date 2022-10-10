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

import com.testsupergiros.demo.models.EmpresaModel;
import com.testsupergiros.demo.services.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	
	@Autowired
    EmpresaService empresaService;
	
	 @GetMapping()
	    public ArrayList<EmpresaModel> obtenerUsuarios(){
	        return empresaService.obtenerEmpresas();
	    }

	    @PostMapping()
	    public EmpresaModel guardarUsuario(@RequestBody EmpresaModel Empresa){
	        return this.empresaService.guardarEmpresa(Empresa);
	    }

	    @GetMapping( path = "/{nit}")
	    public Optional<EmpresaModel> obtenerRolPorId(@PathVariable("nit") int nit) {
	        return this.empresaService.obtenerPorId(nit);
	    }

	    @DeleteMapping( path = "/{nit}")
	    public String eliminarPorNit(@PathVariable("nit") int nit){
	        boolean ok = this.empresaService.eliminarEmpresa(nit);
	        if (ok){
	            return "Se eliminó el usuario con id " + nit;
	        }else{
	            return "No pudo eliminar el usuario con id" + nit;
	        }
	    }

}
