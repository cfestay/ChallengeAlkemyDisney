package cl.alkemy.carlos.peliculas.persistence.repository;

import cl.alkemy.carlos.peliculas.persistence.entity.Personaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje,Integer> {
}
