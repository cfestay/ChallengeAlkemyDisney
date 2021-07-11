package cl.alkemy.carlos.peliculas.persistence.repository;

import cl.alkemy.carlos.peliculas.persistence.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Integer> {

    Iterable<Pelicula>findByTitulo(String titulo);

    Iterable<Pelicula>findByGeneroId(int generoId);



}
