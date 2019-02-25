package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Orden;
import es.domingojunta.models.convocatoria.ConvocatoriaListarViewModel;
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
		List<Convocatoria> convocatorias = null;
		convocatorias = repository.findAll();
		List<ConvocatoriaListarViewModel> convocatoriasListarViewModel = new ArrayList<ConvocatoriaListarViewModel>();
		if (convocatorias==null) {
			return convocatoriasListarViewModel;
		}
		
		for (Convocatoria item : convocatorias) {
			ConvocatoriaListarViewModel viewModel = new ConvocatoriaListarViewModel(item);
			viewModel.setNombreOrden(ordenService.getNombreOrden(item.getIdOrden()));
			viewModel.setAliasOrden(ordenService.getAliasOrden(item.getIdOrden()));
			convocatoriasListarViewModel.add(viewModel);
			
		}
		return convocatoriasListarViewModel;
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
		Convocatoria convocatoria = getConvocatoriaById(id);
		//System.out.println("La convocatoria encontrada es: "+convocatoria.getYear());
		ConvocatoriaListarViewModel viewModel = new ConvocatoriaListarViewModel(convocatoria);
		//System.out.println("La convocatoria encontrada es la: "+viewModel.getYearConvocatoria());
		return viewModel;
	}

	public Boolean actualizar(ConvocatoriaListarViewModel viewModel) {
		Convocatoria convocatoria = getConvocatoriaById(viewModel.getIdConvocatoria());
		if (convocatoria!=null) {
			convocatoria = converter.ConvocatoriaListarViewModel2Convocatoria(convocatoria, viewModel);
			repository.save(convocatoria);
			return true;
		}
		
		return false;
	}
	
	
	
}
