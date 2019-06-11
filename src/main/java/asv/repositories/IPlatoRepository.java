package asv.repositories;

import java.io.Serializable;

/*import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;*/
import org.springframework.data.repository.CrudRepository;

import asv.models.Plato;

public interface IPlatoRepository<T,ID extends Serializable> extends CrudRepository<Plato, Long>{

	//Iterable<T> findAll(Sort sort);

	//Page<T> findAll(Pageable pageable);
}
