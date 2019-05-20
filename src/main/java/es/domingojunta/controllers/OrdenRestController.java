package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
import es.domingojunta.entities.Orden;
import es.domingojunta.model.OrdenCrearViewModel;
import es.domingojunta.model.OrdenListarViewModel;
import es.domingojunta.services.OrdenService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class OrdenRestController {
	
	
	@Autowired
	private OrdenService service;
	
	@PreAuthorize("(hasAuthority('LECTOR') or hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@GetMapping("/ordenes")
	public ResponseEntity<List<Orden>> getAllOrdenes() {
		
		List<Orden> ordenes = service.ordenes();
		ResponseEntity<List<Orden>> respuesta = null;
		if (ordenes==null || ordenes.size()==0) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<List<Orden>>(ordenes,HttpStatus.OK);
		}
		
		
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('LECTOR') or hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@GetMapping({"/ordenes_listar","/orden_listar"})
	public ResponseEntity<List<OrdenListarViewModel>> listar() {
		
		List<OrdenListarViewModel> ordenes = service.ordenesListar();
		ResponseEntity<List<OrdenListarViewModel>> respuesta = null;
		if (ordenes==null || ordenes.size()==0) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<List<OrdenListarViewModel>>(ordenes,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('LECTOR') or hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@GetMapping({"/orden_mostrar/{id}","/orden/{id}"})
	public ResponseEntity<OrdenListarViewModel> mostrar(@PathVariable("id") int id){
		
		OrdenListarViewModel viewModel = service.mostrar(id);
		
		ResponseEntity<OrdenListarViewModel> respuesta =null;
		if (viewModel==null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<OrdenListarViewModel>(viewModel,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@PutMapping({"/orden_actualizar","/orden"})
	public ResponseEntity<OrdenListarViewModel> actualizar (@RequestBody OrdenListarViewModel viewModel ){
		
		//System.out.println("Entra: "+viewModel.getAliasOrden());
		ResponseEntity respuesta = null;
		Boolean actualizar = service.actualizar(viewModel);
		if (actualizar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
		
	}
	
	@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@PostMapping({"/orden_crear","/orden"})
	public ResponseEntity<OrdenCrearViewModel> crear (@RequestBody OrdenCrearViewModel viewModel ){
		
		ResponseEntity respuesta = null;
		Boolean actualizar = service.crear(viewModel);
		if (actualizar) {
			respuesta = new ResponseEntity(HttpStatus.OK);
		} else {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return respuesta;
		
	}
	
	@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
	@DeleteMapping({"/orden_borrar/{id}","/orden/{id}"})
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
