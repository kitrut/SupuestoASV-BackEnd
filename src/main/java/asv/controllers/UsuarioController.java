package asv.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import asv.models.Usuario;
import asv.repositories.IUsuarioRepository;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuarioRepository<Usuario, Serializable> usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping()
	public void saveUsuario(@RequestBody Usuario user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setVerificado(false);
		usuarioRepository.save(user);
	}
}
