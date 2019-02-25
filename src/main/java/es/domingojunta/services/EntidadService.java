package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.domingojunta.entities.Entidad;
import es.domingojunta.models.entidad.EntidadListarViewModel;
import es.domingojunta.repositories.EntidadRepository;


@Service
public class EntidadService {

	@Autowired
	private EntidadRepository repository;
	
	public List<Entidad> entidades(){
		
		List<Entidad> entidades = new ArrayList<Entidad>();
		entidades = repository.findAll();
		return entidades;
		
	}
	
	public List<EntidadListarViewModel> listar(){
		
		List<Entidad> entidades = new ArrayList<Entidad>();
		entidades = repository.findAll();
		List<EntidadListarViewModel> entidadesViewModel = new ArrayList<EntidadListarViewModel>();
		if (entidades!=null) {
			for (Entidad item : entidades) {
				EntidadListarViewModel vm = new EntidadListarViewModel(item);
				entidadesViewModel.add(vm);
			}
		}
		
		
		return entidadesViewModel;
		
	}
	
	public void addEntidad(Entidad entidad) {
		repository.save(entidad);
	}
	
	public void updateEntidad(Entidad entidad) {
		repository.save(entidad);
	}
	
	public Entidad findEntidadById(int id) {
		Optional<Entidad> entidadOpt = repository.findById(id);
		Entidad entidad = null;
		if (entidadOpt.isPresent()) {
			entidad = entidadOpt.get();
		}
		return entidad;
	}
}
