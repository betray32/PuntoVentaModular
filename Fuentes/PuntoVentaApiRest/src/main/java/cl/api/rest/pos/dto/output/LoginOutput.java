package cl.api.rest.pos.dto.output;

import java.io.Serializable;
import java.util.Date;

/**
 * Salida de login
 * 
 * @author camilongo
 *
 */
public class LoginOutput implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -2322975906164700793L;

	/**
	 * Indica si se ha ingresado correctamente
	 */
	private boolean autenticated;

	/**
	 * Fecha de login
	 */
	private Date loginTime;

	/** GET Y SET **/
	public boolean isAutenticated() {
		return autenticated;
	}

	public void setAutenticated(boolean autenticated) {
		this.autenticated = autenticated;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

}
