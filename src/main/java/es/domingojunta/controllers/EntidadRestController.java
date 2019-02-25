package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.domingojunta.entities.Entidad;
import es.domingojunta.models.entidad.EntidadListarViewModel;
import es.domingojunta.services.EntidadService;

@RestController
@RequestMapping("/api")
public class EntidadRestController {
	
	@Autowired
	private EntidadService entidadService;
	
	@GetMapping("/entidades")
	public ResponseEntity<List<Entidad>> getAllEntidades() {
		
		List<Entidad> entidades = entidadService.entidades();
		ResponseEntity<List<Entidad>> respuesta = null;
		if (entidades==null || entidades.size()==0) {
			respuesta= new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta= new ResponseEntity<List<Entidad>>(entidades,HttpStatus.OK);
		}
		
		return respuesta;
	}
	
	@GetMapping("/entidades_listar")
	public ResponseEntity<List<EntidadListarViewModel>> listar() {
		
		List<EntidadListarViewModel> entidades = entidadService.listar();
		ResponseEntity<List<EntidadListarViewModel>> respuesta = null;
		if (entidades==null || entidades.size()==0) {
			respuesta= new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta= new ResponseEntity<List<EntidadListarViewModel>>(entidades,HttpStatus.OK);
		}
		
		return respuesta;
	}

}
