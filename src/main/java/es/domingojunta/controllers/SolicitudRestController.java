package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.domingojunta.entities.Solicitud;
import es.domingojunta.models.solicitud.SolicitudListarViewModel;
import es.domingojunta.services.SolicitudService;

@RestController
@RequestMapping("/api")
public class SolicitudRestController {
	
	@Autowired
	private SolicitudService service;
	
	@GetMapping("/solicitudes")
	public ResponseEntity<List<Solicitud>> getAllSolicitudes() {
		
		List<Solicitud> solicitudes = service.solicitudes();
		ResponseEntity<List<Solicitud>> respuesta = new ResponseEntity<List<Solicitud>>(solicitudes,HttpStatus.OK);
		return respuesta;
	}
	
	@GetMapping("/solicitudes_listar")
	public ResponseEntity<List<SolicitudListarViewModel>> listar() {
		
		List<SolicitudListarViewModel> viewModels = service.solicitudesListar();
		ResponseEntity<List<SolicitudListarViewModel>> respuesta = null;
		if (viewModels == null || viewModels.size()==0) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<List<SolicitudListarViewModel>>(viewModels, HttpStatus.OK);
		}
			
		
		return respuesta;
	}

}
