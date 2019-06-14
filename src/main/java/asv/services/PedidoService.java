package asv.services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asv.models.Pedido;
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
		LocalDateTime fecha = LocalDateTime.now();
		pedido.setFechaServicio(fecha);
		
		if(fecha.getHour() < 11 && fecha.getMinute() < 0) {
			pedido.setFechaEntrega(fecha);
			return pedidoRepository.save(pedido);
		}else {
			pedido.setFechaEntrega(fecha.plusDays(1));
			return pedidoRepository.save(pedido);
		}
		
	}
	
	public Pedido update( Pedido pedido) {
		Optional<Pedido> old = pedidoRepository.findById(pedido.getIdPedido());
		if(old.isPresent()) {
			old.get().changeState(pedido.getEstado());
			return pedidoRepository.save(old.get());
		}		
		return null;
	}
	
	public void delete(Long id) {
		pedidoRepository.deleteById(id);
	}
}
