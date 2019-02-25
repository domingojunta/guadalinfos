package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import es.domingojunta.entities.Orden;
import es.domingojunta.models.orden.OrdenCrearViewModel;
import es.domingojunta.models.orden.OrdenListarViewModel;
import es.domingojunta.repositories.OrdenRepository;
import es.domingojunta.tools.Convertidor;


@Service
public class OrdenService {

	
	@Autowired
	private OrdenRepository repository;
	
	@Autowired
	private Convertidor converter;
	
	public List<Orden> ordenes(){
		
		List<Orden> ordenes = null;
		
		ordenes = repository.findAll();
		return ordenes;
		
	}
	
public List<OrdenListarViewModel> ordenesListar(){
		
		List<Orden> ordenes = null;
		List<OrdenListarViewModel> ordenesListarViewModel = new ArrayList<OrdenListarViewModel>();
		
		ordenes = repository.findAll();
		if (ordenes==null) {
			return ordenesListarViewModel;
		}
		for (Orden item : ordenes) {
			
			OrdenListarViewModel viewModel = new OrdenListarViewModel(item);
			ordenesListarViewModel.add(viewModel);
			
		}
		return ordenesListarViewModel;
		
	}
	
	public Orden getOrdenById(int id) {
		Orden orden = new Orden();
		orden = repository.getOne(id);
		return orden;
	}
	
	public String getNombreOrden(int id) {
		Orden orden = repository.getOne(id);
		String nombreOrden = orden.getNombre();
		return nombreOrden;
	}
	
	public String getAliasOrden(int id) {
		Orden orden = repository.getOne(id);
		String aliasOrden = orden.getAlias();
		return aliasOrden;
	}

	public OrdenListarViewModel mostrar(int id) {
		Optional<Orden> optional = repository.findById(id);
		//System.out.println(optional.get().getNombre());
		OrdenListarViewModel viewModel = null;
		if (optional.isPresent()) {
			viewModel = new OrdenListarViewModel(optional.get());
			//System.out.println(viewModel.getNombreOrden());
		}
		return viewModel;
		
	}

	public Boolean actualizar(OrdenListarViewModel viewModel) {
		
		Orden orden = getOrdenById(viewModel.getIdOrden());
		if (orden!=null) {
			orden = converter.OrdenListarViewModel2Orden(orden, viewModel);
			repository.save(orden);
			return true;
		}
		
		return false;
		
	}
	
	public Boolean crear(OrdenCrearViewModel viewModel) {
			
			Orden orden = new Orden();
			orden = converter.OrdenCrearViewModel2Orden(orden, viewModel);
			try {
				repository.save(orden);
				return true;
			} catch (Exception e) {
				return false;
			}
				
		
	}
	
	public Boolean borrar(int id) {
		
		Orden orden = null;
		try {
			orden=repository.getOne(id);
			if (orden!=null) {
				repository.deleteById(id);
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
		
	}
}
