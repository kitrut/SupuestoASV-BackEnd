package asv.models.pedido;

public class PedidoStatePagado implements IPedidoState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean changeState(IPedidoState p) {
		return false;
	}

}
