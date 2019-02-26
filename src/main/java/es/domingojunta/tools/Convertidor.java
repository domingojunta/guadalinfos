package es.domingojunta.tools;

import java.math.BigDecimal;

import org.javamoney.moneta.Money;
import org.springframework.stereotype.Component;

import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Entidad;
import es.domingojunta.entities.Orden;
import es.domingojunta.entities.Solicitud;
import es.domingojunta.models.convocatoria.ConvocatoriaCrearViewModel;
import es.domingojunta.models.convocatoria.ConvocatoriaListarViewModel;
import es.domingojunta.models.entidad.EntidadCrearViewModel;
import es.domingojunta.models.entidad.EntidadListarViewModel;
import es.domingojunta.models.orden.OrdenCrearViewModel;
import es.domingojunta.models.orden.OrdenListarViewModel;
import es.domingojunta.models.solicitud.SolicitudCrearViewModel;
import es.domingojunta.models.solicitud.SolicitudListarViewModel;

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
		convocatoria.setIdConvocatoria(viewModel.getIdConvocatoria());
		convocatoria.setNombre(viewModel.getNombreConvocatoria());
		convocatoria.setYear(viewModel.getYearConvocatoria());
		convocatoria.setIdOrden(viewModel.getIdOrden());
		convocatoria.setFechaInicio(viewModel.getFechaInicio());
		convocatoria.setFechaFin(viewModel.getFechaFin());
		convocatoria.setImporteAyuntamientoA(new BigDecimal(viewModel.getImporteAyuntamientoA()));
		convocatoria.setImporteAyuntamientoB(new BigDecimal(viewModel.getImporteAyuntamientoB()));
		convocatoria.setImporteAyuntamientoC(new BigDecimal(viewModel.getImporteAyuntamientoC()));
		convocatoria.setImporteELAA(new BigDecimal(viewModel.getImporteELAA()));
		convocatoria.setImporteELAB(new BigDecimal(viewModel.getImporteELAB()));
		convocatoria.setFechaJustificacion(viewModel.getFechaJustificacion());
		convocatoria.setSUBAG(viewModel.getSUBAG());
		convocatoria.setSUBCO(viewModel.getSUBCO());
		convocatoria.setImporteGuadalinfoCorriente(new BigDecimal(viewModel.getImporteGuadalinfoCorriente()));
		convocatoria.setImporteGuadalinfoFuturo(new BigDecimal(viewModel.getImporteGuadalinfoFuturo()));
		convocatoria.setImporteELACorriente(new BigDecimal(viewModel.getImporteELACorriente()));
		convocatoria.setImporteELAFuturo(new BigDecimal(viewModel.getImporteELAFuturo()));
		convocatoria.setNumeroDias(viewModel.getNumeroDias());
		convocatoria.setAplicacionPresupuestariaCorriente(viewModel.getAplicacionPresupuestariaCorriente());
		convocatoria.setAplicacionPresupuestariaFutura(viewModel.getAplicacionPresupuestariaFutura());
		convocatoria.setResuelvePago(viewModel.getResuelvePago());
		convocatoria.setResuelveJustificacion(viewModel.getResuelveJustificacion());
		
		
		return convocatoria;
	}

	public Convocatoria ConvocatoriaCrearViewModel2Convocatoria(Convocatoria convocatoria,
			ConvocatoriaCrearViewModel viewModel) {
		convocatoria.setNombre(viewModel.getNombreConvocatoria());
		convocatoria.setYear(viewModel.getYearConvocatoria());
		convocatoria.setIdOrden(viewModel.getIdOrden());
		convocatoria.setFechaInicio(viewModel.getFechaInicio());
		convocatoria.setFechaFin(viewModel.getFechaFin());
		convocatoria.setImporteAyuntamientoA(new BigDecimal(viewModel.getImporteAyuntamientoA()));
		convocatoria.setImporteAyuntamientoB(new BigDecimal(viewModel.getImporteAyuntamientoB()));
		convocatoria.setImporteAyuntamientoC(new BigDecimal(viewModel.getImporteAyuntamientoC()));
		convocatoria.setImporteELAA(new BigDecimal(viewModel.getImporteELAA()));
		convocatoria.setImporteELAB(new BigDecimal(viewModel.getImporteELAB()));
		convocatoria.setFechaJustificacion(viewModel.getFechaJustificacion());
		convocatoria.setSUBAG(viewModel.getSUBAG());
		convocatoria.setSUBCO(viewModel.getSUBCO());
		convocatoria.setImporteGuadalinfoCorriente(new BigDecimal(viewModel.getImporteGuadalinfoCorriente()));
		convocatoria.setImporteGuadalinfoFuturo(new BigDecimal(viewModel.getImporteGuadalinfoFuturo()));
		convocatoria.setImporteELACorriente(new BigDecimal(viewModel.getImporteELACorriente()));
		convocatoria.setImporteELAFuturo(new BigDecimal(viewModel.getImporteELAFuturo()));
		convocatoria.setNumeroDias(viewModel.getNumeroDias());
		convocatoria.setAplicacionPresupuestariaCorriente(viewModel.getAplicacionPresupuestariaCorriente());
		convocatoria.setAplicacionPresupuestariaFutura(viewModel.getAplicacionPresupuestariaFutura());
		convocatoria.setResuelvePago(viewModel.getResuelvePago());
		convocatoria.setResuelveJustificacion(viewModel.getResuelveJustificacion());
		return convocatoria;
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
		//System.out.println("La fecha aet que entra al converter es: "+sol.getFechaAeat());
		Solicitud solicitud = new Solicitud();
		solicitud.setIdSolicitud(vm.getIdSolicitud());
		solicitud.setIdConvocatoria(vm.getIdConvocatoria());
		solicitud.setIdEntidad(vm.getIdEntidad());
		solicitud.setFechaEntrada(vm.getFechaEntrada());
		solicitud.setExpediente(vm.getExpediente());
		solicitud.setSUBCC(vm.getSUBCC());
		solicitud.setCostePersonal(new BigDecimal(vm.getCostePersonal()));
		solicitud.setCosteDietas(new BigDecimal(vm.getCosteDietas()));
		solicitud.setSubvencionPersonal(new BigDecimal(vm.getSubvencionPersonal()));
		solicitud.setSubvencionDietas(new BigDecimal(vm.getSubvencionDietas()));
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
		solicitud.setNumeroDiasFuncionamiento(vm.getNumeroDiasFuncionamiento());
		solicitud.setObjetivoNumeroActividades(vm.getObjetivoNumeroActividades());
		solicitud.setObjetivoNumeroActividadesMarcadas(vm.getObjetivoNumeroActividadesMarcadas());
		solicitud.setObjetivoNumeroMeses(vm.getObjetivoNumeroMeses());
		solicitud.setNumeroActividadesAlcanzado(vm.getNumeroActividadesAlcanzado());
		solicitud.setNumeroActividadesMarcadasAlcanzado(vm.getNumeroActividadesMarcadasAlcanzado());
		solicitud.setNumeroMesesAlcanzado(vm.getNumeroMesesAlcanzado());
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
		solicitud.setNumeroPropuestaDocumentoO(vm.getNumeroPropuestaDocumentoO());
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
		viewModel.setSUBCC(solicitud.getSUBCC());
		viewModel.setCostePersonal(solicitud.getCostePersonal());
		viewModel.setCosteDietas(solicitud.getCosteDietas());
		viewModel.setSubvencionPersonal(solicitud.getSubvencionPersonal());
		viewModel.setSubvencionDietas(solicitud.getSubvencionDietas());
		viewModel.setFechaComunicacionEntrada(solicitud.getFechaComunicacionEntrada());
		//System.out.println("La fecha aeat de la solicitud es: "+solicitud.getFechaAeat());
		viewModel.setFechaAeat(solicitud.getFechaAeat());
		//System.out.println("La fecha del viewModel es: "+ viewModel.getFechaAeat());
		viewModel.setFechaAtrian(solicitud.getFechaAtrian());
		viewModel.setFechaSeguridadSocial(solicitud.getFechaSeguridadSocial());
		viewModel.setFechaRequerimientoSolicitud(solicitud.getFechaRequerimientoSolicitud());
		viewModel.setFechaPropuestaConcesion(solicitud.getFechaPropuestaConcesion());
		viewModel.setExpedienteContableD(solicitud.getExpedienteContableD());
		viewModel.setNumeroDocumentoD(solicitud.getNumeroDocumentoD());
		viewModel.setFechaResolucionConcesion(solicitud.getFechaResolucionConcesion());
		viewModel.setFechaNotificacionResolucionConcesion(solicitud.getFechaResolucionConcesion());
		
		
		viewModel.setFechaPropuestaOJ(solicitud.getFechaPropuestaOJ());
		viewModel.setExpedienteContableOJ(solicitud.getExpedienteContableOJ());
		viewModel.setNumeroDocumentoOJ(solicitud.getNumeroDocumentoOJ());
		viewModel.setImporteOJ(solicitud.getImporteOJ());
		viewModel.setFechaPagoMaterialOJ(solicitud.getFechaPagoMaterialOJ());
		viewModel.setNumeroDocumentoOM(solicitud.getNumeroDocumentoOM());
		viewModel.setNumeroDiasFuncionamiento(solicitud.getNumeroDiasFuncionamiento());
		viewModel.setObjetivoNumeroActividades(solicitud.getObjetivoNumeroActividades());
		viewModel.setObjetivoNumeroActividadesMarcadas(solicitud.getObjetivoNumeroActividadesMarcadas());
		viewModel.setObjetivoNumeroMeses(solicitud.getObjetivoNumeroMeses());
		viewModel.setNumeroActividadesAlcanzado(solicitud.getNumeroActividadesAlcanzado());
		viewModel.setNumeroActividadesMarcadasAlcanzado(solicitud.getNumeroActividadesMarcadasAlcanzado());
		viewModel.setNumeroMesesAlcanzado(solicitud.getNumeroMesesAlcanzado());
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
		viewModel.setNumeroPropuestaDocumentoO(solicitud.getNumeroPropuestaDocumentoO());
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
		solicitud.setIdConvocatoria(vm.getIdConvocatoria());
		solicitud.setIdEntidad(vm.getIdEntidad());
		solicitud.setFechaEntrada(vm.getFechaEntrada());
		solicitud.setExpediente(vm.getExpediente());
		solicitud.setSUBCC(vm.getSUBCC());
		solicitud.setCostePersonal(new BigDecimal(vm.getCostePersonal()));
		solicitud.setCosteDietas(new BigDecimal(vm.getCosteDietas()));
		solicitud.setSubvencionPersonal(new BigDecimal(vm.getSubvencionPersonal()));
		solicitud.setSubvencionDietas(new BigDecimal(vm.getSubvencionDietas()));
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
		solicitud.setNumeroDiasFuncionamiento(vm.getNumeroDiasFuncionamiento());
		solicitud.setObjetivoNumeroActividades(vm.getObjetivoNumeroActividades());
		solicitud.setObjetivoNumeroActividadesMarcadas(vm.getObjetivoNumeroActividadesMarcadas());
		solicitud.setObjetivoNumeroMeses(vm.getObjetivoNumeroMeses());
		solicitud.setNumeroActividadesAlcanzado(vm.getNumeroActividadesAlcanzado());
		solicitud.setNumeroActividadesMarcadasAlcanzado(vm.getNumeroActividadesMarcadasAlcanzado());
		solicitud.setNumeroMesesAlcanzado(vm.getNumeroMesesAlcanzado());
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
		solicitud.setNumeroPropuestaDocumentoO(vm.getNumeroPropuestaDocumentoO());
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
	
	

}
