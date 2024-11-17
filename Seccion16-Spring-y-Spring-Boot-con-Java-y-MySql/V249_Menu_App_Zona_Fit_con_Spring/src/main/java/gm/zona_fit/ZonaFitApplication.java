package gm.zona_fit;

import gm.zona_fit.servicio.ClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private ClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	/*
		Usar un salto de linea generico para cualquier sistema operativo
	 */
	private String nl = System.lineSeparator();

	public static void main(String[] args) {

		logger.info("\nIniciando la Aplicación Zona Fit\n");
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("\nAplicación finalizada\n");

	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp(){
		logger.info(nl + "*** Aplicación Zona Fit GYM ***" + nl);
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			var opcion = mostrarMenu(consola);
//			salir = opcioneSeleccionada();
			logger.info(nl);
		}
	}


	private int mostrarMenu(Scanner consola){
		logger.info("""
				Menú
				1. Listar Clientes
				2. Buscar Cliente
				3. Agregar Cliente
				4. Modificar Cliente
				5. Eliminar Cliente
				6. Salir
				Elige una opción:\s""");
		return Integer.parseInt(consola.nextLine());
	}

}












