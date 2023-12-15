package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.VueloDto;
import com.fkyskyvuelos.sistemadevuelos.entity.asiento;
import com.fkyskyvuelos.sistemadevuelos.entity.vuelo;
import com.fkyskyvuelos.sistemadevuelos.repository.IVuelosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class VuelosServiceImp implements IVuelosService {
    @Autowired
    private IVuelosRepository vuelosRepository;




    @Override
    public List<VueloDto> buscarTodos() {
        ModelMapper mapper = new ModelMapper();
        List<vuelo> vueloEnti = vuelosRepository.findAll();
        List<VueloDto> vuelosDto = new ArrayList<>();
//        carritosEnt.stream().forEach(c-> carritosDto.add(mapper.map(c,CartDto.class)));

        vueloEnti.forEach(v -> {
                    Set<asiento> asientos = v.getAsientos();
                    int asientosDispo=0;
                    for (asiento a : asientos) {
                        if (a.isDisponible() && !a.isReservado()) {
                            asientosDispo++;
                        }
                    }
                    VueloDto vueloDtot = mapper.map(v, VueloDto.class);
                    vueloDtot.setAsientosDispo(asientosDispo);
                    vuelosDto.add(vueloDtot);
                }
        );


        return vuelosDto;
    }

}
