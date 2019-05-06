package es.domingojunta.entities;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
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
	private String fechaInicio;
	@Column(name="fecha_fin")
	private String fechaFin;
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
	private String fechaJustificacion;
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
	@Column(name="numero_dias_year")
	private Integer numeroDiasYear;
	@Column(name="aplicacion_presupuestaria_corriete")
	private String aplicacionPresupuestariaCorriente;
	@Column(name="aplicacion_presupuestaria_futura")
	private String aplicacionPresupuestariaFutura;
	
	
	
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

	
	public String getFechaInicio() {
		
		return this.fechaInicio;
	}

	
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;	}

	
	public String getFechaFin() {
		
		return this.fechaFin;
	}

	
	public void setFechaFin(String fechaFin) {
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

	
	
	public Integer getNumeroDiasYear() {
		return numeroDiasYear;
	}


	public void setNumeroDiasYear(Integer numeroDiasYear) {
		this.numeroDiasYear = numeroDiasYear;
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


	@Override
	public String toString() {
		return "Convocatoria [idConvocatoria=" + idConvocatoria + ", nombre=" + nombre + ", year=" + year + ", idOrden="
				+ idOrden + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", importeAyuntamientoA="
				+ importeAyuntamientoA + ", importeAyuntamientoB=" + importeAyuntamientoB + ", importeAyuntamientoC="
				+ importeAyuntamientoC + ", importeELAA=" + importeELAA + ", importeELAB=" + importeELAB
				+ ", fechaJustificacion=" + fechaJustificacion + ", SUBAG=" + SUBAG + ", SUBCO=" + SUBCO
				+ ", importeGuadalinfoCorriente=" + importeGuadalinfoCorriente + ", importeGuadalinfoFuturo="
				+ importeGuadalinfoFuturo + ", importeELACorriente=" + importeELACorriente + ", importeELAFuturo="
				+ importeELAFuturo + ", numeroDiasYear=" + numeroDiasYear + "]";
	}

	
}
