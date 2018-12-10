package cl.api.rest.pos.module.inventory;

import java.io.Serializable;

import cl.api.rest.pos.dto.configuration.HeaderOutput;

/**
 * Salida para el servicio de listar inventario
 * @author camilongo
 *
 */
public class DtoInventoryOutput implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -1992997422726015778L;
	
	/**
	 * Cabecera del servicio
	 */
	private HeaderOutput headerOutput;

	/** GET Y SET **/
	public HeaderOutput getHeaderOutput() {
		return headerOutput;
	}

	public void setHeaderOutput(HeaderOutput headerOutput) {
		this.headerOutput = headerOutput;
	}
	
}
