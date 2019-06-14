package asv.repositories;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import asv.models.Pedido;

public interface IPedidoRepository <T,ID extends Serializable> extends CrudRepository<Pedido, Long>{

	List<Pedido> findByNombreUsuario(String nombre);
	
	@Modifying
	@Transactional
	@Query(value= "UPDATE Pedido SET estado=1 WHERE estado=0 AND fechaentrega >= :dateInit AND fechaentrega < :dateFin")
	void entregaPedidosEmitidos(@Param("dateInit") LocalDateTime dateInit,@Param("dateFin") LocalDateTime dateFin);
}
