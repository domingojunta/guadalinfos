package es.domingojunta.models.solicitud;

import java.time.LocalDate;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

import es.domingojunta.entities.Solicitud;

public class SolicitudListarViewModel {
		
	private int idSolicitud;
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String yearConvocatoria;
	private int idEntidad;
	private String nombreEntidad;
	private LocalDate fechaEntrada;
	private String expediente;
	private String SUBCC;
	private long costePersonal;
	private long costeDietas;
	private long subvencionPersonal;
	private long subvencionDietas;
	private LocalDate fechaComunicacionEntrada;
	private LocalDate fechaAeat;
	private LocalDate fechaAtrian;
	private LocalDate fechaSeguridadSocial;
	private LocalDate fechaRequerimientoSolicitud;
	private LocalDate fechaPropuestaConcesion;
	private String expedienteContableD;
	private String numeroDocumentoD;
	private LocalDate fechaResolucionConcesion;
	private LocalDate fechaNotificacionResolucionConcesion;
	
	public SolicitudListarViewModel() {
		}
	public SolicitudListarViewModel(Solicitud solicitud) {
		this.idSolicitud=solicitud.getIdSolicitud();
		this.idConvocatoria=solicitud.getIdConvocatoria();
		this.idEntidad=solicitud.getIdEntidad();
		this.fechaEntrada=solicitud.getFechaEntrada();
		this.expediente=solicitud.getExpediente();
		this.SUBCC=solicitud.getSUBCC();
		this.costePersonal=solicitud.getCostePersonal();
		this.costeDietas=solicitud.getCosteDietas();
		this.subvencionPersonal=solicitud.getSubvencionPersonal();
		this.subvencionDietas=solicitud.getSubvencionDietas();
		this.fechaComunicacionEntrada=solicitud.getFechaComunicacionEntrada();
		this.fechaAeat=solicitud.getFechaAeat();
		this.fechaAtrian=solicitud.getFechaAtrian();
		this.fechaSeguridadSocial=solicitud.getFechaSeguridadSocial();
		this.fechaRequerimientoSolicitud=solicitud.getFechaRequerimientoSolicitud();
		this.fechaPropuestaConcesion=solicitud.getFechaPropuestaConcesion();
		this.expedienteContableD=solicitud.getExpedienteContableD();
		this.numeroDocumentoD=solicitud.getNumeroDocumentoD();
		this.fechaResolucionConcesion=solicitud.getFechaResolucionConcesion();
		this.fechaNotificacionResolucionConcesion=solicitud.getFechaResolucionConcesion();
		
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public int getIdConvocatoria() {
		return idConvocatoria;
	}
	public void setIdConvocatoria(int idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}
	public String getNombreConvocatoria() {
		return nombreConvocatoria;
	}
	public void setNombreConvocatoria(String nombreConvocatoria) {
		this.nombreConvocatoria = nombreConvocatoria;
	}
	public int getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	public String getSUBCC() {
		return SUBCC;
	}
	public void setSUBCC(String sUBCC) {
		SUBCC = sUBCC;
	}
	public long getCostePersonal() {
		return costePersonal;
	}
	public void setCostePersonal(long costePersonal) {
		this.costePersonal = costePersonal;
	}
	public long getCosteDietas() {
		return costeDietas;
	}
	public void setCosteDietas(long costeDietas) {
		this.costeDietas = costeDietas;
	}
	public long getSubvencionPersonal() {
		return subvencionPersonal;
	}
	public void setSubvencionPersonal(long subvencionPersonal) {
		this.subvencionPersonal = subvencionPersonal;
	}
	public long getSubvencionDietas() {
		return subvencionDietas;
	}
	public void setSubvencionDietas(long subvencionDietas) {
		this.subvencionDietas = subvencionDietas;
	}
	public LocalDate getFechaComunicacionEntrada() {
		return fechaComunicacionEntrada;
	}
	public void setFechaComunicacionEntrada(LocalDate fechaComunicacionEntrada) {
		this.fechaComunicacionEntrada = fechaComunicacionEntrada;
	}
	public LocalDate getFechaAeat() {
		return fechaAeat;
	}
	public void setFechaAeat(LocalDate fechaAeat) {
		this.fechaAeat = fechaAeat;
	}
	public LocalDate getFechaAtrian() {
		return fechaAtrian;
	}
	public void setFechaAtrian(LocalDate fechaAtrian) {
		this.fechaAtrian = fechaAtrian;
	}
	public LocalDate getFechaSeguridadSocial() {
		return fechaSeguridadSocial;
	}
	public void setFechaSeguridadSocial(LocalDate fechaSeguridadSocial) {
		this.fechaSeguridadSocial = fechaSeguridadSocial;
	}
	public LocalDate getFechaRequerimientoSolicitud() {
		return fechaRequerimientoSolicitud;
	}
	public void setFechaRequerimientoSolicitud(LocalDate fechaRequerimientoSolicitud) {
		this.fechaRequerimientoSolicitud = fechaRequerimientoSolicitud;
	}
	public LocalDate getFechaPropuestaConcesion() {
		return fechaPropuestaConcesion;
	}
	public void setFechaPropuestaConcesion(LocalDate fechaPropuestaConcesion) {
		this.fechaPropuestaConcesion = fechaPropuestaConcesion;
	}
	public String getExpedienteContableD() {
		return expedienteContableD;
	}
	public void setExpedienteContableD(String expedienteContableD) {
		this.expedienteContableD = expedienteContableD;
	}
	public String getNumeroDocumentoD() {
		return numeroDocumentoD;
	}
	public void setNumeroDocumentoD(String numeroDocumentoD) {
		this.numeroDocumentoD = numeroDocumentoD;
	}
	public LocalDate getFechaResolucionConcesion() {
		return fechaResolucionConcesion;
	}
	public void setFechaResolucionConcesion(LocalDate fechaResolucionConcesion) {
		this.fechaResolucionConcesion = fechaResolucionConcesion;
	}
	public LocalDate getFechaNotificacionResolucionConcesion() {
		return fechaNotificacionResolucionConcesion;
	}
	public void setFechaNotificacionResolucionConcesion(LocalDate fechaNotificacionResolucionConcesion) {
		this.fechaNotificacionResolucionConcesion = fechaNotificacionResolucionConcesion;
	}
	public String getYearConvocatoria() {
		return yearConvocatoria;
	}
	public void setYearConvocatoria(String yearConvocatoria) {
		this.yearConvocatoria = yearConvocatoria;
	}
	
	
	

}
