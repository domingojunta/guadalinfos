package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.domingojunta.entities.Entidad;
import es.domingojunta.models.entidad.EntidadCrearViewModel;
import es.domingojunta.models.entidad.EntidadListarViewModel;
import es.domingojunta.services.EntidadService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class EntidadRestController {
	
	@Autowired
	private EntidadService service;
	
	@GetMapping("/entidades")
	public ResponseEntity<List<Entidad>> getAllEntidades() {
		
		List<Entidad> entidades = service.entidades();
		ResponseEntity<List<Entidad>> respuesta = null;
		if (entidades==null || entidades.size()==0) {
			respuesta= new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta= new ResponseEntity<List<Entidad>>(entidades,HttpStatus.OK);
		}
		
		return respuesta;
	}
	
	@GetMapping({"/entidades_listar","/entidad_listar"})
	public ResponseEntity<List<EntidadListarViewModel>> listar() {
		
		List<EntidadListarViewModel> entidades = service.listar();
		ResponseEntity<List<EntidadListarViewModel>> respuesta = null;
		if (entidades==null || entidades.size()==0) {
			respuesta= new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta= new ResponseEntity<List<EntidadListarViewModel>>(entidades,HttpStatus.OK);
		}
		
		return respuesta;
	}
	
	@GetMapping({"/entidad_mostrar/{id}","/entidad/{id}"})
	public ResponseEntity<EntidadListarViewModel> mostrar(@PathVariable("id") int id){
		//System.out.println("Entrando en mostrar entidad controller");
		EntidadListarViewModel viewModel = service.mostrar(id);
		//System.out.println("El controller va a mostrar la entidad: "+viewModel.getYearConvocatoria());
		ResponseEntity<EntidadListarViewModel> respuesta =null;
		if (viewModel==null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<EntidadListarViewModel>(viewModel,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@PutMapping({"/entidad_actualizar","/entidad"})
	public ResponseEntity<EntidadListarViewModel> actualizar (@RequestBody EntidadListarViewModel viewModel ){
		
		ResponseEntity respuesta = null;
		Boolean actualizar = service.actualizar(viewModel);
		if (actualizar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
		
	}
	
	@PostMapping({"/entidad_crear","/entidad"})
	public ResponseEntity<EntidadCrearViewModel> crear (@RequestBody EntidadCrearViewModel viewModel ){
		
		ResponseEntity respuesta = null;
		Boolean actualizar = service.crear(viewModel);
		if (actualizar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
		
	}
	
	@DeleteMapping({"/entidad_borrar/{id}","/entidad/{id}"})
	public ResponseEntity borrar(@PathVariable("id") int id){
		
		ResponseEntity respuesta = null;
		Boolean actualizar = service.borrar(id);
		if (actualizar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
	}

}
