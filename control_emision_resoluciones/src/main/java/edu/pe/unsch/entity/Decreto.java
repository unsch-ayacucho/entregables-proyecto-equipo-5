package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Decreto generated by hbm2java
 */
@Entity
@Table(name = "decreto", catalog = "cer_db")
public class Decreto implements java.io.Serializable {

	private Integer idDecreto;
	private Decretosresolucion decretosresolucion;
	private int nroArticulo;
	private String decretoTexto;

	public Decreto() {
	}

	public Decreto(Decretosresolucion decretosresolucion, int nroArticulo, String decretoTexto) {
		this.decretosresolucion = decretosresolucion;
		this.nroArticulo = nroArticulo;
		this.decretoTexto = decretoTexto;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "decretosresolucion"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "id_decreto", unique = true, nullable = false)
	public Integer getIdDecreto() {
		return this.idDecreto;
	}

	public void setIdDecreto(Integer idDecreto) {
		this.idDecreto = idDecreto;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Decretosresolucion getDecretosresolucion() {
		return this.decretosresolucion;
	}

	public void setDecretosresolucion(Decretosresolucion decretosresolucion) {
		this.decretosresolucion = decretosresolucion;
	}

	@Column(name = "nro_articulo", nullable = false)
	public int getNroArticulo() {
		return this.nroArticulo;
	}

	public void setNroArticulo(int nroArticulo) {
		this.nroArticulo = nroArticulo;
	}

	@Column(name = "decreto_texto", nullable = false, length = 65535)
	public String getDecretoTexto() {
		return this.decretoTexto;
	}

	public void setDecretoTexto(String decretoTexto) {
		this.decretoTexto = decretoTexto;
	}

}
