package cl.alkemy.carlos.peliculas.persistence.Service;

import cl.alkemy.carlos.peliculas.persistence.entity.Pelicula;
import cl.alkemy.carlos.peliculas.persistence.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository PR;

    public Iterable<Pelicula>allPelicula(){
        return PR.findAll();
    }

    public Iterable<Pelicula>findAll(){
        return PR.findAll();
    }


    public Iterable<Pelicula>getByTitulo(String titulo){
        return PR.findByTitulo(titulo);
    }

    public Iterable<Pelicula>getByGenero(int generoId){
        return PR.findByGeneroId(generoId);
    }

}
