package cl.api.rest.pos.module.login;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import cl.api.rest.pos.util.JsonHeaderOutput;

/**
 * Capa intermedia para el login
 * 
 * @author ccontrerasc
 *
 */
@Service
public class LoginService {

	/**
	 * Log
	 */
	private static final Log log = LogFactory.getLog(LoginRest.class);

	/**
	 * Login service
	 * 
	 * @param input
	 * @return
	 */
	public DtoLoginOutput login(DtoInputLogin input) {

		DtoLoginOutput salida = new DtoLoginOutput();
		log.info("Se ha iniciado una llamada al servicio [LOGIN - AUTENTICAR]");

		log.info("User: " + input.getUser() + " , Pass: " + input.getPass());

		log.info("Se ha finalizado una llamada al servicio [LOGIN - AUTENTICAR]");
		salida.setHeaderOutput(JsonHeaderOutput.ok());

		return salida;

	}

}
