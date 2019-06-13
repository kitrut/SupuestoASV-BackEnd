package asv.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import asv.models.Plato;
import asv.models.pedido.Pedido;
import asv.services.PedidoService;

@RestController
@CrossOrigin
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping
    public Iterable<Pedido> list(@RequestParam(defaultValue = "") String nombre) {
		if(nombre.equals(""))
			return pedidoService.list();
		else {
			return pedidoService.listByUser(nombre);
		}			
	}
	
	@GetMapping(value="/{id}")
	public Optional<Pedido> find(@PathVariable("id") Long id){
		return pedidoService.find(id);
	}
	
	@PostMapping
	public Pedido insert(@RequestBody Pedido pedido) {
		return pedidoService.insert(pedido);
	}
	
	@PutMapping
	public Pedido update(@RequestBody Pedido pedido) {
		return pedidoService.update(pedido);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		pedidoService.delete(id);
	}
	
}
