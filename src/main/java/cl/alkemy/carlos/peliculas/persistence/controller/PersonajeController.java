package cl.alkemy.carlos.peliculas.persistence.controller;

import cl.alkemy.carlos.peliculas.persistence.Service.PersonajeService;
import cl.alkemy.carlos.peliculas.persistence.entity.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    @Autowired
    private PersonajeService PS;

    @GetMapping("/all")
    public Iterable<Personaje>allPersonaje(){
        return PS.allPersonaje();
    }

    @GetMapping("/{id}")
    public Optional<Personaje> byIdPersonaje(@PathVariable ("id") int personajeId){
        return PS.findById(personajeId);
    }


    @PostMapping("/save")
    public Personaje Save(@RequestBody Personaje personaje){
        return PS.Save(personaje);

    }

    @DeleteMapping("/delete/{id}")
    public boolean Delete(@PathVariable("id") int personajeId){
        return PS.delete(personajeId);
    }

}
