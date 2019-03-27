package es.domingojunta.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.domingojunta.entities.Entidad;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Serializable>{

}
