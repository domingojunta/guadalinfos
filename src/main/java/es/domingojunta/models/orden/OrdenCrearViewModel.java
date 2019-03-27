package es.domingojunta.models.orden;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrdenCrearViewModel {

	private String nombreOrden;
	private String aliasOrden;
	
	
	public OrdenCrearViewModel() {
		super();
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
