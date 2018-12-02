package cl.api.rest.pos.dto.entity;

import java.io.Serializable;

/**
 * Para la camara IP
 * 
 * @author camilongo
 *
 */
public class Camera implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 3166115169548238435L;

	private String nombreCamara;
	private String ip;

	/** GET Y SET **/
	public String getNombreCamara() {
		return nombreCamara;
	}

	public void setNombreCamara(String nombreCamara) {
		this.nombreCamara = nombreCamara;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
