package asv.models.pedido;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public interface IPedidoState extends Serializable{
	
	public Boolean changeState(IPedidoState p);
	
}
