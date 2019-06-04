package es.domingojunta.Guadalinfos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author domingo
 * Esta es el punto de entrada a mi aplicación
 * Las anotaciones configuran los paquetes de escaneo de mis componentes
 * que mediante inyección de dependencias utilizaré a lo largo de la app.
 * Además voy a utilizar los respositorios automáticos de Spring a partir
 * de sus interfaces.
 *
 */
@EntityScan("es.domingojunta.entities")
@ComponentScan(basePackages="es.domingojunta")
@EnableJpaRepositories(basePackages="es.domingojunta.repositories")
@SpringBootApplication
public class GuadalinfosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuadalinfosApplication.class, args);
	}
}
