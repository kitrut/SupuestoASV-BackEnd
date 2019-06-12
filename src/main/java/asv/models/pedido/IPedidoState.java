package asv.models.pedido;

import java.io.Serializable;

public interface IPedidoState extends Serializable{
	
	public Boolean changeState(IPedidoState p);
	
}
