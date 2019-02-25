package es.domingojunta.entities;
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
	private long importeAyuntamientoA;
	@Column(name="importe_ayuntamientob")
	private long importeAyuntamientoB;
	@Column(name="importe_ayuntamientoc")
	private long importeAyuntamientoC;
	@Column(name="importe_elaa")
	private long importeELAA;
	@Column(name="importe_elab")
	private long importeELAB;
	@Column(name="fecha_justificacion")
	private LocalDate fechaJustificacion;
	@Column(name="SUBAG")
	private String SUBAG;
	@Column(name="SUBCO")
	private String SUBCO;
	@Column(name="importe_guadalinfo_corriente")
	private long importeGuadalinfoCorriente;
	@Column(name="importe_guadalinfo_futuro")
	private long importeGuadalinfoFuturo;
	@Column(name="importe_ela_corriente")
	private long importeELACorriente;
	@Column(name="importe_ela_futuro")
	private long importeELAFuturo;
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


	public long getImporteAyuntamientoA() {
		return importeAyuntamientoA;
	}


	public void setImporteAyuntamientoA(long importeAyuntamientoA) {
		this.importeAyuntamientoA = importeAyuntamientoA;
	}


	public long getImporteAyuntamientoB() {
		return importeAyuntamientoB;
	}


	public void setImporteAyuntamientoB(long importeAyuntamientoB) {
		this.importeAyuntamientoB = importeAyuntamientoB;
	}


	public long getImporteAyuntamientoC() {
		return importeAyuntamientoC;
	}


	public void setImporteAyuntamientoC(long importeAyuntamientoC) {
		this.importeAyuntamientoC = importeAyuntamientoC;
	}


	public long getImporteELAA() {
		return importeELAA;
	}


	public void setImporteELAA(long importeELAA) {
		this.importeELAA = importeELAA;
	}


	public long getImporteELAB() {
		return importeELAB;
	}


	public void setImporteELAB(long importeELAB) {
		this.importeELAB = importeELAB;
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


	public long getImporteGuadalinfoCorriente() {
		return importeGuadalinfoCorriente;
	}


	public void setImporteGuadalinfoCorriente(long importeGuadalinfoCorriente) {
		this.importeGuadalinfoCorriente = importeGuadalinfoCorriente;
	}


	public long getImporteGuadalinfoFuturo() {
		return importeGuadalinfoFuturo;
	}


	public void setImporteGuadalinfoFuturo(long importeGuadalinfoFuturo) {
		this.importeGuadalinfoFuturo = importeGuadalinfoFuturo;
	}


	public long getImporteELACorriente() {
		return importeELACorriente;
	}


	public void setImporteELACorriente(long importeELACorriente) {
		this.importeELACorriente = importeELACorriente;
	}


	public long getImporteELAFuturo() {
		return importeELAFuturo;
	}


	public void setImporteELAFuturo(long importeELAFuturo) {
		this.importeELAFuturo = importeELAFuturo;
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
