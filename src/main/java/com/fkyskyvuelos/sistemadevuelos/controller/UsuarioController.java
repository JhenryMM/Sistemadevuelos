package com.fkyskyvuelos.sistemadevuelos.controller;

import com.fkyskyvuelos.sistemadevuelos.dto.usuarioDto;
import com.fkyskyvuelos.sistemadevuelos.service.IUsuarioService;
import com.fkyskyvuelos.sistemadevuelos.service.UsuarioServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    IUsuarioService usuarioService;

    public UsuarioController (UsuarioServiceImp userService){
        this.usuarioService = userService;
    }

    @PostMapping("/comprar")
    public ResponseEntity<?> guardarCompra(@RequestBody usuarioDto usuarioDto){
        return new ResponseEntity<>(usuarioService.guardarCompra(usuarioDto), HttpStatus.OK);
    }
}
