/**
 * 
 */
package cl.api.rest.pos.dto.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidad para la categoria
 * 
 * @author camilongo
 *
 */
public class Category implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -4309703899380955858L;

	private String nombre;
	private boolean activo;
	private Date fechaIngreso;

	/** GET Y SET **/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
