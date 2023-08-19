package iti.estudiantes;

import iti.estudiantes.modelo.Estudiante;
import iti.estudiantes.servicio.EstudianteServicio;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

//import java.util.logging.Logger;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;

	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciado aplicación Estudiantes Spring...");
		// Levatar aplicacion Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Finaliza aplicación!!!");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl + "Ejecutando metodo run..." + nl);

		// Capa de presentación
		var salir = false;
		var consola = new Scanner(System.in);

		while(!salir){
			generaMenu();
			salir = ejecutaOpciones(consola);
			logger.info(nl);
		}

	}

	private void generaMenu(){
		logger.info(nl);
		logger.info("***** Aplicación de Estudiantes *****" + nl);
		logger.info("1. Listar Estudiantes" + nl);
		logger.info("2. Buscar Estudiante" + nl);
		logger.info("3. Agregar Estudiante" + nl);
		logger.info("4. Modificar Estudiante" + nl);
		logger.info("5. Eliminar Estudiante" + nl);
		logger.info("6. Salir" + nl);
		logger.info("Ingrese la opción: ");
	}

	private boolean ejecutaOpciones(Scanner consola){
		int opcion = Integer.parseInt(consola.nextLine());
		boolean salir = false;
		switch (opcion){
			case 1: { // Listar estudiantes
				logger.info(nl + "Listado de Estudiantes" + nl);
				List<Estudiante> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach(estudiante -> logger.info(estudiante.toString() + nl));
				break;
			}
			case 2: { // Buscar estudiante por ID
				logger.info("Ingrese ID de estudiantes a buscar: " );
				var idEstudiante =  Integer.parseInt(consola.nextLine());
				Estudiante estudiante = estudianteServicio.findEsudiante(idEstudiante);

				if(estudiante != null)
					logger.info("Estudiante encontrado: " + estudiante + nl);
				else
					logger.info("No se encontro estudiante con ID: " + idEstudiante + nl);
				break;
			}
			case 3: {
				logger.info("Agregar Estudiante" + nl );
				logger.info("Cédula: ");
				var cedula = consola.nextLine();
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Telefono: ");
				var telefono = consola.nextLine();
				logger.info("Email: ");
				var email = consola.nextLine();

				// Creamos objeto estudiantes sin clave primaria
				var estudiante = new Estudiante();
				estudiante.setCedula(cedula);
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);

				// Enviamos a guardar nuevo estudiante
				estudianteServicio.saveEstudiante(estudiante);
				logger.info("Estudiante agregado: " + estudiante + nl);
				break;
			}
			case 4: { // Modificar estudiante
				logger.info("Modificar Estudiante" + nl );
				logger.info("ingrese ID Estudiante a modificar: ");
				var idEstudiante =  Integer.parseInt(consola.nextLine());
				Estudiante estudiante = estudianteServicio.findEsudiante(idEstudiante);
				if(estudiante != null){
					logger.info("Cédula: ");
					var cedula = consola.nextLine();
					logger.info("Nombre: ");
					var nombre = consola.nextLine();
					logger.info("Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Telefono: ");
					var telefono = consola.nextLine();
					logger.info("Email: ");
					var email = consola.nextLine();
					// Seteamos todos los valores
					estudiante.setCedula(cedula);
					estudiante.setNombre(nombre);
					estudiante.setApellido(apellido);
					estudiante.setTelefono(telefono);
					estudiante.setEmail(email);
					estudianteServicio.saveEstudiante(estudiante);
					logger.info("Estudiante modificado: " + estudiante + nl);
				}
				else {
					logger.info("No se encontro estudiante con ID: " + idEstudiante + nl);
				}
				break;
			}
			case 5: { // Eliminar Estudiante
				logger.info("Eliminar Estudiante" + nl );
				logger.info("ingrese ID Estudiante a eliminar: ");
				var idEstudiante =  Integer.parseInt(consola.nextLine());
				Estudiante estudiante = estudianteServicio.findEsudiante(idEstudiante);
				if(estudiante != null){
					estudianteServicio.deleteEstudiante(estudiante);
					logger.info("Estudiante eliminado: " + estudiante + nl);
				}
				else{
					logger.info("No se encontro estudiante con ID: " + idEstudiante + nl);
				}
				break;
			}
			case 6: { // Salir aplicacion
				logger.info("Gracias por usar la aplicación" + nl + nl);
				salir = true;
				break;
			}
			default: {
				logger.info("Opcion ingresada no existe, vuelva a intentarlo: " + opcion + nl);
				break;
			}
		} // fin switch

		return salir;
	}
}
