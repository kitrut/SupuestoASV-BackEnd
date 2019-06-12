package asv.models.pedido;

public class PedidoStateEntregado implements IPedidoState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean changeState(IPedidoState p) {
		if(p instanceof PedidoStatePagado)
			return true;
		return false;
	}

}
