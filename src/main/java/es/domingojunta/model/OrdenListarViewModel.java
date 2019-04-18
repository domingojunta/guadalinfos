package es.domingojunta.model;

import javax.persistence.Column;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import es.domingojunta.entities.Orden;

@XmlRootElement
public class OrdenListarViewModel {
	
	private int idOrden;
	private String nombreOrden;
	private String aliasOrden;
	
	
	public OrdenListarViewModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrdenListarViewModel(Orden orden) {
		this.idOrden=orden.getIdOrden();
		this.nombreOrden=orden.getNombre();
		this.aliasOrden= orden.getAlias();
		
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
	
	
}
