package asv.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
