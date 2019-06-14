package asv.services;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import asv.CafeteriaRestApplication;
import asv.models.Pedido;
import asv.models.PedidoStatus;
import asv.repositories.IPedidoRepository;

@Service
public class PedidoService {
	private static final Logger logger = LoggerFactory.getLogger(PedidoService.class);
	
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
			if(pedido.getEstado()==PedidoStatus.CANCELADO && old.get().getEstado()==PedidoStatus.EMITIDO) {
				if(old.get().getFechaServicio().getDayOfYear() != LocalDateTime.now().getDayOfYear()) {
					return null;
				}
			}
			old.get().changeState(pedido.getEstado());
			return pedidoRepository.save(old.get());
		}		
		return null;
	}
	
	public void delete(Long id) {
		pedidoRepository.deleteById(id);
	}
	
	@Scheduled(cron = "0 0 13 * * *")
	public void actualizarEmitidoToEntregado() {
		logger.info("Auto: entrega de pedidos en ejecución", (LocalDateTime.now()) );
		LocalDateTime dateInit = LocalDateTime.now();
		logger.info("Auto: entrega de pedidos ejecutada", (LocalDateTime.now()) );
		dateInit.truncatedTo(ChronoUnit.HOURS).truncatedTo(ChronoUnit.MINUTES).truncatedTo(ChronoUnit.SECONDS).truncatedTo(ChronoUnit.MILLIS);
		LocalDateTime dateFin = dateInit.plus(1, ChronoUnit.DAYS);
		pedidoRepository.entregaPedidosEmitidos(dateInit, dateFin);
	}
	
}
