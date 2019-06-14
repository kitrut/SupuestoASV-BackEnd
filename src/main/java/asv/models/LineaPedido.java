package asv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class LineaPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLineaPedido;
	
	@Column(name="nombre",length=50)
	private String nombre;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="cantidad")
	private Double cantidad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	@JsonBackReference
	private Pedido pedido;

	public Long getIdLineaPedido() {
		return idLineaPedido;
	}

	public void setIdLineaPedido(Long idLineaPedido) {
		this.idLineaPedido = idLineaPedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
