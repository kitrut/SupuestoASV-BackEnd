package asv.models.pedido;

public class PedidoStateEmitido extends PedidoState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean changeState(PedidoState p) {
		if(p instanceof PedidoStateCancelado || p instanceof PedidoStateEntregado)
			return true;
		return false;
	}

}
