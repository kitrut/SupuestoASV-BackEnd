package asv.models;

public enum PedidoStatus implements IPedidoOps {
	EMITIDO{
		@Override
		public PedidoStatus changeState(PedidoStatus p) {
			if(p.equals(PedidoStatus.CANCELADO))
				return PedidoStatus.CANCELADO;
			if(p.equals(PedidoStatus.ENTREGADO))
				return PedidoStatus.ENTREGADO;
			return this;
		}
	},
	ENTREGADO{
		@Override
		public PedidoStatus changeState(PedidoStatus p) {
			if(p.equals(PedidoStatus.PAGADO))
				return PedidoStatus.PAGADO;
			return this;
		}
	},
	PAGADO{
		@Override
		public PedidoStatus changeState(PedidoStatus p) {
			return this;
		}
	},
	CANCELADO{
		@Override
		public PedidoStatus changeState(PedidoStatus p) {
			return this;
		}
	},

	
}
