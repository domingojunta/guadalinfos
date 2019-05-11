package es.domingojunta.tools;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import es.domingojunta.entities.ApplicationUser;
import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Entidad;
import es.domingojunta.entities.Orden;
import es.domingojunta.entities.Solicitud;
import es.domingojunta.model.ApplicationUserViewModel;
import es.domingojunta.model.ConvocatoriaCrearViewModel;
import es.domingojunta.model.ConvocatoriaListarViewModel;
import es.domingojunta.model.EntidadCrearViewModel;
import es.domingojunta.model.EntidadListarViewModel;
import es.domingojunta.model.OrdenCrearViewModel;
import es.domingojunta.model.OrdenListarViewModel;
import es.domingojunta.model.SolicitudCrearViewModel;
import es.domingojunta.model.SolicitudListarViewModel;

@Component
public class Convertidor {
	
	public Orden OrdenListarViewModel2Orden(Orden orden, OrdenListarViewModel viewModel) {
		orden.setIdOrden(viewModel.getIdOrden());
		orden.setNombre(viewModel.getNombreOrden());
		orden.setAlias(viewModel.getAliasOrden());
		return orden;
		
	}
	
	public Orden OrdenCrearViewModel2Orden(Orden orden, OrdenCrearViewModel viewModel) {
		orden.setNombre(viewModel.getNombreOrden());
		orden.setAlias(viewModel.getAliasOrden());
		return orden;
		
	}

	public Convocatoria ConvocatoriaListarViewModel2Convocatoria(Convocatoria convocatoria,
			ConvocatoriaListarViewModel viewModel) {
		
		try {
			convocatoria.setIdConvocatoria(viewModel.getIdConvocatoria());
			convocatoria.setNombre(viewModel.getNombreConvocatoria());
			convocatoria.setYear(viewModel.getYearConvocatoria());
			convocatoria.setIdOrden(viewModel.getIdOrden());
			
			convocatoria.setFechaInicio(viewModel.getFechaInicio());
			convocatoria.setFechaFin(viewModel.getFechaFin());
			convocatoria.setImporteAyuntamientoA(viewModel.getImporteAyuntamientoA());
			convocatoria.setImporteAyuntamientoB(viewModel.getImporteAyuntamientoB());
			convocatoria.setImporteAyuntamientoC(viewModel.getImporteAyuntamientoC());
			convocatoria.setImporteELAA(viewModel.getImporteELAA());
			convocatoria.setImporteELAB(viewModel.getImporteELAB());
			convocatoria.setFechaJustificacion(viewModel.getFechaJustificacion());
			convocatoria.setSUBAG(viewModel.getSUBAG());
			convocatoria.setSUBCO(viewModel.getSUBCO());
			convocatoria.setImporteGuadalinfoCorriente(viewModel.getImporteGuadalinfoCorriente());
			convocatoria.setImporteGuadalinfoFuturo(viewModel.getImporteGuadalinfoFuturo());
			convocatoria.setImporteELACorriente(viewModel.getImporteELACorriente());
			convocatoria.setImporteELAFuturo(viewModel.getImporteELAFuturo());
			//convocatoria.setNumeroDiasCerrado(viewModel.getNumeroDiasCerrado());
			convocatoria.setNumeroDiasYear(viewModel.getNumeroDiasYear());
			convocatoria.setAplicacionPresupuestariaCorriente(viewModel.getAplicacionPresupuestariaCorriente());
     		convocatoria.setAplicacionPresupuestariaFutura(viewModel.getAplicacionPresupuestariaFutura());
			
			
		} catch (Exception e) {
			System.out.println("Error al convertir viewModel en Entity");
			System.out.println(e.getMessage());
		}
		
		
		
		return convocatoria;
	}

	public Convocatoria ConvocatoriaCrearViewModel2Convocatoria(Convocatoria convocatoria,
			ConvocatoriaCrearViewModel viewModel) {
		
		convocatoria.setNombre(viewModel.getNombreConvocatoria());
		convocatoria.setYear(viewModel.getYearConvocatoria());
		convocatoria.setIdOrden(viewModel.getIdOrden());
		convocatoria.setFechaInicio(viewModel.getFechaInicio());
		convocatoria.setFechaFin(viewModel.getFechaFin());
		convocatoria.setImporteAyuntamientoA(viewModel.getImporteAyuntamientoA());
		convocatoria.setImporteAyuntamientoB(viewModel.getImporteAyuntamientoB());
		convocatoria.setImporteAyuntamientoC(viewModel.getImporteAyuntamientoC());
		convocatoria.setImporteELAA(viewModel.getImporteELAA());
		convocatoria.setImporteELAB(viewModel.getImporteELAB());
		convocatoria.setFechaJustificacion(viewModel.getFechaJustificacion());
		convocatoria.setSUBAG(viewModel.getSUBAG());
		convocatoria.setSUBCO(viewModel.getSUBCO());
		convocatoria.setImporteGuadalinfoCorriente(viewModel.getImporteGuadalinfoCorriente());
		convocatoria.setImporteGuadalinfoFuturo(viewModel.getImporteGuadalinfoFuturo());
		convocatoria.setImporteELACorriente(viewModel.getImporteELACorriente());
		convocatoria.setImporteELAFuturo(viewModel.getImporteELAFuturo());
		//convocatoria.setNumeroDiasCerrado(viewModel.getNumeroDiasCerrado());
		convocatoria.setNumeroDiasYear(viewModel.getNumeroDiasYear());
		convocatoria.setAplicacionPresupuestariaCorriente(viewModel.getAplicacionPresupuestariaCorriente());
		convocatoria.setAplicacionPresupuestariaFutura(viewModel.getAplicacionPresupuestariaFutura());
		
		return convocatoria;
	}

	public ConvocatoriaListarViewModel Entidad2ConvocatoriaListarViewModel(Convocatoria item) {
		
		ConvocatoriaListarViewModel vm = new ConvocatoriaListarViewModel();
		try {
			vm.setIdConvocatoria(item.getIdConvocatoria());
			vm.setNombreConvocatoria(item.getNombre());
			vm.setYearConvocatoria(item.getYear());
			vm.setIdOrden(item.getIdOrden());
			vm.setFechaInicio(item.getFechaInicio());
			vm.setFechaFin(item.getFechaFin());
			vm.setImporteAyuntamientoA(item.getImporteAyuntamientoA());
			vm.setImporteAyuntamientoB(item.getImporteAyuntamientoB());
			vm.setImporteAyuntamientoC(item.getImporteAyuntamientoC());
			vm.setImporteELAA(item.getImporteELAA());
			vm.setImporteELAB(item.getImporteELAB());
			vm.setFechaJustificacion(item.getFechaJustificacion());
			vm.setSUBAG(item.getSUBAG());
			vm.setSUBCO(item.getSUBCO());
			vm.setImporteGuadalinfoCorriente(item.getImporteGuadalinfoCorriente());
			vm.setImporteGuadalinfoFuturo(item.getImporteGuadalinfoFuturo());
			vm.setImporteELACorriente(item.getImporteELACorriente());
			vm.setImporteELAFuturo(item.getImporteELAFuturo());
			//vm.setNumeroDiasCerrado(item.getNumeroDiasCerrado());
			vm.setNumeroDiasYear(item.getNumeroDiasYear());
			vm.setAplicacionPresupuestariaCorriente(item.getAplicacionPresupuestariaCorriente());
     		vm.setAplicacionPresupuestariaFutura(item.getAplicacionPresupuestariaFutura());
			
			
		} catch (Exception e) {
			System.out.println("Error al convertir viewModel en Entity");
			System.out.println(e.getMessage());
			return vm;
		}
		
		
		
		return vm;
	}
	
	
	public Entidad EntidadListarViewModel2Entidad(Entidad entidad, EntidadListarViewModel viewModel) {
		
		entidad.setIdEntidad(viewModel.getIdEntidad());
		entidad.setNombre(viewModel.getNombreEntidad());
		entidad.setAcreedorGIRO(viewModel.getAcreedorGIRO());
		entidad.setCif(viewModel.getCif());
		entidad.setDireccion(viewModel.getDireccion());
		entidad.setCodigoPostal(viewModel.getCodigoPostal());
		entidad.setMunicipio(viewModel.getMunicipio());
		entidad.setProvincia(viewModel.getProvincia());
		entidad.setEmailAyuntamiento(viewModel.getEmailAyuntamiento());
		entidad.setEmailCentro(viewModel.getEmailCentro());
		entidad.setTipo(viewModel.getTipoEntidad());
		entidad.setGrupo(viewModel.getGrupoEntidad());
		entidad.setIBAN(viewModel.getIBAN());
		entidad.setPosicionIBAN(viewModel.getPosicionIBAN());
		
		
		
		return entidad;
	}

	public Entidad EntidadCrearViewModel2Entidad(Entidad entidad, EntidadCrearViewModel viewModel) {
		
		entidad.setNombre(viewModel.getNombreEntidad());
		entidad.setAcreedorGIRO(viewModel.getAcreedorGIRO());
		entidad.setCif(viewModel.getCif());
		entidad.setDireccion(viewModel.getDireccion());
		entidad.setCodigoPostal(viewModel.getCodigoPostal());
		entidad.setMunicipio(viewModel.getMunicipio());
		entidad.setProvincia(viewModel.getProvincia());
		entidad.setEmailAyuntamiento(viewModel.getEmailAyuntamiento());
		entidad.setEmailCentro(viewModel.getEmailCentro());
		entidad.setTipo(viewModel.getTipoEntidad());
		entidad.setGrupo(viewModel.getGrupoEntidad());
		entidad.setIBAN(viewModel.getIBAN());
		entidad.setPosicionIBAN(viewModel.getPosicionIBAN());
		return entidad;
	}

	public Solicitud SolicitudListarViewModel2Entidad(SolicitudListarViewModel vm) {
		
		Solicitud solicitud = new Solicitud();
		solicitud.setIdSolicitud(vm.getIdSolicitud());
		solicitud.setIdConvocatoria(vm.getIdConvocatoria());
		solicitud.setIdEntidad(vm.getIdEntidad());
		solicitud.setFechaEntrada(vm.getFechaEntrada());
		solicitud.setExpediente(vm.getExpediente());
		solicitud.setSubcc(vm.getSubcc());
		solicitud.setCostePersonal(vm.getCostePersonal());
		solicitud.setCosteDietas(vm.getCosteDietas());
		solicitud.setSubvencionPersonal(vm.getSubvencionPersonal());
		solicitud.setSubvencionDietas(vm.getSubvencionDietas());
		solicitud.setFechaComunicacionEntrada(vm.getFechaComunicacionEntrada());
		solicitud.setFechaAeat(vm.getFechaAeat());
		solicitud.setFechaAtrian(vm.getFechaAtrian());
		solicitud.setFechaSeguridadSocial(vm.getFechaSeguridadSocial());
		solicitud.setFechaRequerimientoSolicitud(vm.getFechaRequerimientoSolicitud());
		solicitud.setFechaPropuestaConcesion(vm.getFechaPropuestaConcesion());
		solicitud.setExpedienteContableD(vm.getExpedienteContableD());
		solicitud.setNumeroDocumentoD(vm.getNumeroDocumentoD());
		solicitud.setFechaNotificacionResolucionConcesion(vm.getFechaNotificacionResolucionConcesion());
		solicitud.setFechaResolucionConcesion(vm.getFechaResolucionConcesion());
		
		solicitud.setFechaPropuestaOJ(vm.getFechaPropuestaOJ());
		solicitud.setExpedienteContableOJ(vm.getExpedienteContableOJ());
		solicitud.setNumeroDocumentoOJ(vm.getNumeroDocumentoOJ());
		solicitud.setImporteOJ(vm.getImporteOJ());
		solicitud.setFechaPagoMaterialOJ(vm.getFechaPagoMaterialOJ());
		solicitud.setNumeroDocumentoOM(vm.getNumeroDocumentoOM());
		solicitud.setNumeroDiasCerrado(vm.getNumeroDiasCerrado());
		solicitud.setObjetivoNumeroActividades(vm.getObjetivoNumeroActividades());
		solicitud.setObjetivoNumeroActividadesMarcadas(vm.getObjetivoNumeroActividadesMarcadas());
		solicitud.setObjetivoNumeroMeses(vm.getObjetivoNumeroMeses());
		solicitud.setNumeroActividadesAlcanzado(vm.getNumeroActividadesAlcanzado());
		solicitud.setNumeroActividadesMarcadasAlcanzado(vm.getNumeroActividadesMarcadasAlcanzado());
		solicitud.setNumeroMesesAlcanzado(vm.getNumeroMesesAlcanzado());
		solicitud.setGradoCumplimientoTecnico(vm.getGradoCumplimientoTecnico());
		solicitud.setImporteJustificadoPersonal(vm.getImporteJustificadoPersonal());
		solicitud.setImporteJustificadoDietas(vm.getImporteJustificadoDietas());
		solicitud.setImporteAceptadoPersonal(vm.getImporteAceptadoPersonal());
		solicitud.setImporteAceptadoDietas(vm.getImporteAceptadoDietas());
		
		solicitud.setFechaPropuestaLiquidacion(vm.getFechaPropuestaLiquidacion());
		solicitud.setFechaAlegacionesPropuestaLiquidacion(vm.getFechaAlegacionesPropuestaLiquidacion());
		solicitud.setFechaLiquidacion(vm.getFechaLiquidacion());
		solicitud.setFechaNotificacionLiquidacion(vm.getFechaNotificacionLiquidacion());
		
		solicitud.setExpedienteContableJ(vm.getExpedienteContableJ());
		solicitud.setNumeroDocumentoJ(vm.getNumeroDocumentoJ());
		
		
		solicitud.setExpedienteContablePropuestaO(vm.getExpedienteContablePropuestaO());
		solicitud.setNumeroDocumentoO(vm.getNumeroDocumentoO());
		solicitud.setFechaPagoMaterialO(vm.getFechaPagoMaterialO());
		
		solicitud.setFechaAcuerdoInicioReintegro(vm.getFechaAcuerdoInicioReintegro());
		solicitud.setFechaAlegacionesAIR(vm.getFechaAlegacionesAIR());
		solicitud.setFechaResolucionReintegro(vm.getFechaResolucionReintegro());
		solicitud.setNumeroModelo022(vm.getNumeroModelo022());
		solicitud.setImporteModelo022(vm.getImporteModelo022());
		solicitud.setFechaNotificacionResolucionReintegro(vm.getFechaNotificacionResolucionReintegro());
		solicitud.setFechaAbonoReintegro(vm.getFechaAbonoReintegro());
		
		
		
		return solicitud;
	}
	
	public SolicitudListarViewModel Entidad2SolicitudListarViewModel (Solicitud solicitud) {
		
		SolicitudListarViewModel viewModel = new SolicitudListarViewModel();
		viewModel.setIdSolicitud(solicitud.getIdSolicitud());
		viewModel.setIdConvocatoria(solicitud.getIdConvocatoria());
		viewModel.setIdEntidad(solicitud.getIdEntidad());
		viewModel.setFechaEntrada(solicitud.getFechaEntrada());
		viewModel.setExpediente(solicitud.getExpediente());
		viewModel.setSubcc(solicitud.getSubcc());
		viewModel.setCostePersonal(solicitud.getCostePersonal());
		viewModel.setCosteDietas(solicitud.getCosteDietas());
		viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
		viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
		viewModel.setFechaComunicacionEntrada(solicitud.getFechaComunicacionEntrada());
		viewModel.setFechaAeat(solicitud.getFechaAeat());
		viewModel.setFechaAtrian(solicitud.getFechaAtrian());
		viewModel.setFechaSeguridadSocial(solicitud.getFechaSeguridadSocial());
		viewModel.setFechaRequerimientoSolicitud(solicitud.getFechaRequerimientoSolicitud());
		viewModel.setFechaPropuestaConcesion(solicitud.getFechaPropuestaConcesion());
		viewModel.setExpedienteContableD(solicitud.getExpedienteContableD());
		viewModel.setNumeroDocumentoD(solicitud.getNumeroDocumentoD());
		viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
		viewModel.setFechaNotificacionResolucionConcesion(solicitud.getFechaNotificacionResolucionConcesion());
		
		
		viewModel.setFechaPropuestaOJ(solicitud.getFechaPropuestaOJ());
		viewModel.setExpedienteContableOJ(solicitud.getExpedienteContableOJ());
		viewModel.setNumeroDocumentoOJ(solicitud.getNumeroDocumentoOJ());
		viewModel.setImporteOJ(solicitud.getImporteOJ());
		viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
		viewModel.setNumeroDocumentoOM(solicitud.getNumeroDocumentoOM());
		viewModel.setNumeroDiasCerrado(solicitud.getNumeroDiasCerrado());
		viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
		viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getObjetivoNumeroActividadesMarcadas());
		viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
		viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
		viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
		viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
		viewModel.setGradoCumplimientoTecnico(solicitud.getGradoCumplimientoTecnico());
		viewModel.setImporteJustificadoPersonal(solicitud.getImporteJustificadoPersonal());
		viewModel.setImporteJustificadoDietas(solicitud.getImporteJustificadoDietas());
		viewModel.setImporteAceptadoPersonal(solicitud.getImporteAceptadoPersonal());
		viewModel.setImporteAceptadoDietas(solicitud.getImporteAceptadoDietas());
		
		viewModel.setFechaPropuestaLiquidacion(solicitud.getFechaPropuestaLiquidacion());
		viewModel.setFechaAlegacionesPropuestaLiquidacion(solicitud.getFechaAlegacionesPropuestaLiquidacion());
		viewModel.setFechaLiquidacion(solicitud.getFechaLiquidacion());
		viewModel.setFechaNotificacionLiquidacion(solicitud.getFechaNotificacionLiquidacion());
		
		viewModel.setExpedienteContableJ(solicitud.getExpedienteContableJ());
		viewModel.setNumeroDocumentoJ(solicitud.getNumeroDocumentoJ());
		viewModel.setExpedienteContablePropuestaO(solicitud.getExpedienteContablePropuestaO());
		
		viewModel.setNumeroDocumentoO(solicitud.getNumeroDocumentoO());
		viewModel.setFechaPagoMaterialO(solicitud.getFechaPagoMaterialO());
		
		viewModel.setFechaAcuerdoInicioReintegro(solicitud.getFechaAcuerdoInicioReintegro());
		viewModel.setFechaAlegacionesAIR(solicitud.getFechaAlegacionesAIR());
		viewModel.setFechaResolucionReintegro(solicitud.getFechaResolucionReintegro());
		viewModel.setNumeroModelo022(solicitud.getNumeroModelo022());
		viewModel.setImporteModelo022(solicitud.getImporteModelo022());
		viewModel.setFechaNotificacionResolucionReintegro(solicitud.getFechaNotificacionResolucionReintegro());
		viewModel.setFechaAbonoReintegro(solicitud.getFechaAbonoReintegro());
		
		return viewModel;
	}

	public Solicitud SolicitudCrearViewModel2Entidad(SolicitudCrearViewModel vm) {
		
		Solicitud solicitud = new Solicitud();
		//solicitud.setIdSolicitud(vm.getIdSolicitud());
		System.out.println("Entrando en el convertidor, viewmodel con expt.= "+vm.getExpediente());
		solicitud.setIdConvocatoria(vm.getIdConvocatoria());
		solicitud.setIdEntidad(vm.getIdEntidad());
		solicitud.setFechaEntrada(vm.getFechaEntrada());
		solicitud.setExpediente(vm.getExpediente());
		solicitud.setSubcc(vm.getSubcc());
		solicitud.setCostePersonal(vm.getCostePersonal());
		solicitud.setCosteDietas(vm.getCosteDietas());
		solicitud.setSubvencionPersonal(vm.getSubvencionPersonal());
		solicitud.setSubvencionDietas(vm.getSubvencionDietas());
		solicitud.setFechaComunicacionEntrada(vm.getFechaComunicacionEntrada());
		solicitud.setFechaAeat(vm.getFechaAeat());
		solicitud.setFechaAtrian(vm.getFechaAtrian());
		solicitud.setFechaSeguridadSocial(vm.getFechaSeguridadSocial());
		solicitud.setFechaRequerimientoSolicitud(vm.getFechaRequerimientoSolicitud());
		solicitud.setFechaPropuestaConcesion(vm.getFechaPropuestaConcesion());
		solicitud.setExpedienteContableD(vm.getExpedienteContableD());
		solicitud.setNumeroDocumentoD(vm.getNumeroDocumentoD());
		solicitud.setFechaNotificacionResolucionConcesion(vm.getFechaNotificacionResolucionConcesion());
		solicitud.setFechaResolucionConcesion(vm.getFechaResolucionConcesion());
		
		solicitud.setFechaPropuestaOJ(vm.getFechaPropuestaOJ());
		solicitud.setExpedienteContableOJ(vm.getExpedienteContableOJ());
		solicitud.setNumeroDocumentoOJ(vm.getNumeroDocumentoOJ());
		solicitud.setImporteOJ(vm.getImporteOJ());
		solicitud.setFechaPagoMaterialOJ(vm.getFechaPagoMaterialOJ());
		solicitud.setNumeroDocumentoOM(vm.getNumeroDocumentoOM());
		solicitud.setNumeroDiasCerrado(vm.getNumeroDiasCerrado());
		solicitud.setObjetivoNumeroActividades(vm.getObjetivoNumeroActividades());
		solicitud.setObjetivoNumeroActividadesMarcadas(vm.getObjetivoNumeroActividadesMarcadas());
		solicitud.setObjetivoNumeroMeses(vm.getObjetivoNumeroMeses());
		solicitud.setNumeroActividadesAlcanzado(vm.getNumeroActividadesAlcanzado());
		solicitud.setNumeroActividadesMarcadasAlcanzado(vm.getNumeroActividadesMarcadasAlcanzado());
		solicitud.setNumeroMesesAlcanzado(vm.getNumeroMesesAlcanzado());
		solicitud.setGradoCumplimientoTecnico(vm.getGradoCumplimientoTecnico());
		
		solicitud.setImporteJustificadoPersonal(vm.getImporteJustificadoPersonal());
		solicitud.setImporteJustificadoDietas(vm.getImporteJustificadoDietas());
		solicitud.setImporteAceptadoPersonal(vm.getImporteAceptadoPersonal());
		solicitud.setImporteAceptadoDietas(vm.getImporteAceptadoDietas());
		
		solicitud.setFechaPropuestaLiquidacion(vm.getFechaPropuestaLiquidacion());
		solicitud.setFechaAlegacionesPropuestaLiquidacion(vm.getFechaAlegacionesPropuestaLiquidacion());
		solicitud.setFechaLiquidacion(vm.getFechaLiquidacion());
		solicitud.setFechaNotificacionLiquidacion(vm.getFechaNotificacionLiquidacion());
		
		solicitud.setExpedienteContableJ(vm.getExpedienteContableJ());
		solicitud.setNumeroDocumentoJ(vm.getNumeroDocumentoJ());
		
		
		solicitud.setExpedienteContablePropuestaO(vm.getExpedienteContablePropuestaO());
		solicitud.setNumeroDocumentoO(vm.getNumeroDocumentoO());
		solicitud.setFechaPagoMaterialO(vm.getFechaPagoMaterialO());
		
		solicitud.setFechaAcuerdoInicioReintegro(vm.getFechaAcuerdoInicioReintegro());
		solicitud.setFechaAlegacionesAIR(vm.getFechaAlegacionesAIR());
		solicitud.setFechaResolucionReintegro(vm.getFechaResolucionReintegro());
		solicitud.setNumeroModelo022(vm.getNumeroModelo022());
		solicitud.setImporteModelo022(vm.getImporteModelo022());
		solicitud.setFechaNotificacionResolucionReintegro(vm.getFechaNotificacionResolucionReintegro());
		solicitud.setFechaAbonoReintegro(vm.getFechaAbonoReintegro());
		
		return solicitud;
	}

	
	public ApplicationUser applicationUserViewModel2ApplicationUser (ApplicationUserViewModel model) {
		
		ApplicationUser appuser = new ApplicationUser();
		appuser.setIdUsuario(model.getIdUsuario());
		appuser.setNombreUsuario(model.getNombreUsuario());
		appuser.setPassword(model.getPassword());
		appuser.setRol(model.getRol());
		appuser.setActivo(model.isActivo());
		return appuser;
	}
	
	public ApplicationUserViewModel applicationUser2ApplicationUserViewModel (ApplicationUser appuser) {
		
		ApplicationUserViewModel model = new ApplicationUserViewModel();
		model.setIdUsuario(appuser.getIdUsuario());
		model.setNombreUsuario(appuser.getNombreUsuario());
		model.setPassword(appuser.getPassword());
		model.setRol(appuser.getRol());
		model.setActivo(appuser.isActivo());
		return model;
	}
	

}
