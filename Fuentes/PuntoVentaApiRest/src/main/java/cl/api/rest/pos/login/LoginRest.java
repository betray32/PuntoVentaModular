package cl.api.rest.pos.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Expone el login de salida
 */
@RestController
@RequestMapping("Login")
public class LoginRest {

	@Autowired
	private LoginService loginService;

	/**
	 * Login
	 * 
	 * @return
	 */
	@PostMapping("Authentication")
	@ResponseBody
	public DtoLoginOutput login(@RequestBody DtoInputLogin input) {
		return loginService.login(input);
	}

	/**
	 * Recuperar password
	 * 
	 * @return
	 */
	@RequestMapping("ForgotPassword")
	public DtoLoginForgotPasswordOutput forgotPassword() {
		return new DtoLoginForgotPasswordOutput();
	}

}
