package es.domingojunta.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Solicitud {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_solicitud")
	private int idSolicitud;
	@Column(name="id_convocatoria")
	private int idConvocatoria;
	@Column(name="id_entidad")
	private int idEntidad;
	@Column(name="fecha_entrada")
	private Date fechaEntrada;
	@Column(name="expediente")
	private String expediente;
	@Column(name="subcc")
	private String SUBCC;
	@Column(name="coste_personal")
	private BigDecimal costePersonal;
	@Column(name="coste_dietas")
	private BigDecimal costeDietas;
	@Column(name="subvencion_personal")
	private BigDecimal subvencionPersonal;
	@Column(name="subvencion_dietas")
	private BigDecimal subvencionDietas;
	@Column(name="fecha_comunicacion_entrada")
	private Date fechaComunicacionEntrada;
	@Column(name="fecha_aeat")
	private Date fechaAeat;
	@Column(name="fecha_atrian")
	private Date fechaAtrian;
	@Column(name="fecha_seguridad_social")
	private Date fechaSeguridadSocial;
	@Column(name="fecha_requerimiento_solicitud")
	private Date fechaRequerimientoSolicitud;
	@Column(name="fecha_propuesta_concesion")
	private Date fechaPropuestaConcesion;
	@Column(name="expediente_contabled")
	private String expedienteContableD;
	@Column(name="numero_documentod")
	private String numeroDocumentoD;
	@Column(name="fecha_resolucion_concesion")
	private Date fechaResolucionConcesion;
	@Column(name="fecha_notificacion_resolucion_concesion")
	private Date fechaNotificacionResolucionConcesion;
	
	@Column(name="fecha_propuestaoj")
	private Date fechaPropuestaOJ;
	@Column(name="expediente_contableoj")
	private String expedienteContableOJ;
	@Column(name="numero_documentooj")
	private String numeroDocumentoOJ;
	@Column(name="importeOJ")
	private BigDecimal importeOJ;
	@Column(name="fecha_pago_materialoj")
	private Date fechaPagoMaterialOJ;
	@Column(name="numero_documentoom")
	private String numeroDocumentoOM;
	@Column(name="numero_dias_funcionamiento")
	private int numeroDiasFuncionamiento;
	@Column(name="objetivo_numero_actividades")
	private int objetivoNumeroActividades;
	@Column(name="objetivo_numero_actividades_marcadas")
	private int objetivoNumeroActividadesMarcadas;
	@Column(name="objetivo_numero_meses")
	private int objetivoNumeroMeses;
	@Column(name="numero_actividades_alcanzado")
	private int numeroActividadesAlcanzado;
	@Column(name="numero_actividades_marcadas_alcanzado")
	private int numeroActividadesMarcadasAlcanzado;
	@Column(name="numero_meses_alcanzado")
	private int numeroMesesAlcanzado;
	@Column(name="importe_justificado_personal")
	private BigDecimal importeJustificadoPersonal;
	@Column(name="importe_justificado_dietas")
	private BigDecimal importeJustificadoDietas;
	@Column(name="importe_aceptado_personal")
	private BigDecimal importeAceptadoPersonal;
	@Column(name="importe_aceptado_dietas")
	private BigDecimal importeAceptadoDietas;
	
	
	@Column(name="fecha_propuesta_liquidacion")
	private Date fechaPropuestaLiquidacion;
	@Column(name="fecha_alegaciones_propuesta_liquidacion")
	private Date fechaAlegacionesPropuestaLiquidacion;
	@Column(name="fecha_liquidacion")
	private Date fechaLiquidacion;
	@Column(name="fecha_notificacion_liquidacion")
	private Date fechaNotificacionLiquidacion;
	
	@Column(name="expediente_contablej")
	private String expedienteContableJ;
	@Column(name="numero_documentoj")
	private String numeroDocumentoJ;
	@Column(name="expediente_contable_propuestao")
	private String expedienteContablePropuestaO;
	@Column(name="numero_propuesta_documentoo")
	private String numeroPropuestaDocumentoO;
	@Column(name="numero_documentoo")
	private String numeroDocumentoO;
	@Column(name="fecha_pago_materialo")
	private Date fechaPagoMaterialO;
	
	@Column(name="fecha_acuerdo_inicio_reintegro")
	private Date fechaAcuerdoInicioReintegro;
	@Column(name="fecha_alegacionesair")
	private Date fechaAlegacionesAIR;
	@Column(name="fecha_resolucion_reintegro")
	private Date fechaResolucionReintegro;
	@Column(name="numero_modelo022")
	private String numeroModelo022;
	@Column(name="importe_modelo022")
	private BigDecimal importeModelo022;
	@Column(name="fecha_notificacion_resolucion_reintegro")
	private Date fechaNotificacionResolucionReintegro;
	@Column(name="fecha_abono_reintegro")
	private Date fechaAbonoReintegro;
	
	
	public Solicitud() {
		super();
		// TODO Auto-generated constructor stub
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

	

	public String getNumeroDocumentoD() {
		return numeroDocumentoD;
	}


	public void setNumeroDocumentoD(String numeroDocumentoD) {
		this.numeroDocumentoD = numeroDocumentoD;
	}


	public int getIdEntidad() {
		return idEntidad;
	}


	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	

	public String getExpedienteContableOJ() {
		return expedienteContableOJ;
	}


	public void setExpedienteContableOJ(String expedienteContableOJ) {
		this.expedienteContableOJ = expedienteContableOJ;
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

	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPropuestaOJ() {
		return fechaPropuestaOJ;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPropuestaOJ(Date fechaPropuestaOJ) {
		this.fechaPropuestaOJ = fechaPropuestaOJ;
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


	public String getNumeroDocumentoOM() {
		return numeroDocumentoOM;
	}


	public void setNumeroDocumentoOM(String numeroDocumentoOM) {
		this.numeroDocumentoOM = numeroDocumentoOM;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public Date getFechaPagoMaterialOJ() {
		return fechaPagoMaterialOJ;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPagoMaterialOJ(Date fechaPagoMaterialOJ) {
		this.fechaPagoMaterialOJ = fechaPagoMaterialOJ;
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


	@Override
	public String toString() {
		return "Solicitud [idSolicitud=" + idSolicitud + ", idConvocatoria=" + idConvocatoria + ", idEntidad="
				+ idEntidad + ", fechaEntrada=" + fechaEntrada + ", expediente=" + expediente + ", SUBCC=" + SUBCC
				+ ", costePersonal=" + costePersonal + ", costeDietas=" + costeDietas + ", subvencionPersonal="
				+ subvencionPersonal + ", subvencionDietas=" + subvencionDietas + "]";
	}

	

	
	
}
