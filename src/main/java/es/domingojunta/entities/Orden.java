package es.domingojunta.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import es.domingojunta.model.OrdenListarViewModel;

@Entity
@XmlRootElement
public class Orden {

	@Id
	@GeneratedValue
	@Column(name="id_orden")
	private int idOrden;
	@Size(max=355)
	@Column(name="nombre")
	private String nombre;
	@Column(name="alias")
	private String alias;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="id_orden")
	List<Convocatoria> convocatorias = new ArrayList<Convocatoria>();

	public Orden() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orden(@Size(max = 355) String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int id) {
		this.idOrden = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Convocatoria> getConvocatorias() {
		return convocatorias;
	}

	public void setConvocatorias(List<Convocatoria> convocatorias) {
		this.convocatorias = convocatorias;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	
	
}
