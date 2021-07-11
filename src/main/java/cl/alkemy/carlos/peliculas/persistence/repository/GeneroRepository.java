package cl.alkemy.carlos.peliculas.persistence.repository;

import cl.alkemy.carlos.peliculas.persistence.entity.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero,Integer> {
}
