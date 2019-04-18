package es.domingojunta.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Orden;
import es.domingojunta.model.ConvocatoriaCrearViewModel;
import es.domingojunta.model.ConvocatoriaListarViewModel;
import es.domingojunta.repositories.ConvocatoriaRepository;
import es.domingojunta.repositories.OrdenRepository;
import es.domingojunta.tools.Convertidor;

@Service
public class ConvocatoriaService {

	@Autowired
	private ConvocatoriaRepository repository;
	@Autowired
	private OrdenService ordenService;
	@Autowired
	private Convertidor converter;
	
	public List<ConvocatoriaListarViewModel> convocatoriasListar(){
		try {
			List<Convocatoria> convocatorias = null;
			convocatorias = repository.findAll();
			List<ConvocatoriaListarViewModel> convocatoriasListarViewModel = new ArrayList<ConvocatoriaListarViewModel>();
			if (convocatorias==null) {
				return convocatoriasListarViewModel;
			}
			
			for (Convocatoria item : convocatorias) {
				
				ConvocatoriaListarViewModel viewModel = converter.Entidad2ConvocatoriaListarViewModel(item);
				viewModel.setNombreOrden(ordenService.getNombreOrden(item.getIdOrden()));
				viewModel.setAliasOrden(ordenService.getAliasOrden(item.getIdOrden()));
				convocatoriasListarViewModel.add(viewModel);
				
			}
			return convocatoriasListarViewModel;
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Convocatoria> convocatorias(){
		List<Convocatoria> convocatorias = null;
		convocatorias = repository.findAll();
		return convocatorias;
	}
	
	public Convocatoria getConvocatoriaById(int id) {
		Convocatoria convocatoria = new Convocatoria();
		convocatoria = repository.getOne(id);
		return convocatoria;
	}
	
	public String getYearConvocatoria(int id) {
		Convocatoria convocatoria = getConvocatoriaById(id);
		String yearOrden = convocatoria.getYear();
		return yearOrden;
	}
	
	public String getNombreConvocatoria(int id) {
		Convocatoria convocatoria = getConvocatoriaById(id);
		String nombreConvocatoria = convocatoria.getNombre();
		return nombreConvocatoria;
	}

	public ConvocatoriaListarViewModel mostrar(int id) {
		try {
			Convocatoria convocatoria = getConvocatoriaById(id);
			//System.out.println("La convocatoria encontrada es: "+convocatoria.getYear());
			ConvocatoriaListarViewModel viewModel = converter.Entidad2ConvocatoriaListarViewModel(convocatoria);
			viewModel.setNombreOrden(ordenService.getNombreOrden(convocatoria.getIdOrden()));
			viewModel.setAliasOrden(ordenService.getAliasOrden(convocatoria.getIdOrden()));
			return viewModel;
		} catch (Exception e) {
			return null;
		}
	}

	public Boolean actualizar(ConvocatoriaListarViewModel viewModel) {
		try {
			Convocatoria convocatoria = getConvocatoriaById(viewModel.getIdConvocatoria());
			//System.out.println("el id pasado es: "+viewModel.getIdConvocatoria());
			//System.out.println("La Entity obtenida con ese id es: "+convocatoria.toString());
			if (convocatoria!=null) {
				convocatoria = converter.ConvocatoriaListarViewModel2Convocatoria(convocatoria, viewModel);
				
				repository.save(convocatoria);
				return true;
			}
			
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean crear(ConvocatoriaCrearViewModel viewModel) {
		try {
			Convocatoria convocatoria = new Convocatoria();
			convocatoria = converter.ConvocatoriaCrearViewModel2Convocatoria(convocatoria, viewModel);
			try {
				repository.save(convocatoria);
				return true;
			} catch (Exception e) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean borrar(int id) {
		Convocatoria convocatoria = null;
		try {
			convocatoria=repository.getOne(id);
			if (convocatoria!=null) {
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
