package es.domingojunta.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CertificadosViewModel {
	
	private int idSolicitud;
	private String expediente;
	private BigDecimal costePersonal;
	private BigDecimal costeDietas;
	private BigDecimal subvencionPersonal;
	private BigDecimal subvencionDietas;
	private String fechaResolucionConcesion;
	private BigDecimal importeOJ;
	private BigDecimal gradoCumplimientoTecnico;
	private BigDecimal importeJustificadoPersonal;
	private BigDecimal importeJustificadoDietas;
	private BigDecimal importeAceptadoPersonal;
	private BigDecimal importeAceptadoDietas;
	private String fechaLiquidacion;
	private String numeroDocumentoOJ;
	private String expedienteContableJ;
	private String numeroDocumentoJ;
	private String numeroDocumentoO;
	private String expedienteContablePropuestaO;
	private int numeroDiasCerrado;
	
	private int idEntidad;
	private String nombreEntidad;
	private String cif;
	
	private int idConvocatoria;
	private String yearConvocatoria;
	private int numeroDiasYear;
		
	private BigDecimal costeResolucionConcesion;
	private BigDecimal subvencionResolucionConcesion;
	private BigDecimal gradoFinanciacion;
	private BigDecimal gradoMinoracionTemporal;
	private BigDecimal costeEjecutablePersonal;
	private BigDecimal costeEjecutableDietas;
	private BigDecimal costeEjecutableTotal;
	private BigDecimal subvencionEjecutableTotal;
	private BigDecimal financiacionPropiaEjecutable;
	
	//private BigDecimal gradoMinoracionEconomica;
	private BigDecimal importeAceptadoTotal;
	private BigDecimal importeSubvencionProvisionalPersonal;
	private BigDecimal importeSubvencionProvisionalDietas;
	private BigDecimal importeSubvencionProvisionalTotal;
	
	private BigDecimal gradoMinoracionTecnica;
	private BigDecimal importeMinoracionTecnica;
	private BigDecimal importeSubvencionDefinitivoDietas;
	private BigDecimal importeSubvencionDefinitivoPersonal;
	private BigDecimal importeSubvencionDefinitivoTotal;
	private BigDecimal resultadoLiquidacion;
	private BigDecimal importeCosteDefinitivoTotal;
	
	private String subvencionResolucionConcesionString;
	private String importeSubvencionDefinitivoTotalString;
	private String costeResolucionConcesionString;
	private String importeCosteDefinitivoTotalString;
	private String importeOJString;
	private String resultadoLiquidacionString;
	private String gradoFinanciacionString;
	
	
	public CertificadosViewModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	//GETTERS AND SETTERS
	
	
	
	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
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

	public String getFechaResolucionConcesion() throws Exception {
		return formatDate(this.fechaResolucionConcesion);
	}

	public void setFechaResolucionConcesion(String fechaResolucionConcesion) {
		this.fechaResolucionConcesion = fechaResolucionConcesion;
	}

	public BigDecimal getImporteOJ() {
		return importeOJ;
	}

	public void setImporteOJ(BigDecimal importeOJ) {
		this.importeOJ = importeOJ;
	}

	public BigDecimal getGradoCumplimientoTecnico() {
		return gradoCumplimientoTecnico;
	}

	public void setGradoCumplimientoTecnico(BigDecimal gradoCumplimientoTecnico) {
		this.gradoCumplimientoTecnico = gradoCumplimientoTecnico;
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

	public String getFechaLiquidacion() throws ParseException {
		return formatDate(this.fechaLiquidacion);
	}

	public void setFechaLiquidacion(String fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	public String getNumeroDocumentoOJ() {
		return numeroDocumentoOJ;
	}

	public void setNumeroDocumentoOJ(String numeroDocumentoOJ) {
		this.numeroDocumentoOJ = numeroDocumentoOJ;
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

	public String getNumeroDocumentoO() {
		return numeroDocumentoO;
	}

	public void setNumeroDocumentoO(String numeroDocumentoO) {
		this.numeroDocumentoO = numeroDocumentoO;
	}

	public String getExpedienteContablePropuestaO() {
		return expedienteContablePropuestaO;
	}

	public void setExpedienteContablePropuestaO(String expedienteContablePropuestaO) {
		this.expedienteContablePropuestaO = expedienteContablePropuestaO;
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

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public int getIdConvocatoria() {
		return idConvocatoria;
	}

	public void setIdConvocatoria(int idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}

	public String getYearConvocatoria() {
		return yearConvocatoria;
	}

	public void setYearConvocatoria(String yearConvocatoria) {
		this.yearConvocatoria = yearConvocatoria;
	}

	public int getNumeroDiasYear() {
		return numeroDiasYear;
	}

	public void setNumeroDiasYear(int numeroDiasYear) {
		this.numeroDiasYear = numeroDiasYear;
	}

	public int getNumeroDiasCerrado() {
		return numeroDiasCerrado;
	}

	public void setNumeroDiasCerrado(int numeroDiasCerrado) {
		this.numeroDiasCerrado = numeroDiasCerrado;
	}

	public BigDecimal getCosteResolucionConcesion() {
		return costeResolucionConcesion;
	}

	public void setCosteResolucionConcesion(BigDecimal costeResolucionConcesion) {
		this.costeResolucionConcesion = costeResolucionConcesion;
	}

	public BigDecimal getSubvencionResolucionConcesion() {
		return subvencionResolucionConcesion;
	}

	public void setSubvencionResolucionConcesion(BigDecimal subvencionResolucionConcesion) {
		this.subvencionResolucionConcesion = subvencionResolucionConcesion;
	}

	public BigDecimal getGradoFinanciacion() {
		return gradoFinanciacion;
	}

	public void setGradoFinanciacion(BigDecimal gradoFinanciacion) {
		this.gradoFinanciacion = gradoFinanciacion;
	}

	public BigDecimal getGradoMinoracionTemporal() {
		return gradoMinoracionTemporal;
	}

	public void setGradoMinoracionTemporal(BigDecimal gradoMinoracionTemporal) {
		this.gradoMinoracionTemporal = gradoMinoracionTemporal;
	}

	public BigDecimal getCosteEjecutablePersonal() {
		return costeEjecutablePersonal;
	}

	public void setCosteEjecutablePersonal(BigDecimal costeEjecutablePersonal) {
		this.costeEjecutablePersonal = costeEjecutablePersonal;
	}

	public BigDecimal getCosteEjecutableDietas() {
		return costeEjecutableDietas;
	}

	public void setCosteEjecutableDietas(BigDecimal costeEjecutableDietas) {
		this.costeEjecutableDietas = costeEjecutableDietas;
	}

	public BigDecimal getCosteEjecutableTotal() {
		return costeEjecutableTotal;
	}

	public void setCosteEjecutableTotal(BigDecimal costeEjecutableTotal) {
		this.costeEjecutableTotal = costeEjecutableTotal;
	}

	public BigDecimal getSubvencionEjecutableTotal() {
		return subvencionEjecutableTotal;
	}

	public void setSubvencionEjecutableTotal(BigDecimal subvencionEjecutableTotal) {
		this.subvencionEjecutableTotal = subvencionEjecutableTotal;
	}

	public BigDecimal getFinanciacionPropiaEjecutable() {
		return financiacionPropiaEjecutable;
	}

	public void setFinanciacionPropiaEjecutable(BigDecimal financiacionPropiaEjecutable) {
		this.financiacionPropiaEjecutable = financiacionPropiaEjecutable;
	}

	public BigDecimal getImporteAceptadoTotal() {
		return importeAceptadoTotal;
	}

	public void setImporteAceptadoTotal(BigDecimal importeAceptadoTotal) {
		this.importeAceptadoTotal = importeAceptadoTotal;
	}

	public BigDecimal getImporteSubvencionProvisionalPersonal() {
		return importeSubvencionProvisionalPersonal;
	}

	public void setImporteSubvencionProvisionalPersonal(BigDecimal importeSubvencionProvisionalPersonal) {
		this.importeSubvencionProvisionalPersonal = importeSubvencionProvisionalPersonal;
	}

	public BigDecimal getImporteSubvencionProvisionalDietas() {
		return importeSubvencionProvisionalDietas;
	}

	public void setImporteSubvencionProvisionalDietas(BigDecimal importeSubvencionProvisionalDietas) {
		this.importeSubvencionProvisionalDietas = importeSubvencionProvisionalDietas;
	}

	public BigDecimal getImporteSubvencionProvisionalTotal() {
		return importeSubvencionProvisionalTotal;
	}

	public void setImporteSubvencionProvisionalTotal(BigDecimal importeSubvencionProvisionalTotal) {
		this.importeSubvencionProvisionalTotal = importeSubvencionProvisionalTotal;
	}

	public BigDecimal getGradoMinoracionTecnica() {
		return gradoMinoracionTecnica;
	}

	public void setGradoMinoracionTecnica(BigDecimal gradoMinoracionTecnica) {
		this.gradoMinoracionTecnica = gradoMinoracionTecnica;
	}

	public BigDecimal getImporteMinoracionTecnica() {
		return importeMinoracionTecnica;
	}

	public void setImporteMinoracionTecnica(BigDecimal importeMinoracionTecnica) {
		this.importeMinoracionTecnica = importeMinoracionTecnica;
	}

	public BigDecimal getImporteSubvencionDefinitivoDietas() {
		return importeSubvencionDefinitivoDietas;
	}

	public void setImporteSubvencionDefinitivoDietas(BigDecimal importeSubvencionDefinitivoDietas) {
		this.importeSubvencionDefinitivoDietas = importeSubvencionDefinitivoDietas;
	}

	public BigDecimal getImporteSubvencionDefinitivoPersonal() {
		return importeSubvencionDefinitivoPersonal;
	}

	public void setImporteSubvencionDefinitivoPersonal(BigDecimal importeSubvencionDefinitivoPersonal) {
		this.importeSubvencionDefinitivoPersonal = importeSubvencionDefinitivoPersonal;
	}

	public BigDecimal getImporteSubvencionDefinitivoTotal() {
		return importeSubvencionDefinitivoTotal;
	}

	public void setImporteSubvencionDefinitivoTotal(BigDecimal importeSubvencionDefinitivoTotal) {
		this.importeSubvencionDefinitivoTotal = importeSubvencionDefinitivoTotal;
	}

	public BigDecimal getResultadoLiquidacion() {
		return resultadoLiquidacion;
	}

	public void setResultadoLiquidacion(BigDecimal resultadoLiquidacion) {
		this.resultadoLiquidacion = resultadoLiquidacion;
	}

	public BigDecimal getImporteCosteDefinitivoTotal() {
		return importeCosteDefinitivoTotal;
	}

	public void setImporteCosteDefinitivoTotal(BigDecimal importeCosteDefinitivoTotal) {
		this.importeCosteDefinitivoTotal = importeCosteDefinitivoTotal;
	}

	public String getSubvencionResolucionConcesionString() {
		return formatCurrency(this.subvencionResolucionConcesion);
	}

	public void setSubvencionResolucionConcesionString(String subvencionResolucionConcesionString) {
		this.subvencionResolucionConcesionString = subvencionResolucionConcesionString;
	}

	public String getImporteSubvencionDefinitivoTotalString() {
		return formatCurrency(getImporteSubvencionDefinitivoTotal());
	}

	public void setImporteSubvencionDefinitivoTotalString(String importeSubvencionDefinitivoTotalString) {
		this.importeSubvencionDefinitivoTotalString = importeSubvencionDefinitivoTotalString;
	}

	public String getCosteResolucionConcesionString() {
		return formatCurrency(this.costeResolucionConcesion);
	}

	public void setCosteResolucionConcesionString(String costeResolucionConcesionString) {
		this.costeResolucionConcesionString = costeResolucionConcesionString;
	}

	public String getImporteCosteDefinitivoTotalString() {
		return formatCurrency(getImporteCosteDefinitivoTotal());
	}

	public void setImporteCosteDefinitivoTotalString(String importeCosteDefinitivoTotalString) {
		this.importeCosteDefinitivoTotalString = importeCosteDefinitivoTotalString;
	}

	public String getImporteOJString() {
		return formatCurrency(getImporteOJ());
	}

	public void setImporteOJString(String importeOJString) {
		this.importeOJString = importeOJString;
	}

	public String getResultadoLiquidacionString() {
		return formatCurrency(getResultadoLiquidacion());
	}

	public void setResultadoLiquidacionString(String resultadoLiquidacionString) {
		this.resultadoLiquidacionString = resultadoLiquidacionString;
	}
	
	
	
	
		public String getGradoFinanciacionString() {
		return formatPercentage(getGradoFinanciacion());
	}

		public void setGradoFinanciacionString(String gradoFinanciacionString) {
		this.gradoFinanciacionString = gradoFinanciacionString;
	}
		
		// MÉTODOS APOYO
		

		public static String formatCurrency(BigDecimal numero) {

	        double doubleNumero = numero.doubleValue();
	        //NumberFormat formatter = new DecimalFormat("#,#00.00");
	        NumberFormat formatter = new DecimalFormat("#,###,#00.00");
	        
	        String numeroFormateado = formatter.format(doubleNumero);
	        
	        return numeroFormateado;
	    }
		
		public static String formatPercentage(BigDecimal numero) {

	        double doubleNumero = numero.doubleValue();
	        //NumberFormat formatter = new DecimalFormat("#,#00.00");
	        NumberFormat formatter = new DecimalFormat("00.00");
	        
	        String numeroFormateado = formatter.format(doubleNumero);
	        
	        return numeroFormateado;
	    }

	public static String formatDate(String fecha) throws ParseException {
		
		SimpleDateFormat formatter2Date = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaISO = formatter2Date.parse(fecha);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String fechaFormateada = formatter.format(fechaISO);
		return fechaFormateada;
	}
	
	
	public void generarCalculosLiquidacion() {
		
		setCosteResolucionConcesion(getCostePersonal().add(getCosteDietas()));
		setSubvencionResolucionConcesion(getSubvencionPersonal().add(getSubvencionDietas()));
		BigDecimal cien = new BigDecimal("100");
		BigDecimal dividePorCien = new BigDecimal("0.01");
		setGradoFinanciacion((getSubvencionResolucionConcesion().multiply(cien)).divide(getCosteResolucionConcesion(), 10, RoundingMode.HALF_DOWN));
		
		BigDecimal numeroDiasYearBigDecimal = BigDecimal.valueOf(getNumeroDiasYear());
		//System.out.println("El numero de dias al año es: "+numeroDiasYearBigDecimal);
		BigDecimal numeroDiasCerradoBigDecimal = BigDecimal.valueOf(getNumeroDiasCerrado());
		//System.out.println("El número de días al año es: "+numeroDiasCerradoBigDecimal);
		BigDecimal porcentajeDelYearCerrado = numeroDiasCerradoBigDecimal.multiply(cien).divide(numeroDiasYearBigDecimal, 10, RoundingMode.HALF_DOWN); 
	
		//System.out.println("El porcentaje del año cerrado es: "+porcentajeDelYearCerrado);
		BigDecimal gradoMinoracionTemporalBigDecimal = cien.subtract(porcentajeDelYearCerrado);
		//System.out.println("El grado de Minoración Temporal es: "+gradoMinoracionTemporalBigDecimal);
		setGradoMinoracionTemporal(gradoMinoracionTemporalBigDecimal);
		//System.out.println("Y desde el getter: "+getGradoMinoracionTemporal());
		
		BigDecimal costeEjecutablePersonalSinRedondeo = getCostePersonal().multiply(getGradoMinoracionTemporal().multiply(dividePorCien));
		setCosteEjecutablePersonal(costeEjecutablePersonalSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		BigDecimal costeEjecutableDietasSinRedondeo = getCosteDietas().multiply(getGradoMinoracionTemporal().multiply(dividePorCien));
		setCosteEjecutableDietas(costeEjecutableDietasSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		setCosteEjecutableTotal(getCosteEjecutablePersonal().add(getCosteEjecutableDietas()));
		setSubvencionEjecutableTotal(getCosteEjecutableTotal().multiply(getGradoFinanciacion().multiply(dividePorCien)));
		setFinanciacionPropiaEjecutable(getCosteEjecutableTotal().subtract(getSubvencionEjecutableTotal()));
		
		setImporteAceptadoPersonal(getImporteJustificadoPersonal().min(getCosteEjecutablePersonal()));
		setImporteAceptadoDietas(getImporteJustificadoDietas().min(getCosteEjecutableDietas()));
		setImporteAceptadoTotal(getImporteAceptadoPersonal().add(getImporteAceptadoDietas()));
		
		setGradoMinoracionTecnica(getPorcentajeReintegroTecnico(getGradoCumplimientoTecnico()));
		
		BigDecimal importeSubvencionProvisionalTotalSinRedondeo =getImporteAceptadoTotal().multiply(getGradoFinanciacion().multiply(dividePorCien));
		setImporteSubvencionProvisionalTotal(importeSubvencionProvisionalTotalSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		
		BigDecimal importeMinoracionTecnicaSinRedondeo = getImporteSubvencionProvisionalTotal().multiply(getGradoMinoracionTecnica().multiply(dividePorCien));
		setImporteMinoracionTecnica(importeMinoracionTecnicaSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		
    	setImporteSubvencionDefinitivoTotal(getImporteSubvencionProvisionalTotal().subtract(getImporteMinoracionTecnica()));
		setResultadoLiquidacion(getImporteSubvencionDefinitivoTotal().subtract(importeOJ));
		BigDecimal diferencia = null;
		if (getResultadoLiquidacion().intValue()<=0) {
			diferencia = new BigDecimal("0");
			
		} else {
			diferencia = getResultadoLiquidacion();
		}
		
		BigDecimal gradoFinanciacionTantoPorUno = gradoFinanciacion.multiply(dividePorCien);
		BigDecimal importeCosteDefinitivoTotalSinRedondeo = (getResultadoLiquidacion().add(getImporteOJ())).divide(gradoFinanciacionTantoPorUno, 10, RoundingMode.HALF_DOWN);
		//setImporteCosteDefinitivoTotal(importeCosteDefinitivoTotalSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		setImporteCosteDefinitivoTotal(getImporteAceptadoTotal());
		setImporteCosteDefinitivoTotalString(formatCurrency(getImporteCosteDefinitivoTotal()));
		
		
		
	}


	private BigDecimal getPorcentajeReintegroTecnico(BigDecimal gradoCumplimiento) {
		
		int incumplimientoEntero = gradoCumplimiento.setScale(0, RoundingMode.DOWN).intValueExact();
		
		if (incumplimientoEntero>=95) {
			return new BigDecimal("0");
		} else if (incumplimientoEntero>=90) {
			return new BigDecimal("3");
		} else if (incumplimientoEntero>=85) {
			return new BigDecimal("6");
		} else if (incumplimientoEntero>=80) {
			return new BigDecimal("9");
		} else if (incumplimientoEntero>=75) {
			return new BigDecimal("12");
		} else if (incumplimientoEntero>=70) {
			return new BigDecimal("15");
		} else {
			return new BigDecimal("100");
		}
		
	
	}
	

}
