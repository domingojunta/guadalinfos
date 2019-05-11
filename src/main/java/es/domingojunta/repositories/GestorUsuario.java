package es.domingojunta.repositories;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.domingojunta.entities.ApplicationUser;

@Repository
@Qualifier("gestorUsuario")
public interface GestorUsuario extends JpaRepository<ApplicationUser, Serializable> {

	public ApplicationUser findByNombreUsuario(String nombreUsuario);
}
