package cl.api.rest.pos.dto.entity;

import java.io.Serializable;

/**
 * Abstraccion para un elemento del inventario
 * 
 * @author camilongo
 *
 */
public class Item implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -6451524641926167416L;

	private String nombre;
	private String precio;
	private int cantidad;
	private String categoria;

	/** GET Y SET **/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
