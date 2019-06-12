package asv.models.pedido;

public class PedidoStateEntregado extends PedidoState {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public Boolean changeState(PedidoState p) {
		if(p instanceof PedidoStatePagado)
			return true;
		return false;
	}

}
