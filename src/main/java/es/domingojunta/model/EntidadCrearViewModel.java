package es.domingojunta.model;

import javax.xml.bind.annotation.XmlRootElement;

import es.domingojunta.entities.Entidad;

@XmlRootElement
public class EntidadCrearViewModel {

	
	private String nombreEntidad;
	private String acreedorGIRO;
	private String cif;
	private String direccion;
	private String codigoPostal;
	private String municipio;
	private String provincia;
	private String emailAyuntamiento;
	private String emailCentro;
	private String tipoEntidad;
	private String grupoEntidad;
	private String IBAN;
	private String posicionIBAN;
	
	public EntidadCrearViewModel() {
		}
	
	

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getAcreedorGIRO() {
		return acreedorGIRO;
	}

	public void setAcreedorGIRO(String acreedorGIRO) {
		this.acreedorGIRO = acreedorGIRO;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
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

	public String getEmailAyuntamiento() {
		return emailAyuntamiento;
	}

	public void setEmailAyuntamiento(String emailAyuntamiento) {
		this.emailAyuntamiento = emailAyuntamiento;
	}

	public String getEmailCentro() {
		return emailCentro;
	}

	public void setEmailCentro(String emailCentro) {
		this.emailCentro = emailCentro;
	}

	public String getTipoEntidad() {
		return tipoEntidad;
	}

	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}

	public String getGrupoEntidad() {
		return grupoEntidad;
	}

	public void setGrupoEntidad(String grupoEntidad) {
		this.grupoEntidad = grupoEntidad;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getPosicionIBAN() {
		return posicionIBAN;
	}

	public void setPosicionIBAN(String posicionIBAN) {
		this.posicionIBAN = posicionIBAN;
	}
	
	
	
}
