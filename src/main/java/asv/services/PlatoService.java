package asv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import asv.models.Plato;
import asv.models.PlatoType;
import asv.repositories.IPlatoRepository;

@Service
public class PlatoService {

	@Autowired
	IPlatoRepository<Plato, ?> platoRepository;
	
    public Iterable<Plato> list() {
    	return platoRepository.findAllByOrderByNombreAsc();
    	//return platoRepository.findAll(PageRequest.of(1, 2));
	}
    
    public Iterable<Plato> listByTipo(PlatoType id) {
    	return platoRepository.findByTipo(id);
    	//return platoRepository.findAll(PageRequest.of(1, 2));
	}
	
    public Optional<Plato> find(Long id) {
        return platoRepository.findById(id);
    }
	
	public Plato insert(Plato plato) {
		return platoRepository.save(plato);
	}
	
	public Plato update( Plato plato) {
		return platoRepository.save(plato);
	}
	
	public void delete(Long id) {
		platoRepository.deleteById(id);
	}
	
}
