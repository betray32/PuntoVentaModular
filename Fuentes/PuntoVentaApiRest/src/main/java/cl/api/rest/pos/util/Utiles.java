package cl.api.rest.pos.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Utiles {

	/**
	 * Log
	 */
	private static final Log log = LogFactory.getLog(Utiles.class);

	/**
	 * 
	 * Metodo encargado de formatear los decimales a dos numeros despues de la coma
	 * 
	 * @param numeroFormatea
	 * 
	 * @return
	 * 
	 */
	public static double formateaDecimal(double numeroFormatea) {
		return (double) Math.round(numeroFormatea * 100d) / 100d;
	}

	/**
	 * Limpia el rut de caracteres extras
	 * 
	 * @param rutLimpia
	 * @return
	 */
	public static String limpiaRut(String rutLimpia) {

		String sinPunto = rutLimpia.replace(".", "");
		return sinPunto.replace("-", "");

	}

	/**
	 * Obtener la excepcion raiz, con esto no es necesario imprimir todo el objeto y
	 * solo se obtendra la causa especifica
	 * 
	 * Se llama asi: System.out.println(getRootException(e).getLocalizedMessage());
	 * 
	 * @param exception
	 * @return
	 */
	public static Throwable getCompleteExcept(Throwable exception) {

		Throwable rootException = exception;
		while (rootException.getCause() != null) {
			rootException = rootException.getCause();
		}

		return rootException;

	}

	/**
	 * Permite limpiarle el / al final a las url
	 * 
	 * @param input
	 * @return
	 */
	public static String obtenerUrlLimpia(String input) {

		String res = input;
		log.info("URL analizada: " + input);

		try {
			String ultimoCaracter = input.substring(res.length() - 1, res.length());

			if (ultimoCaracter.equalsIgnoreCase("/")) {
				res = res.substring(0, res.length() - 1);
				log.info("La url ha sido limpiada, resultado: " + res);
			} else {
				log.info("Url OK");
			}

		} catch (Exception e) {

			log.error("ERROR > " + getCompleteExcept(e));
		}

		return res;

	}

}
