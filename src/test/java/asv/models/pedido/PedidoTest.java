package asv.models.pedido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import asv.models.Pedido;

public class PedidoTest {

	private Pedido pedido;
	
	@BeforeAll
	public static void init() {}
	
	@BeforeEach
	public void setUp() throws Exception {
		pedido = new Pedido();
	}

	/*@Test
	public void CambioEstadoEmitidoToOthers() {
		assertTrue(pedido.getState() instanceof PedidoStateEmitido);		
		
		//TRANSICION NO PERMITIDA EMITIDO => PAGADO
		pedido.changeState(StatePagado);
		assertTrue(pedido.getState() instanceof PedidoStateEmitido);
		
		//TRANSICION PERMITIDA EMITIDO => ENTREGADO
		pedido.changeState(StateEntregado);
		assertTrue(pedido.getState() instanceof PedidoStateEntregado);
		
		//TRANSICION PERMITIDA EMITIDO => CANCELADO
		pedido = new Pedido();
		assertTrue(pedido.getState() instanceof PedidoStateEmitido);
		pedido.changeState(StateCancelado);
		assertTrue(pedido.getState() instanceof PedidoStateCancelado);	
		
	}
	
	@Test
	public void CambioEstadoEntregadoToOthers() {
		assertTrue(pedido.getState() instanceof PedidoStateEmitido);
		pedido.changeState(StateEntregado);
		assertTrue(pedido.getState() instanceof PedidoStateEntregado);	
		
		//TRANSICION PERMITIDA ENTREGADO => EMITIDO
		pedido.changeState(StateEmitido);
		assertTrue(pedido.getState() instanceof PedidoStateEntregado);
		
		//TRANSICION NO PERMITIDA ENTREGADO => CANCELADO
		pedido.changeState(StateCancelado);
		assertTrue(pedido.getState() instanceof PedidoStateEntregado);
		
		//TRANSICION NO PERMITIDA ENTREGADO => PAGADO
		pedido.changeState(StatePagado);
		assertTrue(pedido.getState() instanceof PedidoStatePagado);		
	}
	
	@Test
	public void CambioEstadoCanceladoToOthers() {
		assertTrue(pedido.getState() instanceof PedidoStateEmitido);
		pedido.changeState(StateCancelado);
		assertTrue(pedido.getState() instanceof PedidoStateCancelado);	
		
		//TRANSICION NO PERMITIDA CANCELADO => EMITIDO
		pedido.changeState(StateEmitido);
		assertTrue(pedido.getState() instanceof PedidoStateCancelado);
		
		//TRANSICION NO PERMITIDA CANCELADO => ENTREGADO
		pedido.changeState(StateEntregado);
		assertTrue(pedido.getState() instanceof PedidoStateCancelado);
		
		//TRANSICION NO PERMITIDA CANCELADO => PAGADO
		pedido.changeState(StatePagado);
		assertTrue(pedido.getState() instanceof PedidoStateCancelado);	
	}
	
	@Test
	public void CambioEstadoPagadoToOthers() {
		assertTrue(pedido.getState() instanceof PedidoStateEmitido);
		pedido.changeState(StateEntregado);
		assertTrue(pedido.getState() instanceof PedidoStateEntregado);
		pedido.changeState(StatePagado);
		assertTrue(pedido.getState() instanceof PedidoStatePagado);
		
		//TRANSICION NO PERMITIDA PAGADO => EMITIDO
		pedido.changeState(StateEmitido);
		assertTrue(pedido.getState() instanceof PedidoStatePagado);
		
		//TRANSICION NO PERMITIDA PAGADO => ENTREGADO
		pedido.changeState(StateEntregado);
		assertTrue(pedido.getState() instanceof PedidoStatePagado);
		
		//TRANSICION NO PERMITIDA PAGADO => CANCELADO
		pedido.changeState(StateCancelado);
		assertTrue(pedido.getState() instanceof PedidoStatePagado);	
	}
	*/


}
