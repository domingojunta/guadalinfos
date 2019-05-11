package es.domingojunta.model;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import javax.persistence.Column;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;

import com.fasterxml.jackson.annotation.JsonFormat;

import es.domingojunta.entities.Convocatoria;

@XmlRootElement
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
	
	private Integer numeroDiasYear;
	private String aplicacionPresupuestariaCorriente;
	private String aplicacionPresupuestariaFutura;
	
	
	
	public ConvocatoriaListarViewModel() {
		super();
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
	
	public void setFechaInicio(Date fechaInicio) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		this.fechaInicio = formatter.format(fechaInicio);
	}


	public String getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		this.fechaFin = formatter.format(fechaFin)
;	}


	public BigDecimal getImporteAyuntamientoA() {
		return importeAyuntamientoA;
	}


	public void setImporteAyuntamientoA(BigDecimal importeAyuntamientoA) {
		this.importeAyuntamientoA = importeAyuntamientoA;
	}


	public BigDecimal getImporteAyuntamientoB() {
		return importeAyuntamientoB;
	}


	public void setImporteAyuntamientoB(BigDecimal importeAyuntamientoB) {
		this.importeAyuntamientoB = importeAyuntamientoB;
	}


	public BigDecimal getImporteAyuntamientoC() {
		return importeAyuntamientoC;
	}


	public void setImporteAyuntamientoC(BigDecimal importeAyuntamientoC) {
		this.importeAyuntamientoC = importeAyuntamientoC;
	}


	public BigDecimal getImporteELAA() {
		return importeELAA;
	}


	public void setImporteELAA(BigDecimal importeELAA) {
		this.importeELAA = importeELAA;
	}


	public BigDecimal getImporteELAB() {
		return importeELAB;
	}


	public void setImporteELAB(BigDecimal importeELAB) {
		this.importeELAB = importeELAB;
	}


	public String getFechaJustificacion() {
		return fechaJustificacion;
	}


	public void setFechaJustificacion(String fechaJustificacion) {
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


	public BigDecimal getImporteGuadalinfoFuturo() {
		return importeGuadalinfoFuturo;
	}


	public void setImporteGuadalinfoFuturo(BigDecimal importeGuadalinfoFuturo) {
		this.importeGuadalinfoFuturo = importeGuadalinfoFuturo;
	}


	public BigDecimal getImporteELACorriente() {
		return importeELACorriente;
	}


	public void setImporteELACorriente(BigDecimal importeELACorriente) {
		this.importeELACorriente = importeELACorriente;
	}


	public BigDecimal getImporteELAFuturo() {
		return importeELAFuturo;
	}


	public void setImporteELAFuturo(BigDecimal importeELAFuturo) {
		this.importeELAFuturo = importeELAFuturo;
	}

	public Integer getNumeroDiasYear() {
		return numeroDiasYear;
	}


	public void setNumeroDiasYear(Integer numeroDiasYear) {
		this.numeroDiasYear = numeroDiasYear;
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

	
}
