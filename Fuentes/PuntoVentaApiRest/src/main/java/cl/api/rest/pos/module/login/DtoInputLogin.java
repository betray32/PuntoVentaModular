package cl.api.rest.pos.module.login;

import java.io.Serializable;

/**
 * 
 * @author ccontrerasc
 *
 */
public class DtoInputLogin implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 3609704404689876250L;

	private String user;
	private String pass;

	/** GET Y SET **/
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
