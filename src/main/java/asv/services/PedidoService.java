package asv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asv.models.pedido.Pedido;
import asv.repositories.IPedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	IPedidoRepository<Pedido, ?> pedidoRepository;
	
	public Iterable<Pedido> list(){
		return pedidoRepository.findAll();
	}
	
	public Iterable<Pedido> listByUser(String nombre){
		return pedidoRepository.findByNombreUsuario(nombre);
	}
	
	public Optional<Pedido> find(Long id) {
        return pedidoRepository.findById(id);
    }
	
	public Pedido insert(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public Pedido update( Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public void delete(Long id) {
		pedidoRepository.deleteById(id);
	}
}
