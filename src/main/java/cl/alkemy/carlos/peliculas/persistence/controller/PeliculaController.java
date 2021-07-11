package cl.alkemy.carlos.peliculas.persistence.controller;

import cl.alkemy.carlos.peliculas.persistence.Service.PeliculaService;
import cl.alkemy.carlos.peliculas.persistence.entity.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {

    @Autowired
    private PeliculaService PS;

    @GetMapping("/all")
    public Iterable<Pelicula>allPelicula(){
        return PS.findAll();
    }

    @GetMapping("/titulo/{titulo}")
    public Iterable<Pelicula>peliculaTitulo(@PathVariable("titulo") String titulo){
        return PS.getByTitulo(titulo);

    }
    @GetMapping("/genero/{id}")
    public Iterable<Pelicula>peliculaByGenero(@PathVariable("id") int generoId){
        return PS.getByGenero(generoId);
    }

}
