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
			ConvocatoriaListarViewModel vm) {
		convocatoria.setIdConvocatoria(vm.getIdConvocatoria());
		convocatoria.setNombre(vm.getNombreConvocatoria());
		convocatoria.setYear(vm.getYearConvocatoria());
		convocatoria.setIdOrden(vm.getIdOrden());
		convocatoria.setFechaInicio(vm.getFechaInicio());
		convocatoria.setFechaFin(vm.getFechaFin());
		convocatoria.setImporteAyuntamientoA(new BigDecimal(vm.getImporteAyuntamientoA()));
		convocatoria.setImporteAyuntamientoB(new BigDecimal(vm.getImporteAyuntamientoB()));
		convocatoria.setImporteAyuntamientoC(new BigDecimal(vm.getImporteAyuntamientoC()));
		convocatoria.setImporteELAA(new BigDecimal(vm.getImporteELAA()));
		convocatoria.setImporteELAB(new BigDecimal(vm.getImporteELAB()));
		convocatoria.setFechaJustificacion(vm.getFechaJustificacion());
		convocatoria.setSUBAG(vm.getSUBAG());
		convocatoria.setSUBCO(vm.getSUBCO());
		convocatoria.setImporteGuadalinfoCorriente(new BigDecimal(vm.getImporteGuadalinfoCorriente()));
		convocatoria.setImporteGuadalinfoFuturo(new BigDecimal(vm.getImporteGuadalinfoFuturo()));
		convocatoria.setImporteELACorriente(new BigDecimal(vm.getImporteELACorriente()));
		convocatoria.setImporteELAFuturo(new BigDecimal(vm.getImporteELAFuturo()));
		convocatoria.setNumeroDias(vm.getNumeroDias());
		convocatoria.setAplicacionPresupuestariaCorriente(vm.getAplicacionPresupuestariaCorriente());
		convocatoria.setAplicacionPresupuestariaFutura(vm.getAplicacionPresupuestariaFutura());
		convocatoria.setResuelvePago(vm.getResuelvePago());
		convocatoria.setResuelveJustificacion(vm.getResuelveJustificacion());
		
		
		return convocatoria;
	}

	public Convocatoria ConvocatoriaCrearViewModel2Convocatoria(Convocatoria convocatoria,
			ConvocatoriaCrearViewModel vm) {
		convocatoria.setNombre(vm.getNombreConvocatoria());
		convocatoria.setYear(vm.getYearConvocatoria());
		convocatoria.setIdOrden(vm.getIdOrden());
		convocatoria.setFechaInicio(vm.getFechaInicio());
		convocatoria.setFechaFin(vm.getFechaFin());
		convocatoria.setImporteAyuntamientoA(new BigDecimal(vm.getImporteAyuntamientoA()));
		convocatoria.setImporteAyuntamientoB(new BigDecimal(vm.getImporteAyuntamientoB()));
		convocatoria.setImporteAyuntamientoC(new BigDecimal(vm.getImporteAyuntamientoC()));
		convocatoria.setImporteELAA(new BigDecimal(vm.getImporteELAA()));
		convocatoria.setImporteELAB(new BigDecimal(vm.getImporteELAB()));
		convocatoria.setFechaJustificacion(vm.getFechaJustificacion());
		convocatoria.setSUBAG(vm.getSUBAG());
		convocatoria.setSUBCO(vm.getSUBCO());
		convocatoria.setImporteGuadalinfoCorriente(new BigDecimal(vm.getImporteGuadalinfoCorriente()));
		convocatoria.setImporteGuadalinfoFuturo(new BigDecimal(vm.getImporteGuadalinfoFuturo()));
		convocatoria.setImporteELACorriente(new BigDecimal(vm.getImporteELACorriente()));
		convocatoria.setImporteELAFuturo(new BigDecimal(vm.getImporteELAFuturo()));
		convocatoria.setNumeroDias(vm.getNumeroDias());
		convocatoria.setAplicacionPresupuestariaCorriente(vm.getAplicacionPresupuestariaCorriente());
		convocatoria.setAplicacionPresupuestariaFutura(vm.getAplicacionPresupuestariaFutura());
		convocatoria.setResuelvePago(vm.getResuelvePago());
		convocatoria.setResuelveJustificacion(vm.getResuelveJustificacion());
		return convocatoria;
	}

	public Entidad EntidadListarViewModel2Entidad(Entidad entidad, EntidadListarViewModel vm) {
		
		entidad.setIdEntidad(vm.getIdEntidad());
		entidad.setNombre(vm.getNombreEntidad());
		entidad.setAcreedorGIRO(vm.getAcreedorGIRO());
		entidad.setCif(vm.getCif());
		entidad.setDireccion(vm.getDireccion());
		entidad.setCodigoPostal(vm.getCodigoPostal());
		entidad.setMunicipio(vm.getMunicipio());
		entidad.setProvincia(vm.getProvincia());
		entidad.setEmailAyuntamiento(vm.getEmailAyuntamiento());
		entidad.setEmailCentro(vm.getEmailCentro());
		entidad.setTipo(vm.getTipoEntidad());
		entidad.setGrupo(vm.getGrupoEntidad());
		entidad.setIBAN(vm.getIBAN());
		entidad.setPosicionIBAN(vm.getPosicionIBAN());
		
		
		
		return entidad;
	}

	public Entidad EntidadCrearViewModel2Entidad(Entidad entidad, EntidadCrearViewModel vm) {
		
		entidad.setNombre(vm.getNombreEntidad());
		entidad.setAcreedorGIRO(vm.getAcreedorGIRO());
		entidad.setCif(vm.getCif());
		entidad.setDireccion(vm.getDireccion());
		entidad.setCodigoPostal(vm.getCodigoPostal());
		entidad.setMunicipio(vm.getMunicipio());
		entidad.setProvincia(vm.getProvincia());
		entidad.setEmailAyuntamiento(vm.getEmailAyuntamiento());
		entidad.setEmailCentro(vm.getEmailCentro());
		entidad.setTipo(vm.getTipoEntidad());
		entidad.setGrupo(vm.getGrupoEntidad());
		entidad.setIBAN(vm.getIBAN());
		entidad.setPosicionIBAN(vm.getPosicionIBAN());
		return entidad;
	}

	public Solicitud SolicitudListarViewModel2Entidad(Solicitud solicitud, SolicitudListarViewModel vm) {
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
		
		return solicitud;
	}
	
	

}
