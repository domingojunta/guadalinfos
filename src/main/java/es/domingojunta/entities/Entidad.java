package es.domingojunta.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Entidad {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_entidad")
	private int idEntidad;
	@Column(name="nombre")
	private String nombre;
	@Column(name="acreedor_giro")
	private String acreedorGIRO;
	@Column(name="cif")
	private String cif;
	@Column(name="direccion")
	private String direccion;
	@Column(name="codigo_postal")
	private String codigoPostal;
	@Column(name="municipio")
	private String municipio;
	@Column(name="provincia")
	private String provincia;
	@Column(name="email_ayuntamiento")
	private String emailAyuntamiento;
	@Column(name="email_centro")
	private String emailCentro;
	@Column(name="tipo")
	private String tipo;
	@Column(name="grupo")
	private String grupo;
	@Column(name="iban")
	private String IBAN;
	@Column(name="posicion_iban")
	private String posicionIBAN;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="id_entidad")
	List<Solicitud> solicitudes = new ArrayList<Solicitud>();
	
	public Entidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
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

	@Override
	public String toString() {
		return "idEntidad=" + idEntidad + ", nombre=" + nombre + ", acreedorGIRO=" + acreedorGIRO + ", cif="
				+ cif + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", municipio=" + municipio
				+ ", provincia=" + provincia + ", emailAyuntamiento=" + emailAyuntamiento + ", emailCentro="
				+ emailCentro + ", tipo=" + tipo + ", grupo=" + grupo;
	}
	
	
	
}
