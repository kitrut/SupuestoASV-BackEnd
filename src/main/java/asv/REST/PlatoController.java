package asv.REST;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import asv.models.Plato;
import asv.repository.IPlatoRepository;

@RestController
@RequestMapping("/platos")
public class PlatoController {
	@Autowired
	IPlatoRepository platoRepository;
	
	@GetMapping
    public Iterable<Plato> list() {
        return platoRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
    public Optional<Plato> find(@PathVariable("id") Long id) {
        return platoRepository.findById(id);
    }
	
	@PostMapping
	public Plato insert(@RequestBody Plato persona) {
		return platoRepository.save(persona);
	}
	
	@PutMapping
	public Plato update(@RequestBody Plato persona) {
		return platoRepository.save(persona);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		platoRepository.deleteById(id);
	}
}
