package es.domingojunta.models.convocatoria;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import es.domingojunta.entities.Convocatoria;

public class ConvocatoriaListarViewModel {
	
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String yearConvocatoria;
	private int idOrden;
	private String nombreOrden;
	private String aliasOrden;
	private String fechaInicio;
	private String fechaFin;
	private BigDecimal importeAyuntamientoA;
	private BigDecimal importeAyuntamientoB;
	private BigDecimal importeAyuntamientoC;
	private BigDecimal importeELAA;
	private BigDecimal importeELAB;
	private String fechaJustificacion;
	private String SUBAG;
	private String SUBCO;
	private BigDecimal importeGuadalinfoCorriente;
	private BigDecimal importeGuadalinfoFuturo;
	private BigDecimal importeELACorriente;
	private BigDecimal importeELAFuturo;
	private int numeroDias;
	private String aplicacionPresupuestariaCorriente;
	private String aplicacionPresupuestariaFutura;
	private String resuelvePago;
	private String resuelveJustificacion;
	
	
	public ConvocatoriaListarViewModel() {
		super();
		}
	
	public ConvocatoriaListarViewModel(Convocatoria convocatoria) {
		
		this.idConvocatoria = convocatoria.getIdConvocatoria();
		this.nombreConvocatoria = convocatoria.getNombre();
		this.yearConvocatoria = convocatoria.getYear();
		this.idOrden = convocatoria.getIdOrden();
		this.fechaInicio = convocatoria.getFechaInicio();
		this.fechaFin= convocatoria.getFechaFin();
		this.importeAyuntamientoA = convocatoria.getImporteAyuntamientoA();
		this.importeAyuntamientoB = convocatoria.getImporteAyuntamientoB();
		this.importeAyuntamientoC = convocatoria.getImporteAyuntamientoC();
		this.importeELAA = convocatoria.getImporteELAA();
		this.importeELAB = convocatoria.getImporteELAB();
		this.fechaJustificacion = convocatoria.getFechaJustificacion();
		this.SUBAG= convocatoria.getSUBAG();
		this.SUBCO= convocatoria.getSUBCO();
		this.importeGuadalinfoCorriente= convocatoria.getImporteGuadalinfoCorriente();
		this.importeGuadalinfoFuturo= convocatoria.getImporteGuadalinfoFuturo();
		this.importeELACorriente= convocatoria.getImporteELACorriente();
		this.importeELAFuturo= convocatoria.getImporteELAFuturo();
		//this.numeroDias=convocatoria.getNumeroDias();
		this.numeroDias= convocatoria.getNumeroDiasYear();
		this.aplicacionPresupuestariaCorriente=convocatoria.getAplicacionPresupuestariaCorriente();
		this.aplicacionPresupuestariaFutura=convocatoria.getAplicacionPresupuestariaFutura();
		//this.resuelvePago=convocatoria.getResuelvePago();
		//this.resuelveJustificacion=convocatoria.getResuelveJustificacion();
		
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

	
	public Double getImporteAyuntamientoA() {
		return importeAyuntamientoA.doubleValue();
	}
	public void setImporteAyuntamientoA(BigDecimal importeAyuntamientoA) {
		this.importeAyuntamientoA = importeAyuntamientoA;
	}
	public Double getImporteAyuntamientoB() {
		return importeAyuntamientoB.doubleValue();
	}
	public void setImporteAyuntamientoB(BigDecimal importeAyuntamientoB) {
		this.importeAyuntamientoB = importeAyuntamientoB;
	}
	public Double getImporteAyuntamientoC() {
		return importeAyuntamientoC.doubleValue();
	}
	public void setImporteAyuntamientoC(BigDecimal importeAyuntamientoC) {
		this.importeAyuntamientoC = importeAyuntamientoC;
	}
	public Double getImporteELAA() {
		return importeELAA.doubleValue();
	}
	public void setImporteELAA(BigDecimal importeELAA) {
		this.importeELAA = importeELAA;
	}
	public Double getImporteELAB() {
		return importeELAB.doubleValue();
	}
	public void setImporteELAB(BigDecimal importeELAB) {
		this.importeELAB = importeELAB;
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
	public Double getImporteGuadalinfoCorriente() {
		return importeGuadalinfoCorriente.doubleValue();
	}
	public void setImporteGuadalinfoCorriente(BigDecimal importeGuadalinfoCorriente) {
		this.importeGuadalinfoCorriente = importeGuadalinfoCorriente;
	}
	public Double getImporteGuadalinfoFuturo() {
		return importeGuadalinfoFuturo.doubleValue();
	}
	public void setImporteGuadalinfoFuturo(BigDecimal importeGuadalinfoFuturo) {
		this.importeGuadalinfoFuturo = importeGuadalinfoFuturo;
	}
	public Double getImporteELACorriente() {
		return importeELACorriente.doubleValue();
	}
	public void setImporteELACorriente(BigDecimal importeELACorriente) {
		this.importeELACorriente = importeELACorriente;
	}
	public Double getImporteELAFuturo() {
		return importeELAFuturo.doubleValue();
	}
	public void setImporteELAFuturo(BigDecimal importeELAFuturo) {
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaJustificacion() {
		return fechaJustificacion;
	}

	public void setFechaJustificacion(String fechaJustificacion) {
		this.fechaJustificacion = fechaJustificacion;
	}
	
	

	
}
