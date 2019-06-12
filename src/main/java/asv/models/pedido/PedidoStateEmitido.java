package asv.models.pedido;

public class PedidoStateEmitido implements IPedidoState {

	@Override
	public Boolean changeState(IPedidoState p) {
		if(p instanceof PedidoStateCancelado || p instanceof PedidoStateEntregado)
			return true;
		return false;
	}

}
