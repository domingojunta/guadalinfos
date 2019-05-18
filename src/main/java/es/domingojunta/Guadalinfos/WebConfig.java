package es.domingojunta.Guadalinfos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		
		
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*").exposedHeaders("Access-Control-Allow-Headers","Authorization, x-xsrf-token, Access-Control-Allow-Headers, Origin, Accept, X-Requested-With,Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers","Access-Control-Allow-Origin").allowCredentials(true);
	
	}
	
}
