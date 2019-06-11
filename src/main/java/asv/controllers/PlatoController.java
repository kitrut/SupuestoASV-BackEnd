package asv.controllers;

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
import asv.services.PlatoService;

@RestController
@RequestMapping("/platos")
public class PlatoController {
	@Autowired
	PlatoService platoService;
	
	@GetMapping
    public Iterable<Plato> list() {
        return platoService.list();
	}
	
	@GetMapping(value = "/{id}")
    public Optional<Plato> find(@PathVariable("id") Long id) {
        return platoService.find(id);
    }
	
	@PostMapping
	public Plato insert(@RequestBody Plato plato) {
		return platoService.insert(plato);
	}
	
	@PutMapping
	public Plato update(@RequestBody Plato plato) {
		return platoService.update(plato);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		platoService.delete(id);
	}
}
