package es.domingojunta.Guadalinfos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import es.domingojunta.entities.ApplicationUser;
import es.domingojunta.repositories.GestorUsuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.TextCodec;

public class JwtFilter extends BasicAuthenticationFilter{

	public JwtFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		
		String token = request.getHeader("Authorization");
		if (token == null || !token.startsWith("Bearer")) {
			chain.doFilter(request, response);
		}
		UsernamePasswordAuthenticationToken auth = getAuthentication(request,token);
			
		SecurityContextHolder.getContext().setAuthentication(auth);
		chain.doFilter(request, response);
}

	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request, String token) {
		
			JwtParser jwtParser = Jwts.parser()
					.setSigningKey("En!un!lugar!de!la!Mancha!de!cuyo!nombre!no!quiero!acordarme");
			Jws<Claims> claimsJws= jwtParser.parseClaimsJws(token.replace("Bearer", ""));
			Claims claims = claimsJws.getBody();
			String user = claims.getSubject();
			String rol = claims.get("rol").toString();
									
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(rol);
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(authority);
			
			if (user!=null) {
				UsernamePasswordAuthenticationToken userToken = 
						new UsernamePasswordAuthenticationToken(user, authorities, authorities);
				return userToken;
			}
			return null;
		}
}
