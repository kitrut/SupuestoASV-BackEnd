package asv.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import asv.models.pedido.Pedido;

public interface IPedidoRepository <T,ID extends Serializable> extends CrudRepository<Pedido, Long>{

	List<Pedido> findByNombreUsuario(String nombre);
}
