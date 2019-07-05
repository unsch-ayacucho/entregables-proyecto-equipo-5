package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConsideracionresolucionId generated by hbm2java
 */
@Embeddable
public class ConsideracionresolucionId implements java.io.Serializable {

	private int idResolucion;
	private int idConsideracion;

	public ConsideracionresolucionId() {
	}

	public ConsideracionresolucionId(int idResolucion, int idConsideracion) {
		this.idResolucion = idResolucion;
		this.idConsideracion = idConsideracion;
	}

	@Column(name = "id_resolucion", nullable = false)
	public int getIdResolucion() {
		return this.idResolucion;
	}

	public void setIdResolucion(int idResolucion) {
		this.idResolucion = idResolucion;
	}

	@Column(name = "id_consideracion", nullable = false)
	public int getIdConsideracion() {
		return this.idConsideracion;
	}

	public void setIdConsideracion(int idConsideracion) {
		this.idConsideracion = idConsideracion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConsideracionresolucionId))
			return false;
		ConsideracionresolucionId castOther = (ConsideracionresolucionId) other;

		return (this.getIdResolucion() == castOther.getIdResolucion())
				&& (this.getIdConsideracion() == castOther.getIdConsideracion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdResolucion();
		result = 37 * result + this.getIdConsideracion();
		return result;
	}

}
