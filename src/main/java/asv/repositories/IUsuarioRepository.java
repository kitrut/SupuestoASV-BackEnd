package asv.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import asv.models.Usuario;

public interface IUsuarioRepository<T,ID extends Serializable> extends CrudRepository<Usuario, Long>{
	Usuario findByNombre(String nombre);
}
