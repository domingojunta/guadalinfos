package es.domingojunta.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.domingojunta.entities.Solicitud;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Serializable> {

	
}
