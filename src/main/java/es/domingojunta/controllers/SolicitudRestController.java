package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import es.domingojunta.entities.Solicitud;
import es.domingojunta.model.EntidadCrearViewModel;
import es.domingojunta.model.EntidadListarViewModel;
import es.domingojunta.model.SolicitudCrearViewModel;
import es.domingojunta.model.SolicitudListarViewModel;
import es.domingojunta.services.SolicitudService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class SolicitudRestController {
	
	@Autowired
	private SolicitudService service;
	
	@PreAuthorize("(hasAuthority('LECTOR') or hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@GetMapping("/solicitudes")
	public ResponseEntity<List<Solicitud>> getAllSolicitudes() {
		
		List<Solicitud> solicitudes = service.solicitudes();
		ResponseEntity<List<Solicitud>> respuesta = new ResponseEntity<List<Solicitud>>(solicitudes,HttpStatus.OK);
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('LECTOR') or hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@GetMapping({"/solicitudes_listar","/solicitud_listar"})
	public ResponseEntity<List<SolicitudListarViewModel>> listar() {
		
		//System.out.println("Entrando en el servicio...");
		
		List<SolicitudListarViewModel> viewModels = service.solicitudesListar();
		
		ResponseEntity<List<SolicitudListarViewModel>> respuesta = null;
		if (viewModels == null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<List<SolicitudListarViewModel>>(viewModels, HttpStatus.OK);
		}
		
		
			
		
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('LECTOR') or hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@GetMapping({"/solicitud_mostrar/{id}","/solicitud/{id}"})
	public ResponseEntity<SolicitudListarViewModel> mostrar(@PathVariable("id") int id){
		
		SolicitudListarViewModel viewModel = service.mostrar(id);
		ResponseEntity<SolicitudListarViewModel> respuesta =null;
		if (viewModel==null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<SolicitudListarViewModel>(viewModel,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@PutMapping({"/solicitud_actualizar","/solicitud"})
	public ResponseEntity<SolicitudListarViewModel> actualizar (@RequestBody SolicitudListarViewModel viewModel, RedirectAttributes redirectAttributes ){
		//System.out.println("El SUBCC introducido en el controller es: "+viewModel.getSubcc());
		ResponseEntity respuesta = null;
		System.out.println("el grado de cumplimiento pasado es: "+viewModel.getGradoCumplimientoTecnico());
		Boolean actualizar = service.actualizar(viewModel);
		if (actualizar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@PostMapping({"/solicitud_crear","/solicitud"})
	public ResponseEntity<SolicitudCrearViewModel> crear (@RequestBody SolicitudCrearViewModel viewModel ){
		
		ResponseEntity respuesta = null;
		Boolean crear = service.crear(viewModel);
		if (crear) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
		
	}
	
	@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@DeleteMapping({"/solicitud_borrar/{id}","/solicitud/{id}"})
	public ResponseEntity borrar(@PathVariable("id") int id){
		
		ResponseEntity respuesta = null;
		Boolean borrar = service.borrar(id);
		if (borrar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
	}

}
