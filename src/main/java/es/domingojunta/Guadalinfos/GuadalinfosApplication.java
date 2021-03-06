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


@EntityScan("es.domingojunta.entities")
@ComponentScan(basePackages="es.domingojunta")
@EnableJpaRepositories(basePackages="es.domingojunta.repositories")
@SpringBootApplication
public class GuadalinfosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuadalinfosApplication.class, args);
	}
	
	
}
