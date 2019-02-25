package es.domingojunta.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import es.domingojunta.entities.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Serializable> {

	
}
