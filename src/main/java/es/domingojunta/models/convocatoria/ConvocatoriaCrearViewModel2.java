package es.domingojunta.models.convocatoria;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import es.domingojunta.entities.Convocatoria;

public class ConvocatoriaCrearViewModel2 {
	
	
	private String nombreConvocatoria;
	private String yearConvocatoria;
	private int idOrden;
	private String nombreOrden;
	private String aliasOrden;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private long importeAyuntamientoA;
	private long importeAyuntamientoB;
	private long importeAyuntamientoC;
	private long importeELAA;
	private long importeELAB;
	private LocalDate fechaJustificacion;
	private String SUBAG;
	private String SUBCO;
	private long importeGuadalinfoCorriente;
	private long importeGuadalinfoFuturo;
	private long importeELACorriente;
	private long importeELAFuturo;
	private int numeroDias;
	private String aplicacionPresupuestariaCorriente;
	private String aplicacionPresupuestariaFutura;
	private String resuelvePago;
	private String resuelveJustificacion;
	
	public ConvocatoriaCrearViewModel2() {
		super();
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

	public int getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}
	
	
	
	public String getNombreOrden() {
		return nombreOrden;
	}

	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
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

	public String getAliasOrden() {
		return aliasOrden;
	}

	public void setAliasOrden(String aliasOrden) {
		this.aliasOrden = aliasOrden;
	}
	
	

	
}
