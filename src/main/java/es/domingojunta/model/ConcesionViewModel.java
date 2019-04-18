package es.domingojunta.model;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;


public class ConcesionViewModel {
		
	private int idSolicitud;
	private String yearConvocatoria;
	private String expediente;
	private String fechaEntrada;
	private BigDecimal costePersonal;
	private BigDecimal costeDietas;
	private BigDecimal subvencionPersonal;
	private BigDecimal subvencionDietas;
		
	private int idEntidad;
	private String nombreEntidad;
	private String grupoEntidad;
	private String cif;
	private String tipoEntidad;
	private String direccion;
	private String codigoPostal;
	private String municipio;
	private String provincia;
	
	private int idOrden;
	private String nombreOrden;
	
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String fechaJustificacion;
	private String aplicacionPresupuestariaCorriente;
	private String aplicacionPresupuestariaFutura;
	private String fechaInicio;
	private String fechaFin;
	
	private String parrafoDatosSubvencion;
	private String parrafoVista;
	private String antecedente01;
	private String propone01;
	private String propone02;
	private String parrafoAnexo;
	private BigDecimal coste;
	private BigDecimal subvencion;
	private String porcentajeFinanciacion;
	private BigDecimal financiacionPropia;
	
	
	public ConcesionViewModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void setCoste() {
		this.coste = getCostePersonal().add(getCosteDietas());
	}
	
	public void setSubvencion() {
		this.subvencion = getSubvencionPersonal().add(getSubvencionDietas());
	}
	
	public void setPorcentajeFinanciacion() {
		BigDecimal cien = new BigDecimal(100);
		BigDecimal numerador = getSubvencion().multiply(cien);
		BigDecimal porcentaje = numerador.divide(getCoste(),10, RoundingMode.HALF_UP);
		
		
		this.porcentajeFinanciacion = porcentaje.toString();
		System.out.println("El porcentaje de la subvención es: "+ this.porcentajeFinanciacion);
		
	}
	
	public void setFinanciacionPropia() {
		this.financiacionPropia = getCoste().subtract(getSubvencion());
	}

	public void setParrafoDatosSubvencion() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getTipoEntidad().toUpperCase()+": "+getNombreEntidad());
		sb.append("\n");
		sb.append("CIF: "+getCif());
		sb.append("\n");
		sb.append("DOMICILIO: "+getDireccion());
		sb.append("\n");
		sb.append("EXPEDIENTE: "+getExpediente()+" / "+getYearConvocatoria());
		sb.append("\n");
		sb.append("GRUPO: "+getGrupoEntidad());
		sb.append("\n");
		sb.append("PARTIDAS PRESUPUESTARIAS:");
		sb.append("\n");
		sb.append(getAplicacionPresupuestariaCorriente());
		sb.append("\n");
		sb.append(getAplicacionPresupuestariaFutura());
		sb.append("\n");
		sb.append("PRESUPUESTO APROBADO: "+ formatCurrency(getCoste())+" €.");
		sb.append("\n");
		sb.append("CUANTÍA DE LA SUBVENCIÓN: "+formatCurrency(getSubvencion())+" €.");
		sb.append("\n");
		sb.append("FINANCIACIÓN DEL PROYECTO POR LA JUNTA DE ANDALUCÍA: "+getPorcentajeFinanciacion()+" %.");
				
		this.parrafoDatosSubvencion = sb.toString();
		
	}
	
		public void setParrafoVista() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Vista la solicitud presentada en el marco de la: ");
		sb.append(getNombreOrden());
		sb.append(", al amparo de la ");
		sb.append(getNombreConvocatoria());
		sb.append(" y en base a los siguientes: ");
				
		this.parrafoVista = sb.toString();
		
	}
		
		public void setAntecedente01() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("Primero.- Con fecha ");
			sb.append(formatDate(getFechaEntrada()));
			sb.append(" tiene entrada en el Registro de este Órgano, la solicitud presentada por el/la ");
			sb.append(getTipoEntidad().toUpperCase());
			sb.append(" DE ");
			sb.append(getNombreEntidad().toUpperCase());
			sb.append(" con número de expediente: ");
			sb.append(getExpediente()+" / "+getYearConvocatoria());
			sb.append(", solicitando la concesión de una subvención para la Dinamización de un Centro de Acceso ");
			sb.append("Público a Internet en la localidad cordobesa de ");
			sb.append(getNombreEntidad());
			sb.append(".");
					
			this.antecedente01 = sb.toString();
		}
		
		public void setPropone01() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("PRIMERO.- Conceder al/la ");
			sb.append(getTipoEntidad().toUpperCase());
			sb.append(" DE ");
			sb.append(getNombreEntidad().toUpperCase());
			sb.append(" una subvención por importe de ");
			sb.append(formatCurrency(getSubvencion()));
			sb.append(" €, destinada a la dinamización de un Centro de Acceso Público a Internet,");
			sb.append(" siendo el presupuesto aceptado el detallado en el Anexo de la presente propuesta de resolución");
					
			this.propone01 = sb.toString();
		}
		
		public void setPropone02() throws Exception {
			StringBuilder sb = new StringBuilder();
			sb.append("SEGUNDO.- El plazo de ejecución de la actividad subvencionada abarca desde el ");
			sb.append(formatDate(getFechaInicio()));
			sb.append(" hasta el  ");
			sb.append(formatDate(getFechaFin()));
			sb.append(".");
			
					
			this.propone02 = sb.toString();
		}
		
		public void setParrafoAnexo() throws Exception {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("PRESUPUESTO ACEPTADO PARA LA DINAMIZACIÓN DEL CENTRO DE ACCESO PÚBLICO A INTERNET EN EL/LA ");
			sb.append(getTipoEntidad().toUpperCase());
			sb.append(" DE ");
			sb.append(getNombreEntidad().toUpperCase());
			sb.append(" (CÓRDOBA).");
			sb.append("\n");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("                    PARTIDA                           COSTE            SUBVENCIÓN");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("Gastos de Personal:                             ");
			sb.append(formatCurrency(getCostePersonal()));
			sb.append("            "+formatCurrency(getSubvencionPersonal()));
			sb.append("\n");
			sb.append("Gastos de dietas y desplazamientos:        ");
			sb.append(formatCurrency(getCosteDietas()));
			sb.append("                "+formatCurrency(getSubvencionDietas()));
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("\n");
			sb.append("Presupuesto total del proyecto: ");
			sb.append(formatCurrency(getCoste()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("Subvención total aprobada:       ");
			sb.append(formatCurrency(getSubvencion()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("Financiación propia total(1):       ");
			sb.append(formatCurrency(getFinanciacionPropia()));
			sb.append(" €.");
			
			
			this.parrafoAnexo = sb.toString();
		}



	public int getIdSolicitud() {
		return idSolicitud;
	}



	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}



	public String getYearConvocatoria() {
		return yearConvocatoria;
	}



	public void setYearConvocatoria(String yearConvocatoria) {
		this.yearConvocatoria = yearConvocatoria;
	}

	

	public String getCif() {
		return cif;
	}



	public void setCif(String cif) {
		this.cif = cif;
	}



	public String getExpediente() {
		return expediente;
	}



	public void setExpediente(String expediente) {
		this.expediente = expediente;
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



	public String getGrupoEntidad() {
		return grupoEntidad;
	}



	public void setGrupoEntidad(String grupoEntidad) {
		this.grupoEntidad = grupoEntidad;
	}



	public String getFechaEntrada() {
		return fechaEntrada;
	}



	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
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



	public String getTipoEntidad() {
		return tipoEntidad;
	}



	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
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



	public String getFechaJustificacion() throws Exception {
		
		
		return formatDate(fechaJustificacion);
	}



	public void setFechaJustificacion(String fechaJustificacion) {
		this.fechaJustificacion = fechaJustificacion;
	}


	
	public String getParrafoDatosSubvencion() {
		return parrafoDatosSubvencion;
	}



	public void setParrafoDatosSubvencion(String parrafoDatosSubvencion) {
		this.parrafoDatosSubvencion = parrafoDatosSubvencion;
	}



	public String getParrafoVista() {
		return parrafoVista;
	}



	public void setParrafoVista(String parrafoVista) {
		this.parrafoVista = parrafoVista;
	}



	public String getAntecedente01() {
		return antecedente01;
	}



	public void setAntecedente01(String antecedente01) {
		this.antecedente01 = antecedente01;
	}



	public String getPropone01() {
		return propone01;
	}



	public void setPropone01(String propone01) {
		this.propone01 = propone01;
	}



	public String getPropone02() {
		return propone02;
	}



	public void setPropone02(String propone02) {
		this.propone02 = propone02;
	}



	public String getParrafoAnexo() {
		return parrafoAnexo;
	}



	public void setParrafoAnexo(String texto) {
		this.parrafoAnexo = texto;
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


	public BigDecimal getCoste() {
		return coste;
	}


	public void setCoste(BigDecimal coste) {
		this.coste = coste;
	}


	public BigDecimal getSubvencion() {
		return subvencion;
	}


	public void setSubvencion(BigDecimal subvencion) {
		this.subvencion = subvencion;
	}
	
	
	
	public String getPorcentajeFinanciacion() {
		return porcentajeFinanciacion;
	}


	public void setPorcentajeFinanciacion(String porcentajeFinanciacion) {
		this.porcentajeFinanciacion = porcentajeFinanciacion;
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

	

	public BigDecimal getFinanciacionPropia() {
		return financiacionPropia;
	}


	public void setFinanciacionPropia(BigDecimal financiacionPropia) {
		this.financiacionPropia = financiacionPropia;
	}

	
	
	public static String formatCurrency(BigDecimal numero) {

        double doubleNumero = numero.doubleValue();
        //NumberFormat formatter = new DecimalFormat("#,#00.00");
        NumberFormat formatter = new DecimalFormat("#,###,#00.00");
        
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
	
	
	
	
	

}
