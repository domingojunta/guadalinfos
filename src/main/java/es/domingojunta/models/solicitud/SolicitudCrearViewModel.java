package es.domingojunta.models.solicitud;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import es.domingojunta.entities.Solicitud;

public class SolicitudCrearViewModel {
		
	//private int idSolicitud;
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String yearConvocatoria;
	private int idEntidad;
	private String nombreEntidad;
	private Date fechaEntrada;
	private String expediente;
	private String SUBCC;
	private BigDecimal costePersonal;
	private BigDecimal costeDietas;
	private BigDecimal subvencionPersonal;
	private BigDecimal subvencionDietas;
	private Date fechaComunicacionEntrada;
	private Date fechaAeat;
	private Date fechaAtrian;
	private Date fechaSeguridadSocial;
	private Date fechaRequerimientoSolicitud;
	private Date fechaPropuestaConcesion;
	private String expedienteContableD;
	private String numeroDocumentoD;
	private Date fechaResolucionConcesion;
	private Date fechaNotificacionResolucionConcesion;
	
	private Date fechaPropuestaOJ;
	private String expedienteContableOJ;
	private String numeroDocumentoOJ;
	private BigDecimal importeOJ;
	private Date fechaPagoMaterialOJ;
	private String numeroDocumentoOM;
	private int numeroDiasFuncionamiento;
	private int objetivoNumeroActividades;
	private int objetivoNumeroActividadesMarcadas;
	private int objetivoNumeroMeses;
	private int numeroActividadesAlcanzado;
	private int numeroActividadesMarcadasAlcanzado;
	private int numeroMesesAlcanzado;
	private BigDecimal importeJustificadoPersonal;
	private BigDecimal importeJustificadoDietas;
	private BigDecimal importeAceptadoPersonal;
	private BigDecimal importeAceptadoDietas;
	
	private Date fechaPropuestaLiquidacion;
	private Date fechaAlegacionesPropuestaLiquidacion;
	private Date fechaLiquidacion;
	private Date fechaNotificacionLiquidacion;
	
	private String expedienteContableJ;
	private String numeroDocumentoJ;
	private String expedienteContablePropuestaO;
	private String numeroPropuestaDocumentoO;
	private String numeroDocumentoO;
	private Date fechaPagoMaterialO;
	
	private Date fechaAcuerdoInicioReintegro;
	private Date fechaAlegacionesAIR;
	private Date fechaResolucionReintegro;
	private String numeroModelo022;
	private BigDecimal importeModelo022;
	private Date fechaNotificacionResolucionReintegro;
	private Date fechaAbonoReintegro;
	
	
	public SolicitudCrearViewModel() {
		}
	
//	public int getIdSolicitud() {
//		return idSolicitud;
//	}
//	public void setIdSolicitud(int idSolicitud) {
//		this.idSolicitud = idSolicitud;
//	}
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
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaEntrada(Date fechaEntrada) {
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
	public Date getFechaComunicacionEntrada() {
		return fechaComunicacionEntrada;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaComunicacionEntrada(Date fechaComunicacionEntrada) {
		this.fechaComunicacionEntrada = fechaComunicacionEntrada;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaAeat() {
		return fechaAeat;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAeat(Date fechaAeat) {
		this.fechaAeat = fechaAeat;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaAtrian() {
		return fechaAtrian;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAtrian(Date fechaAtrian) {
		this.fechaAtrian = fechaAtrian;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaSeguridadSocial() {
		return fechaSeguridadSocial;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaSeguridadSocial(Date fechaSeguridadSocial) {
		this.fechaSeguridadSocial = fechaSeguridadSocial;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaRequerimientoSolicitud() {
		return fechaRequerimientoSolicitud;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaRequerimientoSolicitud(Date fechaRequerimientoSolicitud) {
		this.fechaRequerimientoSolicitud = fechaRequerimientoSolicitud;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPropuestaConcesion() {
		return fechaPropuestaConcesion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPropuestaConcesion(Date fechaPropuestaConcesion) {
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
	public Date getFechaResolucionConcesion() {
		return fechaResolucionConcesion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaResolucionConcesion(Date fechaResolucionConcesion) {
		this.fechaResolucionConcesion = fechaResolucionConcesion;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaNotificacionResolucionConcesion() {
		return fechaNotificacionResolucionConcesion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaNotificacionResolucionConcesion(Date fechaNotificacionResolucionConcesion) {
		this.fechaNotificacionResolucionConcesion = fechaNotificacionResolucionConcesion;
	}
	
	public String getYearConvocatoria() {
		return yearConvocatoria;
	}
	public void setYearConvocatoria(String yearConvocatoria) {
		this.yearConvocatoria = yearConvocatoria;
	}
	
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPropuestaOJ() {
		return fechaPropuestaOJ;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPropuestaOJ(Date fechaPropuestaOJ) {
		this.fechaPropuestaOJ = fechaPropuestaOJ;
	}
	
	public String getExpedienteContableOJ() {
		return expedienteContableOJ;
	}

	public void setExpedienteContableOJ(String expedienteContableOJ) {
		this.expedienteContableOJ = expedienteContableOJ;
	}

	public String getNumeroDocumentoOJ() {
		return numeroDocumentoOJ;
	}

	public void setNumeroDocumentoOJ(String numeroDocumentoOJ) {
		this.numeroDocumentoOJ = numeroDocumentoOJ;
	}

	public BigDecimal getImporteOJ() {
		return importeOJ;
	}

	public void setImporteOJ(BigDecimal importeOJ) {
		this.importeOJ = importeOJ;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPagoMaterialOJ() {
		return fechaPagoMaterialOJ;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPagoMaterialOJ(Date fechaPagoMaterialOJ) {
		this.fechaPagoMaterialOJ = fechaPagoMaterialOJ;
	}

	public String getNumeroDocumentoOM() {
		return numeroDocumentoOM;
	}

	public void setNumeroDocumentoOM(String numeroDocumentoOM) {
		this.numeroDocumentoOM = numeroDocumentoOM;
	}

	public int getNumeroDiasFuncionamiento() {
		return numeroDiasFuncionamiento;
	}

	public void setNumeroDiasFuncionamiento(int numeroDiasFuncionamiento) {
		this.numeroDiasFuncionamiento = numeroDiasFuncionamiento;
	}

	public int getObjetivoNumeroActividades() {
		return objetivoNumeroActividades;
	}

	public void setObjetivoNumeroActividades(int objetivoNumeroActividades) {
		this.objetivoNumeroActividades = objetivoNumeroActividades;
	}

	public int getObjetivoNumeroActividadesMarcadas() {
		return objetivoNumeroActividadesMarcadas;
	}

	public void setObjetivoNumeroActividadesMarcadas(int objetivoNumeroActividadesMarcadas) {
		this.objetivoNumeroActividadesMarcadas = objetivoNumeroActividadesMarcadas;
	}

	public int getObjetivoNumeroMeses() {
		return objetivoNumeroMeses;
	}

	public void setObjetivoNumeroMeses(int objetivoNumeroMeses) {
		this.objetivoNumeroMeses = objetivoNumeroMeses;
	}

	public int getNumeroActividadesAlcanzado() {
		return numeroActividadesAlcanzado;
	}

	public void setNumeroActividadesAlcanzado(int numeroActividadesAlcanzado) {
		this.numeroActividadesAlcanzado = numeroActividadesAlcanzado;
	}

	public int getNumeroActividadesMarcadasAlcanzado() {
		return numeroActividadesMarcadasAlcanzado;
	}

	public void setNumeroActividadesMarcadasAlcanzado(int numeroActividadesMarcadasAlcanzado) {
		this.numeroActividadesMarcadasAlcanzado = numeroActividadesMarcadasAlcanzado;
	}

	public int getNumeroMesesAlcanzado() {
		return numeroMesesAlcanzado;
	}

	public void setNumeroMesesAlcanzado(int numeroMesesAlcanzado) {
		this.numeroMesesAlcanzado = numeroMesesAlcanzado;
	}

	public BigDecimal getImporteJustificadoPersonal() {
		return importeJustificadoPersonal;
	}

	public void setImporteJustificadoPersonal(BigDecimal importeJustificadoPersonal) {
		this.importeJustificadoPersonal = importeJustificadoPersonal;
	}

	public BigDecimal getImporteJustificadoDietas() {
		return importeJustificadoDietas;
	}

	public void setImporteJustificadoDietas(BigDecimal importeJustificadoDietas) {
		this.importeJustificadoDietas = importeJustificadoDietas;
	}

	public BigDecimal getImporteAceptadoPersonal() {
		return importeAceptadoPersonal;
	}

	public void setImporteAceptadoPersonal(BigDecimal importeAceptadoPersonal) {
		this.importeAceptadoPersonal = importeAceptadoPersonal;
	}

	public BigDecimal getImporteAceptadoDietas() {
		return importeAceptadoDietas;
	}

	public void setImporteAceptadoDietas(BigDecimal importeAceptadoDietas) {
		this.importeAceptadoDietas = importeAceptadoDietas;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPropuestaLiquidacion() {
		return fechaPropuestaLiquidacion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPropuestaLiquidacion(Date fechaPropuestaLiquidacion) {
		this.fechaPropuestaLiquidacion = fechaPropuestaLiquidacion;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaAlegacionesPropuestaLiquidacion() {
		return fechaAlegacionesPropuestaLiquidacion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAlegacionesPropuestaLiquidacion(Date fechaAlegacionesPropuestaLiquidacion) {
		this.fechaAlegacionesPropuestaLiquidacion = fechaAlegacionesPropuestaLiquidacion;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaLiquidacion() {
		return fechaLiquidacion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaLiquidacion(Date fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaNotificacionLiquidacion() {
		return fechaNotificacionLiquidacion;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaNotificacionLiquidacion(Date fechaNotificacionLiquidacion) {
		this.fechaNotificacionLiquidacion = fechaNotificacionLiquidacion;
	}

	public String getExpedienteContableJ() {
		return expedienteContableJ;
	}

	public void setExpedienteContableJ(String expedienteContableJ) {
		this.expedienteContableJ = expedienteContableJ;
	}

	public String getNumeroDocumentoJ() {
		return numeroDocumentoJ;
	}

	public void setNumeroDocumentoJ(String numeroDocumentoJ) {
		this.numeroDocumentoJ = numeroDocumentoJ;
	}

	public String getExpedienteContablePropuestaO() {
		return expedienteContablePropuestaO;
	}

	public void setExpedienteContablePropuestaO(String expedienteContablePropuestaO) {
		this.expedienteContablePropuestaO = expedienteContablePropuestaO;
	}

	public String getNumeroPropuestaDocumentoO() {
		return numeroPropuestaDocumentoO;
	}

	public void setNumeroPropuestaDocumentoO(String numeroPropuestaDocumentoO) {
		this.numeroPropuestaDocumentoO = numeroPropuestaDocumentoO;
	}

	public String getNumeroDocumentoO() {
		return numeroDocumentoO;
	}

	public void setNumeroDocumentoO(String numeroDocumentoO) {
		this.numeroDocumentoO = numeroDocumentoO;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPagoMaterialO() {
		return fechaPagoMaterialO;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPagoMaterialO(Date fechaPagoMaterialO) {
		this.fechaPagoMaterialO = fechaPagoMaterialO;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaAcuerdoInicioReintegro() {
		return fechaAcuerdoInicioReintegro;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAcuerdoInicioReintegro(Date fechaAcuerdoInicioReintegro) {
		this.fechaAcuerdoInicioReintegro = fechaAcuerdoInicioReintegro;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaAlegacionesAIR() {
		return fechaAlegacionesAIR;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAlegacionesAIR(Date fechaAlegacionesAIR) {
		this.fechaAlegacionesAIR = fechaAlegacionesAIR;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaResolucionReintegro() {
		return fechaResolucionReintegro;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaResolucionReintegro(Date fechaResolucionReintegro) {
		this.fechaResolucionReintegro = fechaResolucionReintegro;
	}

	public String getNumeroModelo022() {
		return numeroModelo022;
	}

	public void setNumeroModelo022(String numeroModelo022) {
		this.numeroModelo022 = numeroModelo022;
	}

	public BigDecimal getImporteModelo022() {
		return importeModelo022;
	}

	public void setImporteModelo022(BigDecimal importeModelo022) {
		this.importeModelo022 = importeModelo022;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaNotificacionResolucionReintegro() {
		return fechaNotificacionResolucionReintegro;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaNotificacionResolucionReintegro(Date fechaNotificacionResolucionReintegro) {
		this.fechaNotificacionResolucionReintegro = fechaNotificacionResolucionReintegro;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaAbonoReintegro() {
		return fechaAbonoReintegro;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAbonoReintegro(Date fechaAbonoReintegro) {
		this.fechaAbonoReintegro = fechaAbonoReintegro;
	}
	
	
	
	

}
