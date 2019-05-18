package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import es.domingojunta.entities.ApplicationUser;
import es.domingojunta.model.ActivoInactivoApplicationUserViewModel;
import es.domingojunta.model.ApplicationUserViewModel;
import es.domingojunta.repositories.GestorUsuario;
import es.domingojunta.tools.Convertidor;

@Service
@Qualifier("applicationUserService")
public class ApplicationUserService implements UserDetailsService {

	@Autowired
	@Qualifier("gestorUsuario")
	private GestorUsuario repositorio;
	
	@Autowired
	private Convertidor convertidor;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		ApplicationUser applicationUser = repositorio.findByNombreUsuario(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(applicationUser.getRol());
		authorities.add(authority);
				
		User userDetails = new User(applicationUser.getNombreUsuario(), 
				applicationUser.getPassword(), applicationUser.isActivo(),
				applicationUser.isActivo(), applicationUser.isActivo(), 
				applicationUser.isActivo(), authorities);
		
		return userDetails;
	}
	
	public ApplicationUser findByUserName(String username) {
		
		ApplicationUser appuser = repositorio.findByNombreUsuario(username);
		return appuser;
	}

	public List<ApplicationUserViewModel> getAll() {
		List<ApplicationUser> users = new ArrayList<>();
		users=repositorio.findAll();
		List<ApplicationUserViewModel> viewmodels = new ArrayList<>();
		for (ApplicationUser item : users) {
			ApplicationUserViewModel viewmodel = convertidor.applicationUser2ApplicationUserViewModel(item);
			viewmodels.add(viewmodel);
		}
		return viewmodels;
	}
	
	public ApplicationUserViewModel getOne(int id) {
		ApplicationUser appuser = repositorio.getOne(id);
		ApplicationUserViewModel viewmodel = convertidor.applicationUser2ApplicationUserViewModel(appuser);
		return viewmodel;
	}
	
	public boolean actualizarUsuario(ApplicationUserViewModel viewmodel) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		ApplicationUser appuser = convertidor.applicationUserViewModel2ApplicationUser(viewmodel);
		if (appuser.getPassword().length()<60) {
			String hashPassword = encoder.encode(appuser.getPassword());
			appuser.setPassword(hashPassword);
		}
		try {
			repositorio.save(appuser);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public ApplicationUserViewModel crearUsuario(ApplicationUserViewModel viewmodel) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		if (viewmodel.getIdUsuario()!=null) {
			return null;
		}
		ApplicationUser appuser = new  ApplicationUser();
		appuser.setNombreUsuario(viewmodel.getNombreUsuario());
		String hashPassword = encoder.encode(viewmodel.getPassword());
		appuser.setPassword(hashPassword);
		appuser.setRol(viewmodel.getRol());
		appuser.setActivo(viewmodel.isActivo());
		try {
			repositorio.save(appuser);
			ApplicationUser applicationUser= repositorio.findByNombreUsuario(appuser.getNombreUsuario());
			ApplicationUserViewModel vm = convertidor.applicationUser2ApplicationUserViewModel(applicationUser);
			return vm;
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean borrarUsuario(int id) {
		try {
			repositorio.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean activoInactivoActualizarUsuario(ActivoInactivoApplicationUserViewModel viewmodel) {
		
		try {
			ApplicationUser appuser = new ApplicationUser();
			appuser = repositorio.getOne(viewmodel.getIdUsuario());
			appuser.setActivo(viewmodel.isActivo());
			repositorio.save(appuser);
			return true;
		
		} catch (Exception e) {
			return false;
		}
	}
	
	
}
