package cl.api.rest.pos.dto.entity;

import java.io.Serializable;

/**
 * Entidad para el proveedor
 * 
 * @author camilongo
 *
 */
public class Supplier implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -2810201327690551039L;

	private String nombre;
	private String telefono;
	private String email;
	private String direccion;
	private String categoria;

	/** GET Y SET **/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
