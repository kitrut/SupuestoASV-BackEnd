package asv.models.pedido;

public class PedidoStateEmitido implements IPedidoState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean changeState(IPedidoState p) {
		if(p instanceof PedidoStateCancelado || p instanceof PedidoStateEntregado)
			return true;
		return false;
	}

}
