package cl.api.rest.pos.module.login;

import java.io.Serializable;
import java.util.Date;

import cl.api.rest.pos.dto.configuration.HeaderOutput;

/**
 * Salida para recuperar contrasena
 * 
 * @author camilongo
 *
 */
public class DtoLoginForgotPasswordOutput implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 3968785277595206871L;

	/**
	 * Cabecera del servicio
	 */
	private HeaderOutput headerOutput;

	/**
	 * Indica si la password fue entregada hacia el email indicado correctamente
	 */
	private boolean passwordDelivered;

	/**
	 * Indica el tiempo restante para ingresar la password
	 */
	private Date requestRemainTime;

	/** GET Y SET **/
	public boolean isPasswordDelivered() {
		return passwordDelivered;
	}

	public void setPasswordDelivered(boolean passwordDelivered) {
		this.passwordDelivered = passwordDelivered;
	}

	public Date getRequestRemainTime() {
		return requestRemainTime;
	}

	public void setRequestRemainTime(Date requestRemainTime) {
		this.requestRemainTime = requestRemainTime;
	}

	public HeaderOutput getHeaderOutput() {
		return headerOutput;
	}

	public void setHeaderOutput(HeaderOutput headerOutput) {
		this.headerOutput = headerOutput;
	}
}
