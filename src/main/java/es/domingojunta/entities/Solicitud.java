package es.domingojunta.entities;

import java.time.LocalDate;

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
	private LocalDate fechaEntrada;
	@Column(name="expediente")
	private String expediente;
	@Column(name="subcc")
	private String SUBCC;
	@Column(name="coste_personal")
	private Long costePersonal;
	@Column(name="coste_dietas")
	private Long costeDietas;
	@Column(name="subvencion_personal")
	private Long subvencionPersonal;
	@Column(name="subvencion_dietas")
	private Long subvencionDietas;
	@Column(name="fecha_comunicacion_entrada")
	private LocalDate fechaComunicacionEntrada;
	@Column(name="fecha_aeat")
	private LocalDate fechaAeat;
	@Column(name="fecha_atrian")
	private LocalDate fechaAtrian;
	@Column(name="fecha_seguridad_social")
	private LocalDate fechaSeguridadSocial;
	@Column(name="fecha_requerimiento_solicitud")
	private LocalDate fechaRequerimientoSolicitud;
	@Column(name="fecha_propuesta_concesion")
	private LocalDate fechaPropuestaConcesion;
	@Column(name="expediente_contabled")
	private String expedienteContableD;
	@Column(name="numero_documentod")
	private String numeroDocumentoD;
	@Column(name="fecha_resolucion_concesion")
	private LocalDate fechaResolucionConcesion;
	@Column(name="fecha_notificacion_resolucion_concesion")
	private LocalDate fechaNotificacionResolucionConcesion;
	
	@Column(name="fecha_propuestaoj")
	private LocalDate fechaPropuestaOJ;
	@Column(name="expediente_contableoj")
	private String expedienteContableOJ;
	@Column(name="numero_documentooj")
	private String numeroDocumentoOJ;
	@Column(name="importeOJ")
	private Long importeOJ;
	@Column(name="fecha_pago_materialoj")
	private LocalDate fechaPagoMaterialOJ;
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
	private Long importeJustificadoPersonal;
	@Column(name="importe_justificado_dietas")
	private Long importeJustificadoDietas;
	@Column(name="importe_aceptado_personal")
	private Long importeAceptadoPersonal;
	@Column(name="importe_aceptado_dietas")
	private Long importeAceptadoDietas;
	
	
	@Column(name="fecha_propuesta_liquidacion")
	private LocalDate fechaPropuestaLiquidacion;
	@Column(name="fecha_alegaciones_propuesta_liquidacion")
	private LocalDate fechaAlegacionesPropuestaLiquidacion;
	@Column(name="fecha_liquidacion")
	private LocalDate fechaLiquidacion;
	@Column(name="fecha_notificacion_liquidacion")
	private LocalDate fechaNotificacionLiquidacion;
	
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
	private LocalDate fechaPagoMaterialO;
	
	@Column(name="fecha_acuerdo_inicio_reintegro")
	private LocalDate fechaAcuerdoInicioReintegro;
	@Column(name="fecha_alegacionesair")
	private LocalDate fechaAlegacionesAIR;
	@Column(name="fecha_resolucion_reintegro")
	private LocalDate fechaResolucionReintegro;
	@Column(name="numero_modelo022")
	private String numeroModelo022;
	@Column(name="importe_modelo022")
	private Long importeModelo022;
	@Column(name="fecha_notificacion_resolucion_reintegro")
	private LocalDate fechaNotificacionResolucionReintegro;
	@Column(name="fecha_abono_reintegro")
	private LocalDate fechaAbonoReintegro;
	
	
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


	public Long getCostePersonal() {
		return costePersonal;
	}


	public void setCostePersonal(Long costePersonal) {
		this.costePersonal = costePersonal;
	}


	public Long getCosteDietas() {
		return costeDietas;
	}


	public void setCosteDietas(Long costeDietas) {
		this.costeDietas = costeDietas;
	}


	public Long getSubvencionPersonal() {
		return subvencionPersonal;
	}


	public void setSubvencionPersonal(Long subvencionPersonal) {
		this.subvencionPersonal = subvencionPersonal;
	}


	public Long getSubvencionDietas() {
		return subvencionDietas;
	}


	public void setSubvencionDietas(Long subvencionDietas) {
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

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaPropuestaOJ() {
		return fechaPropuestaOJ;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPropuestaOJ(LocalDate fechaPropuestaOJ) {
		this.fechaPropuestaOJ = fechaPropuestaOJ;
	}


	public String getNumeroDocumentoOJ() {
		return numeroDocumentoOJ;
	}


	public void setNumeroDocumentoOJ(String numeroDocumentoOJ) {
		this.numeroDocumentoOJ = numeroDocumentoOJ;
	}


	public Long getImporteOJ() {
		return importeOJ;
	}


	public void setImporteOJ(Long importeOJ) {
		this.importeOJ = importeOJ;
	}


	public String getNumeroDocumentoOM() {
		return numeroDocumentoOM;
	}


	public void setNumeroDocumentoOM(String numeroDocumentoOM) {
		this.numeroDocumentoOM = numeroDocumentoOM;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaPagoMaterialOJ() {
		return fechaPagoMaterialOJ;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPagoMaterialOJ(LocalDate fechaPagoMaterialOJ) {
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
	public LocalDate getFechaPropuestaLiquidacion() {
		return fechaPropuestaLiquidacion;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPropuestaLiquidacion(LocalDate fechaPropuestaLiquidacion) {
		this.fechaPropuestaLiquidacion = fechaPropuestaLiquidacion;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaAlegacionesPropuestaLiquidacion() {
		return fechaAlegacionesPropuestaLiquidacion;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAlegacionesPropuestaLiquidacion(LocalDate fechaAlegacionesPropuestaLiquidacion) {
		this.fechaAlegacionesPropuestaLiquidacion = fechaAlegacionesPropuestaLiquidacion;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaLiquidacion() {
		return fechaLiquidacion;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaLiquidacion(LocalDate fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaNotificacionLiquidacion() {
		return fechaNotificacionLiquidacion;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaNotificacionLiquidacion(LocalDate fechaNotificacionLiquidacion) {
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
	public LocalDate getFechaPagoMaterialO() {
		return fechaPagoMaterialO;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaPagoMaterialO(LocalDate fechaPagoMaterialO) {
		this.fechaPagoMaterialO = fechaPagoMaterialO;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaAcuerdoInicioReintegro() {
		return fechaAcuerdoInicioReintegro;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAcuerdoInicioReintegro(LocalDate fechaAcuerdoInicioReintegro) {
		this.fechaAcuerdoInicioReintegro = fechaAcuerdoInicioReintegro;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaAlegacionesAIR() {
		return fechaAlegacionesAIR;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAlegacionesAIR(LocalDate fechaAlegacionesAIR) {
		this.fechaAlegacionesAIR = fechaAlegacionesAIR;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaResolucionReintegro() {
		return fechaResolucionReintegro;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaResolucionReintegro(LocalDate fechaResolucionReintegro) {
		this.fechaResolucionReintegro = fechaResolucionReintegro;
	}


	public String getNumeroModelo022() {
		return numeroModelo022;
	}


	public void setNumeroModelo022(String numeroModelo022) {
		this.numeroModelo022 = numeroModelo022;
	}


	public Long getImporteModelo022() {
		return importeModelo022;
	}


	public void setImporteModelo022(Long importeModelo022) {
		this.importeModelo022 = importeModelo022;
	}
	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaNotificacionResolucionReintegro() {
		return fechaNotificacionResolucionReintegro;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaNotificacionResolucionReintegro(LocalDate fechaNotificacionResolucionReintegro) {
		this.fechaNotificacionResolucionReintegro = fechaNotificacionResolucionReintegro;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaAbonoReintegro() {
		return fechaAbonoReintegro;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaAbonoReintegro(LocalDate fechaAbonoReintegro) {
		this.fechaAbonoReintegro = fechaAbonoReintegro;
	}

	

	public int getNumeroMesesAlcanzado() {
		return numeroMesesAlcanzado;
	}


	public void setNumeroMesesAlcanzado(int numeroMesesAlcanzado) {
		this.numeroMesesAlcanzado = numeroMesesAlcanzado;
	}
	
	


	public Long getImporteJustificadoPersonal() {
		return importeJustificadoPersonal;
	}


	public void setImporteJustificadoPersonal(Long importeJustificadoPersonal) {
		this.importeJustificadoPersonal = importeJustificadoPersonal;
	}


	public Long getImporteJustificadoDietas() {
		return importeJustificadoDietas;
	}


	public void setImporteJustificadoDietas(Long importeJustificadoDietas) {
		this.importeJustificadoDietas = importeJustificadoDietas;
	}


	public Long getImporteAceptadoPersonal() {
		return importeAceptadoPersonal;
	}


	public void setImporteAceptadoPersonal(Long importeAceptadoPersonal) {
		this.importeAceptadoPersonal = importeAceptadoPersonal;
	}


	public Long getImporteAceptadoDietas() {
		return importeAceptadoDietas;
	}


	public void setImporteAceptadoDietas(Long importeAceptadoDietas) {
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
