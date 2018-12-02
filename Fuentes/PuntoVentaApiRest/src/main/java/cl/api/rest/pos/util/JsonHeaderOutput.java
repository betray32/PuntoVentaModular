package cl.api.rest.pos.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.api.rest.pos.dto.configuration.HeaderOutput;

/**
 * Header output
 * 
 * @author camilongo
 *
 */
@Component
public class JsonHeaderOutput {

	@Autowired
	private HeaderOutput dto;

	/**
	 * OK
	 * 
	 * @return
	 */
	public HeaderOutput ok() {
		dto.setDesc("OK");
		dto.setExitCode("0");
		return dto;
	}

}
