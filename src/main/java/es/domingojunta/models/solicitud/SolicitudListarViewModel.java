package es.domingojunta.models.solicitud;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

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
	private BigDecimal costePersonal;
	private BigDecimal costeDietas;
	private BigDecimal subvencionPersonal;
	private BigDecimal subvencionDietas;
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
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
	public Double getCostePersonal() {
		return costePersonal.doubleValue();
	}
	public void setCostePersonal(BigDecimal costePersonal) {
		this.costePersonal = costePersonal;
	}
	public Double getCosteDietas() {
		return costeDietas.doubleValue();
	}
	public void setCosteDietas(BigDecimal costeDietas) {
		this.costeDietas = costeDietas;
	}
	public Double getSubvencionPersonal() {
		return subvencionPersonal.doubleValue();
	}
	public void setSubvencionPersonal(BigDecimal subvencionPersonal) {
		this.subvencionPersonal = subvencionPersonal;
	}
	public Double getSubvencionDietas() {
		return subvencionDietas.doubleValue();
	}
	public void setSubvencionDietas(BigDecimal subvencionDietas) {
		this.subvencionDietas = subvencionDietas;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaComunicacionEntrada() {
		return fechaComunicacionEntrada;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaComunicacionEntrada(LocalDate fechaComunicacionEntrada) {
		this.fechaComunicacionEntrada = fechaComunicacionEntrada;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaAeat() {
		return fechaAeat;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAeat(LocalDate fechaAeat) {
		this.fechaAeat = fechaAeat;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaAtrian() {
		return fechaAtrian;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAtrian(LocalDate fechaAtrian) {
		this.fechaAtrian = fechaAtrian;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaSeguridadSocial() {
		return fechaSeguridadSocial;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaSeguridadSocial(LocalDate fechaSeguridadSocial) {
		this.fechaSeguridadSocial = fechaSeguridadSocial;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaRequerimientoSolicitud() {
		return fechaRequerimientoSolicitud;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaRequerimientoSolicitud(LocalDate fechaRequerimientoSolicitud) {
		this.fechaRequerimientoSolicitud = fechaRequerimientoSolicitud;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaPropuestaConcesion() {
		return fechaPropuestaConcesion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaResolucionConcesion() {
		return fechaResolucionConcesion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaResolucionConcesion(LocalDate fechaResolucionConcesion) {
		this.fechaResolucionConcesion = fechaResolucionConcesion;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaNotificacionResolucionConcesion() {
		return fechaNotificacionResolucionConcesion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
