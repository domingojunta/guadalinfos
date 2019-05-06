package es.domingojunta.services;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import es.domingojunta.model.EntidadListarViewModel;
import es.domingojunta.model.LiquidacionRequerimientoViewModel;
import es.domingojunta.model.ConcesionRequerimientoViewModel;
import es.domingojunta.model.SolicitudCrearViewModel;
import es.domingojunta.model.SolicitudListarViewModel;
import es.domingojunta.model.CertificadosViewModel;
import es.domingojunta.model.ComunicacionEntradaViewModel;
import es.domingojunta.model.ConcesionNotificacionViewModel;
import es.domingojunta.model.ConcesionViewModel;
import es.domingojunta.repositories.SolicitudRepository;
import es.domingojunta.tools.Convertidor;
import es.domingojunta.model.LiquidacionResolucionViewModel;
import es.domingojunta.model.ReintegroAcuerdoInicioViewModel;
import es.domingojunta.model.ReintegroResolucionViewModel;
import es.domingojunta.model.LiquidacionPropuestaViewModel;




@Service
public class SolicitudService {

	@Autowired
	private SolicitudRepository repository;
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@Autowired
	private EntidadService entidadService;
	
	@Autowired
	private OrdenService ordenService;
	
	@Autowired
	private Convertidor converter;
	
	private String nombreFicheroPdfAGenerar;
	
	public List<Solicitud> solicitudes(){
		
		List<Solicitud> solicitudes = new ArrayList<Solicitud>();
		solicitudes = repository.findAll();
		return solicitudes;
		
	}
	
	public List<SolicitudListarViewModel> solicitudesListar() {
		
		
		
		try {
			
			
			List<Solicitud> solicitudes = repository.findAll();
			List<SolicitudListarViewModel> viewModels = new ArrayList<>();
			for (Solicitud item : solicitudes) {
				SolicitudListarViewModel viewModel = converter.Entidad2SolicitudListarViewModel(item);
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(item.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setNombreEntidad(entidadService.getNombreEntidad(item.getIdEntidad()));
				viewModels.add(viewModel);
				
			}
			
			return viewModels;
		} catch (Exception e) {
			System.out.println("Fallo al intentar recuperar datos desde el repositorio de solicitudes");
			System.out.println(e.getMessage());
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
		
		
		//System.out.println("El SUBCC introducido es: "+viewModel.getSUBCC());
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

	public List<ComunicacionEntradaViewModel> getComunicacionEntradaViewModel(int id) {
		
		List<ComunicacionEntradaViewModel> listado = new ArrayList<>();
		
		try {
			
				Solicitud solicitud = repository.getOne(id);
				ComunicacionEntradaViewModel viewModel = new ComunicacionEntradaViewModel();
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date fechaEntradaDate = formatter.parse(solicitud.getFechaEntrada());
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				viewModel.setFechaEntrada(formato.format(fechaEntradaDate));
				
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
				
				
				
				listado.add(viewModel);
				//this.nombreFicheroPdfAGenerar = "Comunicacion Entrada RAPI "+viewModel.getYearConvocatoria()+" "+viewModel.getNombreEntidad();
				
				return listado;
			
		} catch (Exception e) {
			return null;
		}
		
		
		
	}

	public String getNombreFicheroPdfAGenerar() {
		return nombreFicheroPdfAGenerar;
	}

	public List<ConcesionRequerimientoViewModel> getRequerimientoConcesionViewModel(ConcesionRequerimientoViewModel reqvm) {
			
		List<ConcesionRequerimientoViewModel> listado = new ArrayList<>();
		int id = reqvm.getIdSolicitud();
		try {
			
				Solicitud solicitud = repository.getOne(id);
				ConcesionRequerimientoViewModel viewModel = new ConcesionRequerimientoViewModel();
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date fechaEntradaDate = formatter.parse(solicitud.getFechaEntrada());
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				viewModel.setFechaEntrada(formato.format(fechaEntradaDate));
				
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
				
				
				viewModel.setDocumentacionRequerida(reqvm.getDocumentacionRequerida());
				
				
				listado.add(viewModel);
				//this.nombreFicheroPdfAGenerar = "Comunicacion Entrada RAPI "+viewModel.getYearConvocatoria()+" "+viewModel.getNombreEntidad();
				
				return listado;
			
		} catch (Exception e) {
			return null;
		}
		
	}

	public List<ConcesionViewModel> getConcesionViewModel(int id) throws Exception {

		List<ConcesionViewModel> listado = new ArrayList<ConcesionViewModel>();
		ConcesionViewModel viewModel = new ConcesionViewModel();
		
		Solicitud solicitud = repository.getOne(id);
				
				
				
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setFechaJustificacion(convocatoria.getFechaJustificacion());
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				viewModel.setCoste();
				viewModel.setSubvencion();
				viewModel.setPorcentajeFinanciacion();
				viewModel.setFinanciacionPropia();
				viewModel.setParrafoDatosSubvencion();
				viewModel.setParrafoVista();
				viewModel.setAntecedente01();
				viewModel.setPropone01();
				viewModel.setPropone02();
				viewModel.setParrafoAnexo();
				
								
				listado.add(viewModel);
				
				
				return listado;
			
		
		
	}

	public List<ConcesionNotificacionViewModel> getConcesionNotificacionViewModel(int id) throws Exception {
			
		List<ConcesionNotificacionViewModel> listado = new ArrayList<>();
		
		
			
				Solicitud solicitud = repository.getOne(id);
				ConcesionNotificacionViewModel viewModel = new ConcesionNotificacionViewModel();
				
				
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				
				
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
				
				
				
				listado.add(viewModel);
				//this.nombreFicheroPdfAGenerar = "Comunicacion Entrada RAPI "+viewModel.getYearConvocatoria()+" "+viewModel.getNombreEntidad();
				
				return listado;
			
		
		
		
	}

	public List<LiquidacionRequerimientoViewModel> getRequerimientoLiquidacionViewModel(
			LiquidacionRequerimientoViewModel reqvm) throws Exception {
		
		List<LiquidacionRequerimientoViewModel> listado = new ArrayList<>();
		int id = reqvm.getIdSolicitud();
		
			
				Solicitud solicitud = repository.getOne(id);
				LiquidacionRequerimientoViewModel viewModel = new LiquidacionRequerimientoViewModel();
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date fechaEntradaDate = formatter.parse(solicitud.getFechaEntrada());
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				viewModel.setFechaEntrada(formato.format(fechaEntradaDate));
				
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
				
				
				viewModel.setDocumentacionRequerida(reqvm.getDocumentacionRequerida());
				
				
				listado.add(viewModel);
				//this.nombreFicheroPdfAGenerar = "Comunicacion Entrada RAPI "+viewModel.getYearConvocatoria()+" "+viewModel.getNombreEntidad();
				
				return listado;
	}

	public List<LiquidacionPropuestaViewModel> getLiquidacionViewModel(int id) throws Exception {
	
		
		List<LiquidacionPropuestaViewModel> listado = new ArrayList<LiquidacionPropuestaViewModel>();
		LiquidacionPropuestaViewModel viewModel = new LiquidacionPropuestaViewModel();
		
		Solicitud solicitud = repository.getOne(id);
				
				
				
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				
				System.out.println(solicitud.toString());
				
				
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				System.out.println(convocatoria.toString());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				viewModel.generarCalculosLiquidacion();
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
				viewModel.setAntecedente01();
				viewModel.setAntecedente02();
				viewModel.setAntecedente03();
				viewModel.setAntecedente04Minoracion();
				viewModel.setAntecedente04RevisionEconomica();
				viewModel.setAntecedente04RevisionTecnica();
				viewModel.setAntecedente06();
				viewModel.setPropone01();
				viewModel.setPropone02();
				viewModel.setParrafoAnexo();
				viewModel.setParrafoDatosSubvencion();
				viewModel.setParrafoVista();
				
								
				listado.add(viewModel);
				
				
				return listado;
	}

	public List<LiquidacionResolucionViewModel> getLiquidacionResolucionViewModel(int id) throws Exception {
		
		List<LiquidacionResolucionViewModel> listado = new ArrayList<LiquidacionResolucionViewModel>();
		LiquidacionResolucionViewModel viewModel = new LiquidacionResolucionViewModel();
		
		Solicitud solicitud = repository.getOne(id);
				
				
				
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setFechaPropuestaLiquidacion(solicitud.getFechaPropuestaLiquidacion());
				viewModel.setFechaAlegacionesPropuestaLiquidacion(solicitud.getFechaAlegacionesPropuestaLiquidacion());
				
				System.out.println(solicitud.toString());
				
				
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				System.out.println(convocatoria.toString());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				viewModel.generarCalculosLiquidacion();
				//viewModel.setParrafoNotificacion();
				//viewModel.setParrafoInformacion();
				//viewModel.setParrafoNormativa();
				viewModel.setParrafoDatosSubvencion();
				viewModel.setParrafoVista();
				viewModel.setAntecedente01();
				viewModel.setAntecedente02();
				viewModel.setAntecedente03();
				viewModel.setAntecedente04Minoracion();
				viewModel.setAntecedente04RevisionEconomica();
				viewModel.setAntecedente04RevisionTecnica();
				viewModel.setAntecedente06();
				viewModel.setAntecedente07();
				viewModel.setPropone01();
				viewModel.setPropone02();
				viewModel.setParrafoAnexoPresupuesto();
				viewModel.setParrafoAnexoAlegaciones();
				
				
								
				listado.add(viewModel);
				
				
				return listado;
	}

	public List<LiquidacionResolucionViewModel> getLiquidacionResolucionNotificacionViewModel(int id) {
		
		List<LiquidacionResolucionViewModel> listado = new ArrayList<LiquidacionResolucionViewModel>();
		LiquidacionResolucionViewModel viewModel = new LiquidacionResolucionViewModel();
		
		Solicitud solicitud = repository.getOne(id);
				
				
				
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setFechaPropuestaLiquidacion(solicitud.getFechaPropuestaLiquidacion());
				viewModel.setFechaAlegacionesPropuestaLiquidacion(solicitud.getFechaAlegacionesPropuestaLiquidacion());
				
				System.out.println(solicitud.toString());
				
				
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				System.out.println(convocatoria.toString());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				//viewModel.generarCalculosLiquidacion();
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
//				viewModel.setParrafoDatosSubvencion();
//				viewModel.setParrafoVista();
//				viewModel.setAntecedente01();
//				viewModel.setAntecedente02();
//				viewModel.setAntecedente03();
//				viewModel.setAntecedente04Minoracion();
//				viewModel.setAntecedente04RevisionEconomica();
//				viewModel.setAntecedente04RevisionTecnica();
//				viewModel.setAntecedente06();
//				viewModel.setAntecedente07();
//				viewModel.setPropone01();
//				viewModel.setPropone02();
//				viewModel.setParrafoAnexoPresupuesto();
//				viewModel.setParrafoAnexoAlegaciones();
				
				
								
				listado.add(viewModel);
				
				
				return listado;
	}

	public List<CertificadosViewModel> getCertificadosViewModel(int id) {
		
		List<CertificadosViewModel> listado = new ArrayList<CertificadosViewModel>();
		CertificadosViewModel viewModel = new CertificadosViewModel();
		
		Solicitud solicitud = repository.getOne(id);
				
				
				
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setImporteAceptadoDietas(solicitud.getImporteAceptadoDietas());
				viewModel.setImporteAceptadoPersonal(solicitud.getImporteAceptadoPersonal());
				viewModel.setFechaLiquidacion(solicitud.getFechaLiquidacion());
				viewModel.setNumeroDocumentoOJ(solicitud.getNumeroDocumentoOJ());
				viewModel.setExpedienteContableJ(solicitud.getExpedienteContableJ());
				viewModel.setNumeroDocumentoJ(solicitud.getNumeroDocumentoJ());
				viewModel.setNumeroDocumentoO(solicitud.getNumeroDocumentoO());
				viewModel.setExpedienteContablePropuestaO(solicitud.getExpedienteContablePropuestaO());
				
				
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				System.out.println(convocatoria.toString());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setCif(entidad.getCif());
				viewModel.setIdEntidad(solicitud.getIdEntidad());
				
				
				
				viewModel.generarCalculosLiquidacion();
												
				listado.add(viewModel);
				
				
				return listado;
	}

	public List<ReintegroAcuerdoInicioViewModel> getAcuerdoInicioReintegroViewModel(int id) throws Exception {
		
		List<ReintegroAcuerdoInicioViewModel> listado = new ArrayList<ReintegroAcuerdoInicioViewModel>();
		ReintegroAcuerdoInicioViewModel viewModel = new ReintegroAcuerdoInicioViewModel();
		
		Solicitud solicitud = repository.getOne(id);
								
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setImporteAceptadoDietas(solicitud.getImporteAceptadoDietas());
				viewModel.setImporteAceptadoPersonal(solicitud.getImporteAceptadoPersonal());
				viewModel.setFechaLiquidacion(solicitud.getFechaLiquidacion());
				
				
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setIdEntidad(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				
				viewModel.generarCalculosLiquidacion();
				//viewModel.setParrafoNotificacion();
				//viewModel.setParrafoInformacion();
				//viewModel.setParrafoNormativa();
				viewModel.setParrafoDatosSubvencion();
				viewModel.setParrafoVista();
				viewModel.setAntecedente01();
				viewModel.setAntecedente02();
				viewModel.setAntecedente03();
				viewModel.setAntecedente04Minoracion();
				viewModel.setAntecedente04RevisionEconomica();
				viewModel.setAntecedente04RevisionTecnica();
				viewModel.setAntecedente06();
				viewModel.setAntecedente07();
				viewModel.setPropone01();
				
												
				listado.add(viewModel);
				
				
				return listado;
	}

	public List<ReintegroAcuerdoInicioViewModel> getAcuerdoInicioReintegroNotificacion(int id) throws Exception {
		
		List<ReintegroAcuerdoInicioViewModel> listado = new ArrayList<ReintegroAcuerdoInicioViewModel>();
		ReintegroAcuerdoInicioViewModel viewModel = new ReintegroAcuerdoInicioViewModel();
		
		Solicitud solicitud = repository.getOne(id);
								
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setImporteAceptadoDietas(solicitud.getImporteAceptadoDietas());
				viewModel.setImporteAceptadoPersonal(solicitud.getImporteAceptadoPersonal());
				viewModel.setFechaLiquidacion(solicitud.getFechaLiquidacion());
				
				
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setIdEntidad(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				
//				viewModel.generarCalculosLiquidacion();
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
//				viewModel.setParrafoDatosSubvencion();
//				viewModel.setParrafoVista();
//				viewModel.setAntecedente01();
//				viewModel.setAntecedente02();
//				viewModel.setAntecedente03();
//				viewModel.setAntecedente04Minoracion();
//				viewModel.setAntecedente04RevisionEconomica();
//				viewModel.setAntecedente04RevisionTecnica();
//				viewModel.setAntecedente06();
//				viewModel.setAntecedente07();
//				viewModel.setPropone01();
				
												
				listado.add(viewModel);
				
				
				return listado;
	}

	public List<ReintegroResolucionViewModel> getReintegroResolucionNotificacion(int id) {
		
		List<ReintegroResolucionViewModel> listado = new ArrayList<ReintegroResolucionViewModel>();
		ReintegroResolucionViewModel viewModel = new ReintegroResolucionViewModel();
		
		Solicitud solicitud = repository.getOne(id);
								
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setImporteAceptadoDietas(solicitud.getImporteAceptadoDietas());
				viewModel.setImporteAceptadoPersonal(solicitud.getImporteAceptadoPersonal());
				viewModel.setFechaLiquidacion(solicitud.getFechaLiquidacion());
				viewModel.setFechaAcuerdoInicioReintegro(solicitud.getFechaAcuerdoInicioReintegro());
				viewModel.setFechaAlegacionesAIR(solicitud.getFechaAlegacionesAIR());
				viewModel.setNumeroModelo022(solicitud.getNumeroModelo022());
				viewModel.setImporteModelo022(solicitud.getImporteModelo022());
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setIdEntidad(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
				
//				viewModel.generarCalculosLiquidacion();
				viewModel.setParrafoNotificacion();
				viewModel.setParrafoInformacion();
				viewModel.setParrafoNormativa();
//				viewModel.setParrafoDatosSubvencion();
//				viewModel.setParrafoVista();
//				viewModel.setAntecedente01();
//				viewModel.setAntecedente02();
//				viewModel.setAntecedente03();
//				viewModel.setAntecedente04Minoracion();
//				viewModel.setAntecedente04RevisionEconomica();
//				viewModel.setAntecedente04RevisionTecnica();
//				viewModel.setAntecedente06();
//				viewModel.setAntecedente07();
//				viewModel.setPropone01();
				
												
				listado.add(viewModel);
				
				
				return listado;
		
	}

	public List<ReintegroResolucionViewModel> getReintegroResolucion(int id) throws Exception {
		
		List<ReintegroResolucionViewModel> listado = new ArrayList<ReintegroResolucionViewModel>();
		ReintegroResolucionViewModel viewModel = new ReintegroResolucionViewModel();
		
		Solicitud solicitud = repository.getOne(id);
								
				viewModel.setIdSolicitud(solicitud.getIdSolicitud());
				viewModel.setExpediente(solicitud.getExpediente());
				viewModel.setFechaEntrada(solicitud.getFechaEntrada());
				viewModel.setCostePersonal(solicitud.getCostePersonal());
				viewModel.setCosteDietas(solicitud.getCosteDietas());
				viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
				viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
				viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
				viewModel.setImporteOJ(solicitud.getImporteOJ());
				viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
				viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
				viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
				viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
				viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
				viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
				viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
				viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
				viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
				viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
				viewModel.setImporteAceptadoDietas(solicitud.getImporteAceptadoDietas());
				viewModel.setImporteAceptadoPersonal(solicitud.getImporteAceptadoPersonal());
				viewModel.setFechaLiquidacion(solicitud.getFechaLiquidacion());
				viewModel.setFechaAcuerdoInicioReintegro(solicitud.getFechaAcuerdoInicioReintegro());
				viewModel.setFechaAlegacionesAIR(solicitud.getFechaAlegacionesAIR());
				viewModel.setNumeroModelo022(solicitud.getNumeroModelo022());
				viewModel.setImporteModelo022(solicitud.getImporteModelo022());
								
				Convocatoria convocatoria = convocatoriaService.getConvocatoriaById(solicitud.getIdConvocatoria());
				
				viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
				viewModel.setYearConvocatoria(convocatoria.getYear());
				viewModel.setNombreConvocatoria(convocatoria.getNombre());
				viewModel.setAplicacionPresupuestariaCorriente(convocatoria.getAplicacionPresupuestariaCorriente());
				viewModel.setAplicacionPresupuestariaFutura(convocatoria.getAplicacionPresupuestariaFutura());
				viewModel.setFechaInicio(convocatoria.getFechaInicio());
				viewModel.setFechaFin(convocatoria.getFechaFin());
				viewModel.setNumeroDiasYear(convocatoria.getNumeroDiasYear());
				
				
				
				
				Orden orden = ordenService.getOrdenById(convocatoria.getIdOrden());
				viewModel.setNombreOrden(orden.getNombre());
				
				Entidad entidad = entidadService.findEntidadById(solicitud.getIdEntidad());
				viewModel.setIdEntidad(solicitud.getIdEntidad());
				viewModel.setNombreEntidad(entidad.getNombre());
				viewModel.setTipoEntidad(entidad.getTipo());
				viewModel.setDireccion(entidad.getDireccion());
				viewModel.setCodigoPostal(entidad.getCodigoPostal());
				viewModel.setMunicipio(entidad.getMunicipio());
				viewModel.setProvincia(entidad.getProvincia());
				viewModel.setCif(entidad.getCif());
				viewModel.setGrupoEntidad(entidad.getGrupo());
				
				
//				viewModel.setParrafoNotificacion();
//				viewModel.setParrafoInformacion();
//				viewModel.setParrafoNormativa();				
				viewModel.generarCalculosLiquidacion();
				viewModel.setParrafoDatosSubvencion();
				viewModel.setParrafoVista();
				viewModel.setAntecedente01();
				viewModel.setAntecedente02();
				viewModel.setAntecedente03();
				viewModel.setAntecedente04Minoracion();
				viewModel.setAntecedente04RevisionEconomica();
				viewModel.setAntecedente04RevisionTecnica();
				viewModel.setAntecedente06();
				viewModel.setAntecedente07();
				viewModel.setAntecedente08();
				viewModel.setPropone01();
				viewModel.setParrafoAnexoAlegaciones();
				
												
				listado.add(viewModel);
				
				
				return listado;
	}
	
	

	
	
	
	
	
	
}
