package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Entidad;
import es.domingojunta.model.EntidadCrearViewModel;
import es.domingojunta.model.EntidadListarViewModel;
import es.domingojunta.repositories.EntidadRepository;
import es.domingojunta.tools.Convertidor;


@Service
public class EntidadService {

	@Autowired
	private EntidadRepository repository;
	@Autowired
	private Convertidor converter;
	
	public List<Entidad> entidades(){
		
		List<Entidad> entidades = new ArrayList<Entidad>();
		entidades = repository.findAll();
		return entidades;
		
	}
	
	public List<EntidadListarViewModel> listar(){
		
		try {
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
		} catch (Exception e) {
			return null;
		}
		
		
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

	public EntidadListarViewModel mostrar(int id) {
		try {
			Entidad entidad = repository.getOne(id);
			EntidadListarViewModel viewModel = new EntidadListarViewModel(entidad);
			return viewModel;
		} catch (Exception e) {
			return null;
		}
		
	}

	public Boolean actualizar(EntidadListarViewModel viewModel) {
		
		try {
			Entidad entidad = repository.getOne(viewModel.getIdEntidad());
			if (entidad!=null) {
				entidad = converter.EntidadListarViewModel2Entidad(entidad, viewModel);
				repository.save(entidad);
				return true;
			}
			
			return false;
		} catch (Exception e) {
			return false;
		}
		
	}

	public Boolean crear(EntidadCrearViewModel viewModel) {
		
		try {
			Entidad entidad = new Entidad();
			if (entidad!=null) {
				entidad = converter.EntidadCrearViewModel2Entidad(entidad, viewModel);
				repository.save(entidad);
				return true;
			}
			
			return false;
		} catch (Exception e) {
			return false;
		}
		
		
	}

	public Boolean borrar(int id) {
		Entidad entidad = null;
		try {
			entidad=repository.getOne(id);
			if (entidad!=null) {
				repository.deleteById(id);
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}

	public String getNombreEntidad(int idEntidad) {
		Entidad entidad = repository.getOne(idEntidad);
		
		return entidad.getNombre();
	}
}
