package es.domingojunta.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.domingojunta.entities.Convocatoria;
import es.domingojunta.models.convocatoria.ConvocatoriaListarViewModel;
import es.domingojunta.models.orden.OrdenListarViewModel;
import es.domingojunta.services.ConvocatoriaService;

@RestController
@RequestMapping("/api")
public class ConvocatoriaRestController {
	
	@Autowired
	private ConvocatoriaService service;
	
	@GetMapping({"/convocatorias_listar","/convocatoria_listar"})
	public ResponseEntity<List<ConvocatoriaListarViewModel>> listar() {
		
		List<ConvocatoriaListarViewModel> convocatorias = service.convocatoriasListar();
		ResponseEntity<List<ConvocatoriaListarViewModel>> respuesta = null;
		
		if (convocatorias==null || convocatorias.size()==0) {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		}else {
			respuesta = new ResponseEntity<List<ConvocatoriaListarViewModel>>(convocatorias, HttpStatus.OK);
			
		}
		 return respuesta;
	}
	
	@GetMapping("/convocatorias")
	public ResponseEntity<List<Convocatoria>> getConvocatorias(){
		List<Convocatoria> convocatorias = service.convocatorias();
		ResponseEntity<List<Convocatoria>> respuesta = null;
		if (convocatorias==null || convocatorias.size()==0) {
			respuesta = new ResponseEntity(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<List<Convocatoria>>(convocatorias, HttpStatus.OK);
			 
		}
		 return respuesta;
	}
	
	@GetMapping({"/convocatoria_mostrar/{id}","/convocatoria/{id}"})
	public ResponseEntity<ConvocatoriaListarViewModel> mostrar(@PathVariable("id") int id){
		//System.out.println("Entrando en mostrar convocatoria controller");
		ConvocatoriaListarViewModel viewModel = service.mostrar(id);
		//System.out.println("El controller va a mostrar la convocatoria: "+viewModel.getYearConvocatoria());
		ResponseEntity<ConvocatoriaListarViewModel> respuesta =null;
		if (viewModel==null) {
			respuesta = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			respuesta = new ResponseEntity<ConvocatoriaListarViewModel>(viewModel,HttpStatus.OK);
		}
		return respuesta;
	}
	
	@PutMapping({"/convocatoria_actualizar","/convocatoria"})
	public ResponseEntity<ConvocatoriaListarViewModel> actualizar (@RequestBody ConvocatoriaListarViewModel viewModel ){
		
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

}
