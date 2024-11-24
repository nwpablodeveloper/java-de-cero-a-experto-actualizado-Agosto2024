package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Desactivamos la ejecución de esta clase asi podemos
// usar la otra "ZonaFitSwingn"
//@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private ClienteServicio clienteServicio;

	public static void main(String[] args) {

		SpringApplication.run(ZonaFitApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception{
	}

}
