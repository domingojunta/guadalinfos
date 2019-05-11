package es.domingojunta.Guadalinfos;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.domingojunta.entities.ApplicationUser;
import es.domingojunta.services.ApplicationUserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;


public class LoginFilter extends UsernamePasswordAuthenticationFilter {
	
	
	private AuthenticationManager authenticationManager;
	
	public LoginFilter(AuthenticationManager auth) {
		this.authenticationManager = auth;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		
		try {
			InputStream body = request.getInputStream();
			ApplicationUser credentials = new ObjectMapper().readValue(body, ApplicationUser.class);
			UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(
					credentials.getNombreUsuario(), credentials.getPassword(), new ArrayList<>());
			return authenticationManager.authenticate(userToken);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, 
			FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		
		User userDetails = (User) authResult.getPrincipal();
		
		List<GrantedAuthority> optionalAuthority = (List<GrantedAuthority>) authResult.getAuthorities();
		GrantedAuthority authority = optionalAuthority.get(0);
		
		String username = userDetails.getUsername();
		Date today = new Date();
		Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));	
		
		String token = Jwts.builder()
			.setSubject(username)
			.claim("rol", authority.toString())
			.claim("nombreUsuario", username)
			.setExpiration(tomorrow)
			.signWith(SignatureAlgorithm.HS512,"En!un!lugar!de!la!Mancha!de!cuyo!nombre!no!quiero!acordarme")
			.compact();
		
		response.addHeader("Authorization", "Bearer "+token);
		response.addHeader("Content-Type", "application/json");
	}

	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException failed) throws IOException, ServletException {
		// TODO Auto-generated method stub
		super.unsuccessfulAuthentication(request, response, failed);
		response.addHeader("Content-Type", "application/json");
	}

	
	
}
