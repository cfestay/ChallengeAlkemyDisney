package cl.alkemy.carlos.peliculas.persistence.controller;

import cl.alkemy.carlos.peliculas.persistence.Service.GeneroService;
import cl.alkemy.carlos.peliculas.persistence.entity.Genero;
import cl.alkemy.carlos.peliculas.persistence.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService GS;

    @GetMapping("/all")
    public Iterable<Genero>allGenero(){
        return GS.allGenero();
    }




}
