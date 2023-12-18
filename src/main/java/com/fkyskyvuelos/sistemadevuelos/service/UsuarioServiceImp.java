package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.response.ResUsuarioDto;
import com.fkyskyvuelos.sistemadevuelos.dto.response.SaveUserDto;
import com.fkyskyvuelos.sistemadevuelos.dto.request.ReqUsuarioDto;
import com.fkyskyvuelos.sistemadevuelos.entity.asiento;
import com.fkyskyvuelos.sistemadevuelos.entity.reserva;
import com.fkyskyvuelos.sistemadevuelos.entity.usuario;
import com.fkyskyvuelos.sistemadevuelos.entity.vuelo;
import com.fkyskyvuelos.sistemadevuelos.repository.IReservaRepository;
import com.fkyskyvuelos.sistemadevuelos.repository.IUsuarioRepository;
import com.fkyskyvuelos.sistemadevuelos.repository.IVuelosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    IUsuarioRepository usuarioRepository;
    IVuelosRepository vuelosRepository;
    IReservaRepository reservaRepository;

    public UsuarioServiceImp (IUsuarioRepository usuarioRepository, IVuelosRepository vuelosRepository, IReservaRepository reservaRepository){
        this.usuarioRepository = usuarioRepository;
        this.vuelosRepository = vuelosRepository;
        this.reservaRepository = reservaRepository;
    }
    @Override
    public SaveUserDto guardarCompra(ReqUsuarioDto ReqUsuarioDto) {
        ModelMapper mapper = new ModelMapper();
        usuario user = mapper.map(ReqUsuarioDto,usuario.class);
        List<vuelo> vuelos =vuelosRepository.findAll();

        boolean esta = false;
        vuelo elvuelo = new vuelo();
        for (vuelo vuelo : vuelos) {
            if (vuelo.getNombredeVuelo().equals(user.getNombredelvuelo())) {
                elvuelo = vuelo;
                esta = true;
                break;
            }
        }
        if (esta){
            String suasiento="";
            Set<asiento> asientosDispo = elvuelo.getAsientos();
            for(asiento asiento : asientosDispo){
                if(asiento.isDisponible()){
                    Set<usuario> usuario = new HashSet<>();
                    usuario.add(user);

                    reserva reserva = new reserva(null,user.getNombre(),usuario);
                    Set<reserva> mireserva = new HashSet<>();
                    mireserva.add(reserva);

                    asiento.setUsuario(user);
                    asiento.setDisponible(false);
                    asiento.setReservado(true);
                    asiento.setVuelo(elvuelo);
                    suasiento = asiento.getNombredeAsiento();

                    user.setAsiento(asiento);
                    user.setReservas(mireserva);
                    usuarioRepository.save(user);
                    reservaRepository.save(reserva);
                    break;
                }
            }
            return new SaveUserDto(ReqUsuarioDto,"compra guardada con exito su asiento es: " + suasiento );
        }
        return new SaveUserDto(ReqUsuarioDto,"No se puedo realizar la compra");
    }

    @Override
    public List<ResUsuarioDto> obtenerTodos() {
//        ModelMapper mapper = new ModelMapper();
//        List<usuario> usuarios = usuarioRepository.findAll();
//        List<ResUsuarioDto> resUsuarioDtos = new ArrayList<>();
//        resUsuarioDtos.add(1,usuarios);
        return usuarioRepository.findAll().stream()
                .map(usuario -> new ResUsuarioDto(usuario.getNombre(),usuario.getApellido(),usuario.getReservas()))
                .toList();


    }
}
