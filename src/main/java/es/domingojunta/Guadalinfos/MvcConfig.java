package es.domingojunta.Guadalinfos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@Configuration
@EnableWebMvc
public class MvcConfig {

	
	
	
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		
		WebMvcConfigurer configurer = new WebMvcConfigurer() {
			@Override
			public void addCorsMappings (CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("PUT,GET,POST,DELETE,OPTIONS,*")
				.allowedHeaders("*")
				.exposedHeaders("Access-Control-Allow-Headers","Authorization, x-xsrf-token, Access-Control-Allow-Headers, Origin, Accept, X-Requested-With,Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers","Access-Control-Allow-Origin")
				.allowCredentials(true);
			}
		};
		
		return configurer;
	}
//	
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//				
//		registry.addMapping("/**")
//			.allowedOrigins("*")
//			.allowedMethods("GET","POST","OPTIONS","PUT","DELETE")
//			.allowedHeaders("*")
//			.exposedHeaders("Access-Control-Allow-Headers","Authorization, "
//				+ "x-xsrf-token, Access-Control-Allow-Headers, Origin, "
//				+ "Accept, X-Requested-With,Content-Type, "
//				+ "Access-Control-Request-Method, Access-Control-Request-Headers"
//				,"Access-Control-Allow-Origin")
//		.allowCredentials(true);
//	
//	}
	
//	@Bean
//    public CORSFilter corsFilter() {
//        CorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedMethod(HttpMethod.DELETE);
//        config.addAllowedMethod(HttpMethod.GET);
//        config.addAllowedMethod(HttpMethod.OPTIONS);
//        config.addAllowedMethod(HttpMethod.PUT);
//        config.addAllowedMethod(HttpMethod.POST);
//        ((UrlBasedCorsConfigurationSource) source).registerCorsConfiguration("/**", config);
//        return new CORSFilter(source);
//    }
	
}
