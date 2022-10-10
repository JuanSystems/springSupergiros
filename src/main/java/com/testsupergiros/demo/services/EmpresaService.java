package com.testsupergiros.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.testsupergiros.demo.models.EmpresaModel;
import com.testsupergiros.demo.repositories.EmpresaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
	@Autowired
    EmpresaRepository empresaRepository;
	
	 public ArrayList<EmpresaModel> obtenerEmpresas(){
	        return (ArrayList<EmpresaModel>) empresaRepository.findAll();
	    }

	    public EmpresaModel guardarEmpresa(EmpresaModel Empresa){
	        return empresaRepository.save(Empresa);
	    }

	    public Optional<EmpresaModel> obtenerPorId(int nit){
	        return empresaRepository.findById(nit);
	    }

	   
	    public boolean eliminarEmpresa(int nit) {
	        try{
	           empresaRepository.deleteById(nit);
	            return true;
	        }catch(Exception err){
	            return false;
	        }
	    }
}
