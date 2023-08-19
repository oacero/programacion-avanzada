package iti.libros;

import iti.libros.vista.LibroForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class LibrosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LibrosApplication.class, args);
		ConfigurableApplicationContext contextSprint = new SpringApplicationBuilder(LibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);

		// Ejecutar el formulario
		EventQueue.invokeLater(()->{
			// Obtener objeto formulario
			LibroForm libroForm = contextSprint.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});
	}

}
