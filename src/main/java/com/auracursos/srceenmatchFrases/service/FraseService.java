package com.auracursos.srceenmatchFrases.service;

import com.auracursos.srceenmatchFrases.dto.FraseDTO;
import com.auracursos.srceenmatchFrases.modelos.Frase;
import com.auracursos.srceenmatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria(){
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }
}
