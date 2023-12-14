package com.fkyskyvuelos.sistemadevuelos.repository;

import com.fkyskyvuelos.sistemadevuelos.entity.Vuelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Repository
public class VuelosRepositoryImp implements IVuelosRepository {

    private List<Vuelo> datbase = new ArrayList<>();
    @Override
    public Vuelo save(Vuelo vuelo) {
        datbase.add(vuelo);
        return vuelo;
    }

    @Override
    public List<Vuelo> findAll() {
        return datbase;
    }
}
