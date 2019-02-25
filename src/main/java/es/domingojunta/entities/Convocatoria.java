package es.domingojunta.entities;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Convocatoria {

	@Id
	@GeneratedValue
	@Column(name="id_convocatoria")
	private int idConvocatoria;
	@Size(max=355)
	@Column(name="nombre")
	private String nombre;
	@Size(max=5)
	@Column(name="year")
	private String year;
	@Column(name="id_orden")
	private int idOrden;
	@Column(name="fecha_inicio")
	private LocalDate fechaInicio;
	@Column(name="fecha_fin")
	private LocalDate fechaFin;
	@Column(name="importe_ayuntamientoa")
	private BigDecimal importeAyuntamientoA;
	@Column(name="importe_ayuntamientob")
	private BigDecimal importeAyuntamientoB;
	@Column(name="importe_ayuntamientoc")
	private BigDecimal importeAyuntamientoC;
	@Column(name="importe_elaa")
	private BigDecimal importeELAA;
	@Column(name="importe_elab")
	private BigDecimal importeELAB;
	@Column(name="fecha_justificacion")
	private LocalDate fechaJustificacion;
	@Column(name="SUBAG")
	private String SUBAG;
	@Column(name="SUBCO")
	private String SUBCO;
	@Column(name="importe_guadalinfo_corriente")
	private BigDecimal importeGuadalinfoCorriente;
	@Column(name="importe_guadalinfo_futuro")
	private BigDecimal importeGuadalinfoFuturo;
	@Column(name="importe_ela_corriente")
	private BigDecimal importeELACorriente;
	@Column(name="importe_ela_futuro")
	private BigDecimal importeELAFuturo;
	@Column(name="numero_dias")
	private int numeroDias;
	@Column(name="aplicacion_presupuestaria_corriete")
	private String aplicacionPresupuestariaCorriente;
	@Column(name="aplicacion_presupuestaria_futura")
	private String aplicacionPresupuestariaFutura;
	@Column(name="resuelve_pago")
	private String resuelvePago;
	@Column(name="resuelve_justificacion")
	private String resuelveJustificacion;
	
	@OneToMany(mappedBy="idConvocatoria", fetch=FetchType.LAZY)
	//@JoinColumn(name="id_convocatoria")
	List<Solicitud> solicitudes = new ArrayList<Solicitud>();
	
	
	public Convocatoria() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdConvocatoria() {
		return idConvocatoria;
	}


	public void setIdConvocatoria(int idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public int getIdOrden() {
		return idOrden;
	}


	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaFin() {
		return fechaFin;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}


	public BigDecimal getImporteAyuntamientoA() {
		return importeAyuntamientoA;
	}


	public void setImporteAyuntamientoA(BigDecimal importeAyuntamientoA) {
		this.importeAyuntamientoA = importeAyuntamientoA;
	}
	
	public void setImporteAyuntamientoA(String importeAyuntamientoA) {
		this.importeAyuntamientoA = new BigDecimal(importeAyuntamientoA);
	}


	public BigDecimal getImporteAyuntamientoB() {
		return importeAyuntamientoB;
	}


	public void setImporteAyuntamientoB(BigDecimal importeAyuntamientoB) {
		this.importeAyuntamientoB = importeAyuntamientoB;
	}
	
	public void setImporteAyuntamientoB(String importeAyuntamientoB) {
		this.importeAyuntamientoB = new BigDecimal(importeAyuntamientoB);
	}


	public BigDecimal getImporteAyuntamientoC() {
		return importeAyuntamientoC;
	}


	public void setImporteAyuntamientoC(BigDecimal importeAyuntamientoC) {
		this.importeAyuntamientoC = importeAyuntamientoC;
	}
	
	public void setImporteAyuntamientoC(String importeAyuntamientoC) {
		this.importeAyuntamientoC = new BigDecimal(importeAyuntamientoC);
	}


	public BigDecimal getImporteELAA() {
		return importeELAA;
	}


	public void setImporteELAA(BigDecimal importeELAA) {
		this.importeELAA = importeELAA;
	}
	
	public void setImporteELAA(String importeELAA) {
		this.importeELAA = new BigDecimal(importeELAA);
	}


	public BigDecimal getImporteELAB() {
		return importeELAB;
	}


	public void setImporteELAB(BigDecimal importeELAB) {
		this.importeELAB = importeELAB;
	}
	
	public void setImporteELAB(String importeELAB) {
		this.importeELAB = new BigDecimal(importeELAB);
	}

	@JsonFormat(pattern="dd-MM-yyyy")
	public LocalDate getFechaJustificacion() {
		return fechaJustificacion;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setFechaJustificacion(LocalDate fechaJustificacion) {
		this.fechaJustificacion = fechaJustificacion;
	}


	public String getSUBAG() {
		return SUBAG;
	}


	public void setSUBAG(String sUBAG) {
		SUBAG = sUBAG;
	}
	
	


	public String getSUBCO() {
		return SUBCO;
	}


	public void setSUBCO(String sUBCO) {
		SUBCO = sUBCO;
	}


	public BigDecimal getImporteGuadalinfoCorriente() {
		return importeGuadalinfoCorriente;
	}


	public void setImporteGuadalinfoCorriente(BigDecimal importeGuadalinfoCorriente) {
		this.importeGuadalinfoCorriente = importeGuadalinfoCorriente;
	}
	
	public void setImporteGuadalinfoCorriente(String importeGuadalinfoCorriente) {
		this.importeGuadalinfoCorriente = new BigDecimal(importeGuadalinfoCorriente);
	}


	public BigDecimal getImporteGuadalinfoFuturo() {
		return importeGuadalinfoFuturo;
	}


	public void setImporteGuadalinfoFuturo(BigDecimal importeGuadalinfoFuturo) {
		this.importeGuadalinfoFuturo = importeGuadalinfoFuturo;
	}
	
	public void setImporteGuadalinfoFuturo(String importeGuadalinfoFuturo) {
		this.importeGuadalinfoFuturo = new BigDecimal(importeGuadalinfoFuturo);
	}


	public BigDecimal getImporteELACorriente() {
		return importeELACorriente;
	}


	public void setImporteELACorriente(BigDecimal importeELACorriente) {
		this.importeELACorriente = importeELACorriente;
	}
	
	public void setImporteELACorriente(String importeELACorriente) {
		this.importeELACorriente = new BigDecimal(importeELACorriente);
	}


	public BigDecimal getImporteELAFuturo() {
		return importeELAFuturo;
	}


	public void setImporteELAFuturo(BigDecimal importeELAFuturo) {
		this.importeELAFuturo = importeELAFuturo;
	}
	
	public void setImporteELAFuturo(String importeELAFuturo) {
		this.importeELAFuturo = new BigDecimal(importeELAFuturo);
	}


	public int getNumeroDias() {
		return numeroDias;
	}


	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}


	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}


	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	

	public String getAplicacionPresupuestariaCorriente() {
		return aplicacionPresupuestariaCorriente;
	}


	public void setAplicacionPresupuestariaCorriente(String aplicacionPresupuestariaCorriente) {
		this.aplicacionPresupuestariaCorriente = aplicacionPresupuestariaCorriente;
	}


	public String getAplicacionPresupuestariaFutura() {
		return aplicacionPresupuestariaFutura;
	}


	public void setAplicacionPresupuestariaFutura(String aplicacionPresupuestariaFutura) {
		this.aplicacionPresupuestariaFutura = aplicacionPresupuestariaFutura;
	}


	


	public String getResuelvePago() {
		return resuelvePago;
	}


	public void setResuelvePago(String resuelvePago) {
		this.resuelvePago = resuelvePago;
	}


	public String getResuelveJustificacion() {
		return resuelveJustificacion;
	}


	public void setResuelveJustificacion(String resuelveJustificacion) {
		this.resuelveJustificacion = resuelveJustificacion;
	}


	@Override
	public String toString() {
		return "idConvocatoria=" + idConvocatoria + ", nombre=" + nombre + ", year=" + year + ", idOrden="
				+ idOrden + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", numeroDias=" + numeroDias;
	}

	
	
	
	
}
