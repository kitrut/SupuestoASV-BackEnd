package asv.models.pedido;

public class PedidoStatePagado implements IPedidoState {

	@Override
	public Boolean changeState(IPedidoState p) {
		return false;
	}

}
