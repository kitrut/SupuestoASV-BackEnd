package asv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlato;
	
	@Column(name="nombre",length=50)
	private String nombre;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="tipo")
	private PlatoType tipo;
	
	
	public PlatoType getTipo() {
		return tipo;
	}
	public void setTipo(PlatoType tipo) {
		this.tipo = tipo;
	}
	public Long getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(Long idPlato) {
		this.idPlato = idPlato;
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
	
	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", precio=" + precio + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
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
		Plato other = (Plato) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		return true;
	}
}
