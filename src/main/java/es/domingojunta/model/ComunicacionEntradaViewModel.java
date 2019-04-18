package es.domingojunta.model;

public class ComunicacionEntradaViewModel {
	
	private int idSolicitud;
	private String yearConvocatoria;
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
		
	private String parrafoNotificacion;
	private String parrafoInformacion;
	private String parrafoNormativa;
	private String parrafoPlazosYEfectos;
	private String pieDeFirma;
	
	public ComunicacionEntradaViewModel() {
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

	
	
	public void setParrafoNotificacion() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(getTipoEntidad().toUpperCase());
		sb.append(" de ");
		sb.append(getNombreEntidad());
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
		sb.append("Asunto: Comunicación Entrada Solicitud\n");
		sb.append("Expediente: ");
		sb.append(getExpediente());
		sb.append(" / ");
		sb.append(getYearConvocatoria());
		
		this.parrafoInformacion = sb.toString();
		
		
	}
	
	public void setParrafoNormativa() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("De conformidad con la obligación establecida en el artículo 21.4 de la Ley 39/2015 ");
		sb.append("de 1 de octubre, Ley de Procedimiento Administrativo Común de las Administraciones ");
		sb.append("Públicas (BOE número 236 de 2 de octubre del 2015) y de la ");
		sb.append(getNombreOrden());
		sb.append(", se le informa que el pasado ");
		sb.append(getFechaEntrada());
		sb.append(" tuvo entrada en el Registro de éste órgano su solicitud de subvención presentada al ");
		sb.append("amparo de la Orden anteriormente citada, en su convocatoria para el año ");
		sb.append(getYearConvocatoria());
		sb.append(", en virtud de la ");
		sb.append(getNombreConvocatoria());
		sb.append(".");
		
		this.parrafoNormativa= sb.toString();
		
	}
	
	public void setParrafoPlazosYEfectos() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("De conformidad con la citada Orden, la presente solicitud inicia un procedimiento administrativo ");
		sb.append("que se tramitará y resolverá en régimen de concurrencia no competitiva por esta Delegación Territorial, ");
		sb.append("siendo el plazo máximo para resolver y notificar de seis meses a computar desde que la solicitud ");
		sb.append("haya tenido entrada en el registro de esta Delegación Territorial. ");
		sb.append("Deberá entender desestimada su solicitud al vencer el plazo máximo anteriormente citado, ");
		sb.append("sin que se hubiese notificado resolución expresa.");
		
		this.parrafoPlazosYEfectos = sb.toString();
		
				
	}
	
	public void setPieDeFirma() {
		this.pieDeFirma= "EL JEFE DE SERVICIO DE COOPERACIÓN ECONÓMICA Y DESARROLLO TECNOLÓGICO\nFdo.: Domingo José Orta Pacheco";
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

	public void setParrafoPlazosYEfectos(String parrafoPlazosYEfectos) {
		this.parrafoPlazosYEfectos = parrafoPlazosYEfectos;
	}

	public void setPieDeFirma(String pieDeFirma) {
		this.pieDeFirma = pieDeFirma;
	}
	
	
	
	

	public String getParrafoNotificacion() {
		return parrafoNotificacion;
	}

	public String getParrafoNormativa() {
		return parrafoNormativa;
	}

	public String getParrafoPlazosYEfectos() {
		return parrafoPlazosYEfectos;
	}

	public String getPieDeFirma() {
		return pieDeFirma;
	}

	@Override
	public String toString() {
		return "notificacionComunicacionViewModel [idSolicitud=" + idSolicitud + ", yearConvocatoria="
				+ yearConvocatoria + ", expediente=" + expediente + ", fechaEntrada=" + fechaEntrada + ", idEntidad="
				+ idEntidad + ", nombreEntidad=" + nombreEntidad + ", tipoEntidad=" + tipoEntidad + ", direccion="
				+ direccion + ", codigoPostal=" + codigoPostal + ", municipio=" + municipio + ", provincia=" + provincia
				+ ", idOrden=" + idOrden + ", nombreOrden=" + nombreOrden + ", idConvocatoria=" + idConvocatoria
				+ ", nombreConvocatoria=" + nombreConvocatoria + ", parrafoNotificacion=" + parrafoNotificacion
				+ ", parrafoInformacion=" + parrafoInformacion + ", parrafoNormativa=" + parrafoNormativa
				+ ", parrafoPlazosYEfectos=" + parrafoPlazosYEfectos + ", pieDeFirma=" + pieDeFirma + "]";
	}
	
	
	
	
	

}
