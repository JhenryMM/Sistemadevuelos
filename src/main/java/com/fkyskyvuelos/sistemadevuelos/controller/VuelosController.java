package com.fkyskyvuelos.sistemadevuelos.controller;

import com.fkyskyvuelos.sistemadevuelos.dto.VueloDto;
import com.fkyskyvuelos.sistemadevuelos.dto.response.RespuestaDto;
import com.fkyskyvuelos.sistemadevuelos.service.IVuelosService;
import com.fkyskyvuelos.sistemadevuelos.service.VuelosServiceImp;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VuelosController {
    private IVuelosService service;

    public VuelosController(VuelosServiceImp service){
        this.service = service;
    }

    @PostMapping("/reservar")
    public ResponseEntity<?> agregarReserva(@RequestBody VueloDto vuelo){
        return new ResponseEntity<>(service.guardarReserva(vuelo), HttpStatus.OK);
    }

    @GetMapping("/obtenerTodos")
    public ResponseEntity<?> obtenerTodos(){
        return new ResponseEntity<>(service.buscarTodos(),HttpStatus.OK);
    }
}
