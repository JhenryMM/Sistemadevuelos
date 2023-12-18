package com.fkyskyvuelos.sistemadevuelos.controller;

import com.fkyskyvuelos.sistemadevuelos.dto.request.ReqUsuarioDto;
import com.fkyskyvuelos.sistemadevuelos.service.IUsuarioService;
import com.fkyskyvuelos.sistemadevuelos.service.UsuarioServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    IUsuarioService usuarioService;

    public UsuarioController (UsuarioServiceImp userService){
        this.usuarioService = userService;
    }

    @PostMapping("/comprar")
    public ResponseEntity<?> guardarCompra(@RequestBody ReqUsuarioDto ReqUsuarioDto){
        return new ResponseEntity<>(usuarioService.guardarCompra(ReqUsuarioDto), HttpStatus.OK);
    }

    @GetMapping("/verUsuarios")
    public ResponseEntity<?> verMiVuelo(){
        return new ResponseEntity<>(usuarioService.obtenerTodos(),HttpStatus.OK);
    }
}
