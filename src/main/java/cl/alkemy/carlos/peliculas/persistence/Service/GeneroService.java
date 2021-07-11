package cl.alkemy.carlos.peliculas.persistence.Service;

import cl.alkemy.carlos.peliculas.persistence.entity.Genero;
import cl.alkemy.carlos.peliculas.persistence.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository GR;

    public Iterable<Genero> allGenero(){
        return GR.findAll();
    }



}
