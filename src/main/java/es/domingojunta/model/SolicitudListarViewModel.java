package es.domingojunta.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import es.domingojunta.entities.Solicitud;

@XmlRootElement
public class SolicitudListarViewModel {
		
	private int idSolicitud;
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String yearConvocatoria;
	private int idEntidad;
	private String nombreEntidad;
	private String fechaEntrada;
	private String expediente;
	private String subcc;
	private BigDecimal costePersonal;
	private BigDecimal costeDietas;
	private BigDecimal subvencionPersonal;
	private BigDecimal subvencionDietas;
	private String fechaComunicacionEntrada;
	private String fechaAeat;
	private String fechaAtrian;
	private String fechaSeguridadSocial;
	private String fechaRequerimientoSolicitud;
	private String documentacionRequerida;
	private String fechaPropuestaConcesion;
	private String expedienteContableD;
	private String numeroDocumentoD;
	private String fechaResolucionConcesion;
	private String fechaNotificacionResolucionConcesion;
	
	private String fechaPropuestaOJ;
	private String expedienteContableOJ;
	private String numeroDocumentoOJ;
	private BigDecimal importeOJ;
	private String fechaPagoMaterialOJ;
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
	
	private String fechaPropuestaLiquidacion;
	private String fechaAlegacionesPropuestaLiquidacion;
	private String fechaLiquidacion;
	private String fechaNotificacionLiquidacion;
	
	private String expedienteContableJ;
	private String numeroDocumentoJ;
	private String expedienteContablePropuestaO;
	private String numeroPropuestaDocumentoO;
	private String numeroDocumentoO;
	private String fechaPagoMaterialO;
	
	private String fechaAcuerdoInicioReintegro;
	private String fechaAlegacionesAIR;
	private String fechaResolucionReintegro;
	private String numeroModelo022;
	private BigDecimal importeModelo022;
	private String fechaNotificacionResolucionReintegro;
	private String fechaAbonoReintegro;
	
	
	public SolicitudListarViewModel() {
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


	public String getYearConvocatoria() {
		return yearConvocatoria;
	}


	public void setYearConvocatoria(String yearConvocatoria) {
		this.yearConvocatoria = yearConvocatoria;
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


	public String getFechaEntrada() {
		return fechaEntrada;
	}


	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}


	public String getExpediente() {
		return expediente;
	}


	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}


	

	public String getSubcc() {
		return subcc;
	}


	public void setSubcc(String subcc) {
		this.subcc = subcc;
	}


	public BigDecimal getCostePersonal() {
		return costePersonal;
	}


	public void setCostePersonal(BigDecimal costePersonal) {
		this.costePersonal = costePersonal;
	}


	public BigDecimal getCosteDietas() {
		return costeDietas;
	}


	public void setCosteDietas(BigDecimal costeDietas) {
		this.costeDietas = costeDietas;
	}


	public BigDecimal getSubvencionPersonal() {
		return subvencionPersonal;
	}


	public void setSubvencionPersonal(BigDecimal subvencionPersonal) {
		this.subvencionPersonal = subvencionPersonal;
	}


	public BigDecimal getSubvencionDietas() {
		return subvencionDietas;
	}


	public void setSubvencionDietas(BigDecimal subvencionDietas) {
		this.subvencionDietas = subvencionDietas;
	}


	public String getFechaComunicacionEntrada() {
		return fechaComunicacionEntrada;
	}


	public void setFechaComunicacionEntrada(String fechaComunicacionEntrada) {
		this.fechaComunicacionEntrada = fechaComunicacionEntrada;
	}


	public String getFechaAeat() {
		return fechaAeat;
	}


	public void setFechaAeat(String fechaAeat) {
		this.fechaAeat = fechaAeat;
	}


	public String getFechaAtrian() {
		return fechaAtrian;
	}


	public void setFechaAtrian(String fechaAtrian) {
		this.fechaAtrian = fechaAtrian;
	}


	public String getFechaSeguridadSocial() {
		return fechaSeguridadSocial;
	}


	public void setFechaSeguridadSocial(String fechaSeguridadSocial) {
		this.fechaSeguridadSocial = fechaSeguridadSocial;
	}


	public String getFechaRequerimientoSolicitud() {
		return fechaRequerimientoSolicitud;
	}


	public void setFechaRequerimientoSolicitud(String fechaRequerimientoSolicitud) {
		this.fechaRequerimientoSolicitud = fechaRequerimientoSolicitud;
	}


	public String getFechaPropuestaConcesion() {
		return fechaPropuestaConcesion;
	}


	public void setFechaPropuestaConcesion(String fechaPropuestaConcesion) {
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


	public String getFechaResolucionConcesion() {
		return fechaResolucionConcesion;
	}


	public void setFechaResolucionConcesion(String fechaResolucionConcesion) {
		this.fechaResolucionConcesion = fechaResolucionConcesion;
	}


	public String getFechaNotificacionResolucionConcesion() {
		return fechaNotificacionResolucionConcesion;
	}


	public void setFechaNotificacionResolucionConcesion(String fechaNotificacionResolucionConcesion) {
		this.fechaNotificacionResolucionConcesion = fechaNotificacionResolucionConcesion;
	}


	public String getFechaPropuestaOJ() {
		return fechaPropuestaOJ;
	}


	public void setFechaPropuestaOJ(String fechaPropuestaOJ) {
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


	public String getFechaPagoMaterialOJ() {
		return fechaPagoMaterialOJ;
	}


	public void setFechaPagoMaterialOJ(String fechaPagoMaterialOJ) {
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


	public String getFechaPropuestaLiquidacion() {
		return fechaPropuestaLiquidacion;
	}


	public void setFechaPropuestaLiquidacion(String fechaPropuestaLiquidacion) {
		this.fechaPropuestaLiquidacion = fechaPropuestaLiquidacion;
	}


	public String getFechaAlegacionesPropuestaLiquidacion() {
		return fechaAlegacionesPropuestaLiquidacion;
	}


	public void setFechaAlegacionesPropuestaLiquidacion(String fechaAlegacionesPropuestaLiquidacion) {
		this.fechaAlegacionesPropuestaLiquidacion = fechaAlegacionesPropuestaLiquidacion;
	}


	public String getFechaLiquidacion() {
		return fechaLiquidacion;
	}


	public void setFechaLiquidacion(String fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}


	public String getFechaNotificacionLiquidacion() {
		return fechaNotificacionLiquidacion;
	}


	public void setFechaNotificacionLiquidacion(String fechaNotificacionLiquidacion) {
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


	public String getFechaPagoMaterialO() {
		return fechaPagoMaterialO;
	}


	public void setFechaPagoMaterialO(String fechaPagoMaterialO) {
		this.fechaPagoMaterialO = fechaPagoMaterialO;
	}


	public String getFechaAcuerdoInicioReintegro() {
		return fechaAcuerdoInicioReintegro;
	}


	public void setFechaAcuerdoInicioReintegro(String fechaAcuerdoInicioReintegro) {
		this.fechaAcuerdoInicioReintegro = fechaAcuerdoInicioReintegro;
	}


	public String getFechaAlegacionesAIR() {
		return fechaAlegacionesAIR;
	}


	public void setFechaAlegacionesAIR(String fechaAlegacionesAIR) {
		this.fechaAlegacionesAIR = fechaAlegacionesAIR;
	}


	public String getFechaResolucionReintegro() {
		return fechaResolucionReintegro;
	}


	public void setFechaResolucionReintegro(String fechaResolucionReintegro) {
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


	public String getFechaNotificacionResolucionReintegro() {
		return fechaNotificacionResolucionReintegro;
	}


	public void setFechaNotificacionResolucionReintegro(String fechaNotificacionResolucionReintegro) {
		this.fechaNotificacionResolucionReintegro = fechaNotificacionResolucionReintegro;
	}


	public String getFechaAbonoReintegro() {
		return fechaAbonoReintegro;
	}


	public void setFechaAbonoReintegro(String fechaAbonoReintegro) {
		this.fechaAbonoReintegro = fechaAbonoReintegro;
	}


	public String getDocumentacionRequerida() {
		return documentacionRequerida;
	}


	public void setDocumentacionRequerida(String documentacionRequerida) {
		this.documentacionRequerida = documentacionRequerida;
	}
	
	
	
	
	
	

}
