package com.testsupergiros.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.testsupergiros.demo.models.UsuarioModel;
import com.testsupergiros.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{cedula}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("cedula") int cedula) {
        return this.usuarioService.obtenerPorCedula(cedula);
    }
    
    @PutMapping("/{cedula}")
    public UsuarioModel actualizar(@PathVariable("cedula") int cedula,@RequestBody UsuarioModel usuario) {
      this.usuarioService.eliminarUsuario(cedula);
      return this.usuarioService.guardarUsuario(usuario);
      
    }

    @DeleteMapping( path = "/{cedula}")
    public boolean eliminarPorId(@PathVariable("cedula") int cedula){
       return this.usuarioService.eliminarUsuario(cedula);
        
    }

}