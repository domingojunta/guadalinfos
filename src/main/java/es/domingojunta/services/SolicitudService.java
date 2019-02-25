package es.domingojunta.services;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Entidad;
import es.domingojunta.entities.Orden;
import es.domingojunta.entities.Solicitud;
import es.domingojunta.models.solicitud.SolicitudListarViewModel;
import es.domingojunta.repositories.SolicitudRepository;




@Service
public class SolicitudService {

	@Autowired
	private SolicitudRepository repository;
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	
	
	public List<Solicitud> solicitudes(){
		
		List<Solicitud> solicitudes = new ArrayList<Solicitud>();
		solicitudes = repository.findAll();
		return solicitudes;
		
	}
	
	public List<SolicitudListarViewModel> solicitudesListar() {
		List<Solicitud> solicitudes = solicitudes();
		List<SolicitudListarViewModel> viewModels = new ArrayList<>();
		for (Solicitud item : solicitudes) {
			SolicitudListarViewModel viewModel = new SolicitudListarViewModel(item);
			viewModel.setYearConvocatoria(convocatoriaService.getYearConvocatoria(item.getIdConvocatoria()));
			viewModel.setNombreConvocatoria(convocatoriaService.getNombreConvocatoria(item.getIdConvocatoria()));
			viewModels.add(viewModel);
			
		}
		
		return viewModels;
		
	}
	
	public void addSolicitud(Solicitud solicitud) {
		repository.save(solicitud);
	}
	
	public void updateSolicitud(Solicitud solicitud) {
		repository.save(solicitud);
	}
	
	public Solicitud findSolicitudById(int id) {
		Optional<Solicitud> solicitudOpt = repository.findById(id);
		Solicitud solicitud = null;
		if (solicitudOpt.isPresent()) {
			solicitud = solicitudOpt.get();
		}
		return solicitud;
	}
	
	
	
	
	
	
}
