package asv.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import asv.models.Usuario;
import asv.repositories.IUsuarioRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private IUsuarioRepository<Usuario, Serializable> usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario us = usuarioRepository.findByNombre(username);
		UserDetails ud = new User(us.getUser(),us.getPassword(),null);
		return ud;
	}

}
