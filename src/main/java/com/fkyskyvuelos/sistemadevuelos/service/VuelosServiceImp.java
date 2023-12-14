package com.fkyskyvuelos.sistemadevuelos.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fkyskyvuelos.sistemadevuelos.dto.VueloDto;
import com.fkyskyvuelos.sistemadevuelos.dto.response.RespuestaDto;
import com.fkyskyvuelos.sistemadevuelos.entity.Vuelo;
import com.fkyskyvuelos.sistemadevuelos.repository.IVuelosRepository;
import com.fkyskyvuelos.sistemadevuelos.repository.VuelosRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VuelosServiceImp implements IVuelosService {
    private IVuelosRepository repository;

    public VuelosServiceImp(VuelosRepositoryImp repository){
        this.repository = repository;
    }

    @Override
    public RespuestaDto guardarReserva(VueloDto vuelo) {
        ObjectMapper mapper = new ObjectMapper();
        Vuelo vueloEntity = mapper.convertValue(vuelo,Vuelo.class);
        Vuelo respuestaRepo = repository.save(vueloEntity);
        if (respuestaRepo == null){
            return new RespuestaDto("no se guardo nada");
        }

        return new RespuestaDto("se guardo este nombre de vuelo: "  );
    }

    @Override
    public List<VueloDto> buscarTodos() {
        ObjectMapper mapper = new ObjectMapper();
        return repository.findAll().stream()
                .map(vuelo -> mapper.convertValue(vuelo, VueloDto.class))
                .toList();
    }
}
