package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.response.RespUserDto;
import com.fkyskyvuelos.sistemadevuelos.dto.usuarioDto;
import com.fkyskyvuelos.sistemadevuelos.entity.usuario;
import com.fkyskyvuelos.sistemadevuelos.repository.IUsuarioRepository;
import com.fkyskyvuelos.sistemadevuelos.repository.IVuelosRepository;
import org.modelmapper.ModelMapper;
import com.fkyskyvuelos.sistemadevuelos.entity.usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    IUsuarioRepository usuarioRepository;
    IVuelosRepository vuelosRepository;

    public UsuarioServiceImp (IUsuarioRepository usuarioRepository, IVuelosRepository vuelosRepository){
        this.usuarioRepository = usuarioRepository;
        this.vuelosRepository = vuelosRepository;
    }
    @Override
    public RespUserDto guardarCompra(usuarioDto usuarioDto) {
        ModelMapper mapper = new ModelMapper();
        usuario user = mapper.map(usuarioDto,usuario.class);
//        Address address= new Address(null,userDto.getAddress().getCity(),user);
//        user.setAddress(address);
//        userRepository.save(user);
        return new RespUserDto(usuarioDto,"compra guardada con éxito.");
    }
}
