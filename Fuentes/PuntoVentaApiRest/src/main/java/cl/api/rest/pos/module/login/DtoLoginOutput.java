package cl.api.rest.pos.module.login;

import java.io.Serializable;
import java.util.Date;

import cl.api.rest.pos.dto.configuration.HeaderOutput;

/**
 * Salida de login
 * 
 * @author camilongo
 *
 */
public class DtoLoginOutput implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -2322975906164700793L;
	
	/**
	 * Cabecera del servicio
	 */
	private HeaderOutput headerOutput;

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

	public HeaderOutput getHeaderOutput() {
		return headerOutput;
	}

	public void setHeaderOutput(HeaderOutput headerOutput) {
		this.headerOutput = headerOutput;
	}

}
