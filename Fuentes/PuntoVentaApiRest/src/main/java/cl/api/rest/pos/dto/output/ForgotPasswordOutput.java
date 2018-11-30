package cl.api.rest.pos.dto.output;

import java.io.Serializable;
import java.util.Date;

/**
 * Salida para recuperar contrasena
 * 
 * @author camilongo
 *
 */
public class ForgotPasswordOutput implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 3968785277595206871L;

	/**
	 * Indica si la password fue entregada hacia el email indicado correctamente
	 */
	public boolean passwordDelivered;

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

}
