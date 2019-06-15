package asv.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;
	
	@Column(name="nombreUsuario",length=50)
	private String nombreUsuario;
	
	@Column(name="date")
	private LocalDateTime fechaServicio= LocalDateTime.now();
	
	@Column(name="fechaentrega")
	private LocalDateTime fechaEntrega= LocalDateTime.now();
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="estado")
	private PedidoStatus estado = PedidoStatus.EMITIDO;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonManagedReference
    private Set<LineaPedido> lineas;
	
	@Column(name="total")
	private Double total;
	

	
	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Set<LineaPedido> getLineas() {
		return lineas;
	}

	public void setLineas(Set<LineaPedido> lineas) {
		this.lineas = lineas;
	}

	public PedidoStatus getEstado() {
		return estado;
	}

	public void setEstado(PedidoStatus estado) {
		this.estado = estado;
	}

	public void changeState(PedidoStatus next) {
		if(this.estado.equals(next))
			return;
		this.estado=next;
	}
	
	public PedidoStatus getState() {
		return this.estado;
	}
	
	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public LocalDateTime getFechaServicio() {
		return fechaServicio;
	}

	public void setFechaServicio(LocalDateTime fechaServicio) {
		this.fechaServicio = fechaServicio;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nombreUsuario=" + nombreUsuario + ", fechaServicio=" + fechaServicio
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaServicio == null) ? 0 : fechaServicio.hashCode());
		result = prime * result + ((idPedido == null) ? 0 : idPedido.hashCode());
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (fechaServicio == null) {
			if (other.fechaServicio != null)
				return false;
		} else if (!fechaServicio.equals(other.fechaServicio))
			return false;
		if (idPedido == null) {
			if (other.idPedido != null)
				return false;
		} else if (!idPedido.equals(other.idPedido))
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		return true;
	}
}
