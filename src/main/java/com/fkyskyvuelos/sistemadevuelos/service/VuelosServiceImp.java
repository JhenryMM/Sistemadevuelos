package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.repository.IVuelosRepository;
import com.fkyskyvuelos.sistemadevuelos.repository.VuelosRepositoryImp;

public class VuelosServiceImp implements IVuelosService {
    private IVuelosRepository repository;

    public VuelosServiceImp(VuelosRepositoryImp repository){
        this.repository = repository;
    }
}
