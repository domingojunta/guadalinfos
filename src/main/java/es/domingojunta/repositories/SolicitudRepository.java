package es.domingojunta.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import es.domingojunta.entities.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Serializable> {

	
}
