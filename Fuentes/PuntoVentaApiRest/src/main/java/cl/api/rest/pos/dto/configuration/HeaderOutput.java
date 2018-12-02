package cl.api.rest.pos.dto.configuration;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Salida generica
 * 
 * @author camilongo
 *
 */
@Component
public class HeaderOutput implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 5076743424188512655L;
	
	private String exitCode;
	private String desc;

	/** GET Y SET **/
	public String getExitCode() {
		return exitCode;
	}

	public void setExitCode(String exitCode) {
		this.exitCode = exitCode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
