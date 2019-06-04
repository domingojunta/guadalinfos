package es.domingojunta.Guadalinfos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import es.domingojunta.services.ApplicationUserService;
import es.domingojunta.Guadalinfos.LoginFilter;
/**
 * 
 * @author domingo
 * Esta clase
 *
 */
@Configuration
@EnableWebSecurity
@CrossOrigin(origins="*", methods= {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS})
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter{
	
	@Autowired
	@Qualifier("applicationUserService")
	private ApplicationUserService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}

	@Bean
	public PasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.cors().and()
			.csrf().disable()
			.authorizeRequests().antMatchers("/login").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
			.anyRequest().authenticated().and()
			.addFilterBefore(new LoginFilter(authenticationManager()),UsernamePasswordAuthenticationFilter.class)
			.addFilterBefore(new JwtFilter(authenticationManager()),UsernamePasswordAuthenticationFilter.class);
	}
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		
		List<String> origins = new ArrayList<String>();
		origins.add("*");
		List<String> methods = new ArrayList<String>();
		methods.add("*");
		List<String> headers = new ArrayList<String>();
		headers.add("*");
		List<String> exposedHeaders = new ArrayList<String>();
		exposedHeaders.add("Access-Control-Allow-Headers");
		exposedHeaders.add("Authorization, x-xsrf-token, "
				+ "Access-Control-Allow-Headers, Origin, Accept, "
				+ "X-Requested-With,Content-Type, "
				+ "Access-Control-Request-Method, "
				+ "Access-Control-Request-Headers");
		exposedHeaders.add("Access-Control-Allow-Origin");
		CorsConfiguration configuration = new CorsConfiguration();
	    configuration.setAllowCredentials(true);
	    configuration.setAllowedOrigins(origins);
	    configuration.setAllowedMethods(methods);
	    configuration.setMaxAge((long) 86400);
	    configuration.setAllowedHeaders(headers);
	    configuration.setExposedHeaders(exposedHeaders);
	    
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		
		source.registerCorsConfiguration("/**", configuration);
		
		return source;
		
		
		
		
	}
	
	
}
