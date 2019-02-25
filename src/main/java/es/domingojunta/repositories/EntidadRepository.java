package es.domingojunta.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import es.domingojunta.entities.Entidad;

public interface EntidadRepository extends JpaRepository<Entidad, Serializable>{

}
