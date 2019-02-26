package es.domingojunta.services;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Entidad;
import es.domingojunta.entities.Orden;
import es.domingojunta.entities.Solicitud;
import es.domingojunta.models.entidad.EntidadListarViewModel;
import es.domingojunta.models.solicitud.SolicitudCrearViewModel;
import es.domingojunta.models.solicitud.SolicitudListarViewModel;
import es.domingojunta.repositories.SolicitudRepository;
import es.domingojunta.tools.Convertidor;




@Service
public class SolicitudService {

	@Autowired
	private SolicitudRepository repository;
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@Autowired
	private EntidadService entidadService;
	
	@Autowired
	private Convertidor converter;
	
	
	
	public List<Solicitud> solicitudes(){
		
		List<Solicitud> solicitudes = new ArrayList<Solicitud>();
		solicitudes = repository.findAll();
		return solicitudes;
		
	}
	
	public List<SolicitudListarViewModel> solicitudesListar() {
		try {
			List<Solicitud> solicitudes = solicitudes();
			List<SolicitudListarViewModel> viewModels = new ArrayList<>();
			for (Solicitud item : solicitudes) {
				SolicitudListarViewModel viewModel = converter.Entidad2SolicitudListarViewModel(item);
				viewModel.setYearConvocatoria(convocatoriaService.getYearConvocatoria(item.getIdConvocatoria()));
				viewModel.setNombreConvocatoria(convocatoriaService.getNombreConvocatoria(item.getIdConvocatoria()));
				viewModel.setNombreEntidad(entidadService.getNombreEntidad(item.getIdEntidad()));
				viewModels.add(viewModel);
				
			}
			
			return viewModels;
		} catch (Exception e) {
			return null;
		}
		
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

	public SolicitudListarViewModel mostrar(int id) {
		try {
			try {
				Solicitud solicitud = repository.getOne(id);
				SolicitudListarViewModel viewModel = converter.Entidad2SolicitudListarViewModel(solicitud);
				viewModel.setYearConvocatoria(convocatoriaService.getYearConvocatoria(viewModel.getIdConvocatoria()));
				viewModel.setNombreConvocatoria(convocatoriaService.getNombreConvocatoria(viewModel.getIdConvocatoria()));
				viewModel.setNombreEntidad(entidadService.getNombreEntidad(viewModel.getIdEntidad()));
				return viewModel;
			} catch (Exception e) {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	public Boolean actualizar(SolicitudListarViewModel viewModel) {
		
		//System.out.println("La fecha aeat que entra al servicio es: "+viewModel.getFechaAeat());
		try {
				Solicitud solicitud = null;
				solicitud = converter.SolicitudListarViewModel2Entidad(viewModel);
				repository.save(solicitud);
				return true;
			
		} catch (Exception e) {
			
			return false;
		}
	}

	public Boolean crear(SolicitudCrearViewModel viewModel) {
		
		try {
			Solicitud solicitud = null;
			solicitud = converter.SolicitudCrearViewModel2Entidad(viewModel);
			repository.save(solicitud);
			return true;
		
	} catch (Exception e) {
		
		return false;
	}
	}

	public Boolean borrar(int id) {
		Solicitud solicitud = null;
		try {
			solicitud=repository.getOne(id);
			if (solicitud!=null) {
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
