package cl.api.rest.pos.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Launcher
 * 
 * @author camilongo
 *
 */
@SpringBootApplication
@ComponentScan({ "cl.api.rest.pos.login", "cl.api.rest.pos.util" })
public class PuntoVentaApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntoVentaApiRestApplication.class, args);
	}
}
