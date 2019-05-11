package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import es.domingojunta.model.ApplicationUserViewModel;
import es.domingojunta.services.ApplicationUserService;

@Controller
@CrossOrigin(origins="*")
@PreAuthorize("(hasAuthority('ADMINISTRADOR'))")
public class ApplicationUserController {

	@Autowired
	@Qualifier("applicationUserService")
	private ApplicationUserService service;
	
	@GetMapping({"/usuarios_listar","/usuarios"})
	public ResponseEntity<List<ApplicationUserViewModel>> listar() {
		
		List<ApplicationUserViewModel> usuarios = service.getAll();
		ResponseEntity<List<ApplicationUserViewModel>> respuesta = null;
		if (usuarios==null || usuarios.size()==0) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<List<ApplicationUserViewModel>>(usuarios,HttpStatus.OK);
		}
		return respuesta;
	}
	
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<ApplicationUserViewModel> mostrar(@PathVariable("id") int id) {
		
		ApplicationUserViewModel usuario = service.getOne(id);
		ResponseEntity<ApplicationUserViewModel> respuesta = null;
		if (usuario==null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<ApplicationUserViewModel>(usuario,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity borrar(@PathVariable("id") int id) {
		
		boolean resultado = service.borrarUsuario(id);
		ResponseEntity<ApplicationUserViewModel> respuesta = null;
		if (!resultado) {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity(HttpStatus.OK);
		}
		return respuesta;
		
	}
	
	@PutMapping("/usuario")
	public ResponseEntity<ApplicationUserViewModel> actualizar(@RequestBody ApplicationUserViewModel viewmodel) {
		
		boolean resultado = service.actualizarUsuario(viewmodel);
		ResponseEntity<ApplicationUserViewModel> respuesta = null;
		if (!resultado) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<ApplicationUserViewModel>(viewmodel,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<ApplicationUserViewModel> crear(@RequestBody ApplicationUserViewModel viewmodel) {
		
		
		ApplicationUserViewModel vm = service.crearUsuario(viewmodel);
		
		ResponseEntity<ApplicationUserViewModel> respuesta = null;
		if (vm==null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<ApplicationUserViewModel>(vm,HttpStatus.OK);
		}
		return respuesta;
	}
	
	
	
}
