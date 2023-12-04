package com.fkyskyvuelos.sistemadevuelos.controller;

import com.fkyskyvuelos.sistemadevuelos.dto.VueloDto;
import com.fkyskyvuelos.sistemadevuelos.service.IVuelosService;
import com.fkyskyvuelos.sistemadevuelos.service.VuelosServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class VuelosController {
    private IVuelosService service;

    public VuelosController(VuelosServiceImp service){
        this.service = service;
    }

    @PostMapping("/reservar")
    public ResponseEntity<?> agregarReserva(@ResponseBody VueloDto vuelo){
        return new ResponseEntity<>(service.guardarRserva(vuelo), HttpStatus.OK);
    }
}
