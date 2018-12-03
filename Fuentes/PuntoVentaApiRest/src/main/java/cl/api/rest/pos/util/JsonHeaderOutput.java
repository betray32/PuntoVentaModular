package cl.api.rest.pos.util;

import org.springframework.stereotype.Component;

import cl.api.rest.pos.dto.configuration.HeaderOutput;

/**
 * Header output
 * 
 * @author camilongo
 *
 */
public class JsonHeaderOutput {

	/**
	 * OK
	 * 
	 * @return
	 */
	public static HeaderOutput ok() {
		HeaderOutput dto = new HeaderOutput();
		dto.setDesc("OK");
		dto.setExitCode("0");
		return dto;
	}

}
