package cl.api.rest.pos.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.api.rest.pos.dto.output.ForgotPasswordOutput;
import cl.api.rest.pos.dto.output.LoginOutput;
import cl.api.rest.pos.util.JsonHeaderOutput;

/**
 * Expone el login de salida
 */
@RestController
@RequestMapping("Login")
public class RestLogin {

	/**
	 * Log
	 */
	private static final Log log = LogFactory.getLog(RestLogin.class);

	@Autowired
	private JsonHeaderOutput headerOutput;

	/**
	 * Login
	 * 
	 * @return
	 */
	@RequestMapping("Authentication")
	public LoginOutput login() {
		LoginOutput res = new LoginOutput();
		res.setHeaderOutput(headerOutput.ok());
		return res;
	}

	/**
	 * Recuperar password
	 * 
	 * @return
	 */
	@RequestMapping("ForgotPassword")
	public ForgotPasswordOutput forgotPassword() {
		return new ForgotPasswordOutput();
	}

}
