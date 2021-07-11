package cl.alkemy.carlos.peliculas.persistence.Service;

import ch.qos.logback.core.joran.conditional.IfAction;
import cl.alkemy.carlos.peliculas.persistence.entity.Personaje;
import cl.alkemy.carlos.peliculas.persistence.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository PR;

    public Iterable<Personaje>allPersonaje(){
        return PR.findAll();
    }

    public Optional<Personaje>findById(int personajeId){
        return PR.findById(personajeId);
    }

    public Personaje Save(Personaje personaje){
        return PR.save(personaje);
    }

    public boolean delete(int personajeId){
        return findById(personajeId).map(personaje -> {
            PR.deleteById(personajeId);
            return true;
        }).orElse(false);
    }

}
