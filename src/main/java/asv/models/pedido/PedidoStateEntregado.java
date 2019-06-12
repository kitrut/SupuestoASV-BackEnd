package asv.models.pedido;

public class PedidoStateEntregado implements IPedidoState {

	@Override
	public Boolean changeState(IPedidoState p) {
		if(p instanceof PedidoStatePagado)
			return true;
		return false;
	}

}
