package cl.api.rest.pos.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.api.rest.pos.dto.output.ForgotPasswordOutput;
import cl.api.rest.pos.dto.output.LoginOutput;

/**
 * Expone el login de salida
 */
@RestController
@RequestMapping("Login")
public class RestLogin {

	/**
	 * Login
	 * 
	 * @return
	 */
	@RequestMapping("Authentication")
	public LoginOutput login() {
		return new LoginOutput();
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
