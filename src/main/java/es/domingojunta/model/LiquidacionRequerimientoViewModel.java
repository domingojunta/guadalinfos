package es.domingojunta.model;


public class LiquidacionRequerimientoViewModel {
	
	
	private int idSolicitud;
	private String expediente;
	private String fechaEntrada;
	
	private int idEntidad;
	private String nombreEntidad;
	private String tipoEntidad;
	private String direccion;
	private String codigoPostal;
	private String municipio;
	private String provincia;
	
	private int idOrden;
	private String nombreOrden;
	
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String yearConvocatoria;
	
	private String documentacionRequerida;
	
	private String parrafoNotificacion;
	private String parrafoInformacion;
	private String parrafoNormativa;
	
	
	public LiquidacionRequerimientoViewModel() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
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

	
	
	public String getDocumentacionRequerida() {
		return documentacionRequerida;
	}

	public void setDocumentacionRequerida(String documentacionRequerida) {
		this.documentacionRequerida = documentacionRequerida;
	}

	public void setParrafoNotificacion() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(getTipoEntidad().toUpperCase());
		sb.append(" DE ");
		sb.append(getNombreEntidad().toUpperCase());
		sb.append("\n");
		sb.append(getDireccion());
		sb.append("\n");
		sb.append(getCodigoPostal());
		sb.append(" ");
		sb.append(getNombreEntidad());
		sb.append(" ");
		sb.append(getProvincia());
		this.parrafoNotificacion = sb.toString();
		
	}
	
	public void setParrafoInformacion() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("N/Ref: Desarrollo Tecnológico DO/al\n");
		sb.append("Fecha: La de la firma\n");
		sb.append("Asunto: Requerimiento de subsanación de la justificación\n");
		sb.append("Expediente: ");
		sb.append(getExpediente());
		sb.append(" / ");
		sb.append(getYearConvocatoria());
		
		this.parrafoInformacion = sb.toString();
		
		
	}
	
	public void setParrafoNormativa() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Una vez presentada la documentación justificativa de la subvención concedida al amparo de la ");
		sb.append(getNombreOrden());
		sb.append(", cuya convocatoria para el año ");
		sb.append(getYearConvocatoria());
		sb.append(", se realizó en virtud de la ");
		sb.append(getNombreConvocatoria());
		sb.append(".");
		
		this.parrafoNormativa= sb.toString();
		
	}
	
	

	public String getParrafoInformacion() {
		return parrafoInformacion;
	}

	public void setParrafoInformacion(String parrfoInformacion) {
		this.parrafoInformacion = parrfoInformacion;
	}

	public void setParrafoNotificacion(String parrafoNotificacion) {
		this.parrafoNotificacion = parrafoNotificacion;
	}

	public void setParrafoNormativa(String parrafoNormativa) {
		this.parrafoNormativa = parrafoNormativa;
	}

	
	public String getParrafoNotificacion() {
		return parrafoNotificacion;
	}

	public String getParrafoNormativa() {
		return parrafoNormativa;
	}

		

}
