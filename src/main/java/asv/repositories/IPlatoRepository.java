package asv.repositories;

import java.io.Serializable;
import java.util.List;

/*import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;*/
import org.springframework.data.repository.CrudRepository;

import asv.models.Plato;
import asv.models.PlatoType;

public interface IPlatoRepository<T,ID extends Serializable> extends CrudRepository<Plato, Long>{

	List<Plato> findByTipo(PlatoType tipo);
	//Iterable<T> findAll(Sort sort);

	//Page<T> findAll(Pageable pageable);
}
