package com.testsupergiros.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.testsupergiros.demo.models.UsuarioModel;
import com.testsupergiros.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorCedula(int cedula){
        return usuarioRepository.findById(cedula);
    }
   
    public boolean eliminarUsuario(int cedula) {
        try{
            usuarioRepository.deleteById(cedula);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}