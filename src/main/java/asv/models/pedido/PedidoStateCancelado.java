package asv.models.pedido;

public class PedidoStateCancelado extends PedidoState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean changeState(PedidoState p) {
		return false;
	}

}
