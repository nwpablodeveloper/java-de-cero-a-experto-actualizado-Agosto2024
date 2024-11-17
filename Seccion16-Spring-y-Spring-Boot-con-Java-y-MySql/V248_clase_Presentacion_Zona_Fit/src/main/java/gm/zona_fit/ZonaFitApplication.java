package gm.zona_fit;

import gm.zona_fit.servicio.ClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Significa que es una App. Spring por default
@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired // Inyectar dependencia configurada con Spring
	private ClienteServicio clienteServicio;

	// Utilizaremos Logger para imprimir información en consola
	private static final Logger logger =
			LoggerFactory.getLogger(ZonaFitApplication.class);

	public static void main(String[] args) {

		logger.info("\nIniciando la Aplicación Zona Fit\n");
		// Levantar fabrica de Spring

		SpringApplication.run(ZonaFitApplication.class, args);

		logger.info("\nAplicación finalizada\n");

	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("*** Aplicación Zona Fit GYM ***");

	}
}
