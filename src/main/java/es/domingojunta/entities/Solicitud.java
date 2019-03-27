package es.domingojunta.entities;

import java.math.BigDecimal;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@XmlRootElement
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
	private String fechaEntrada;
	@Column(name="expediente")
	private String expediente;
	@Column(name="subcc")
	private String subcc;
	@Column(name="coste_personal")
	private BigDecimal costePersonal;
	@Column(name="coste_dietas")
	private BigDecimal costeDietas;
	@Column(name="subvencion_personal")
	private BigDecimal subvencionPersonal;
	@Column(name="subvencion_dietas")
	private BigDecimal subvencionDietas;
	@Column(name="fecha_comunicacion_entrada")
	private String fechaComunicacionEntrada;
	@Column(name="fecha_aeat")
	private  String fechaAeat;
	@Column(name="fecha_atrian")
	private String fechaAtrian;
	@Column(name="fecha_seguridad_social")
	private String fechaSeguridadSocial;
	@Column(name="fecha_requerimiento_solicitud")
	private String fechaRequerimientoSolicitud;
	@Column(name="fecha_propuesta_concesion")
	private String fechaPropuestaConcesion;
	@Column(name="expediente_contabled")
	private String expedienteContableD;
	@Column(name="numero_documentod")
	private String numeroDocumentoD;
	@Column(name="fecha_resolucion_concesion")
	private String fechaResolucionConcesion;
	@Column(name="fecha_notificacion_resolucion_concesion")
	private String fechaNotificacionResolucionConcesion;
	
	@Column(name="fecha_propuestaoj")
	private String fechaPropuestaOJ;
	@Column(name="expediente_contableoj")
	private String expedienteContableOJ;
	@Column(name="numero_documentooj")
	private String numeroDocumentoOJ;
	@Column(name="importeOJ")
	private BigDecimal importeOJ;
	@Column(name="fecha_pago_materialoj")
	private String fechaPagoMaterialOJ;
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
	private String fechaPropuestaLiquidacion;
	@Column(name="fecha_alegaciones_propuesta_liquidacion")
	private String fechaAlegacionesPropuestaLiquidacion;
	@Column(name="fecha_liquidacion")
	private String fechaLiquidacion;
	@Column(name="fecha_notificacion_liquidacion")
	private String fechaNotificacionLiquidacion;
	
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
	private String fechaPagoMaterialO;
	
	@Column(name="fecha_acuerdo_inicio_reintegro")
	private String fechaAcuerdoInicioReintegro;
	@Column(name="fecha_alegacionesair")
	private String fechaAlegacionesAIR;
	@Column(name="fecha_resolucion_reintegro")
	private String fechaResolucionReintegro;
	@Column(name="numero_modelo022")
	private String numeroModelo022;
	@Column(name="importe_modelo022")
	private BigDecimal importeModelo022;
	@Column(name="fecha_notificacion_resolucion_reintegro")
	private String fechaNotificacionResolucionReintegro;
	@Column(name="fecha_abono_reintegro")
	private String fechaAbonoReintegro;
	
	
	public Solicitud() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public String toString() {
		return "Solicitud [idSolicitud=" + idSolicitud + ", idConvocatoria=" + idConvocatoria + ", idEntidad="
				+ idEntidad + ", fechaEntrada=" + fechaEntrada + ", expediente=" + expediente + ", SUBCC=" + subcc
				+ ", costePersonal=" + costePersonal + ", costeDietas=" + costeDietas + ", subvencionPersonal="
				+ subvencionPersonal + ", subvencionDietas=" + subvencionDietas + "]";
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




	public int getIdEntidad() {
		return idEntidad;
	}




	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
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

	
	
	
	
}
