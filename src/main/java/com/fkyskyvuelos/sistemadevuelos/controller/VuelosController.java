package com.fkyskyvuelos.sistemadevuelos.controller;

import com.fkyskyvuelos.sistemadevuelos.service.IVuelosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VuelosController {
    @Autowired
    private IVuelosService vuelosService;

    @GetMapping("/verVuelos")
    public ResponseEntity<?> obtenerTodos(){
        return new ResponseEntity<>(vuelosService.buscarTodos(),HttpStatus.OK);
    }




}
