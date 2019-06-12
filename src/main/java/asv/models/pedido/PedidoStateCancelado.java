package asv.models.pedido;

public class PedidoStateCancelado implements IPedidoState {

	@Override
	public Boolean changeState(IPedidoState p) {
		return false;
	}

}
