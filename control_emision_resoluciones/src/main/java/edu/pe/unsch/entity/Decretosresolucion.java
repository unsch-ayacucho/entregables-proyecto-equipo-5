package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Decretosresolucion generated by hbm2java
 */
@Entity
@Table(name = "decretosresolucion", catalog = "cer_db")
public class Decretosresolucion implements java.io.Serializable {

	private DecretosresolucionId id;
	private Decreto decreto;
	private Resolucion resolucion;

	public Decretosresolucion() {
	}

	public Decretosresolucion(DecretosresolucionId id) {
		this.id = id;
	}

	public Decretosresolucion(DecretosresolucionId id, Decreto decreto, Resolucion resolucion) {
		this.id = id;
		this.decreto = decreto;
		this.resolucion = resolucion;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idResolucion", column = @Column(name = "id_resolucion", nullable = false)),
			@AttributeOverride(name = "idDecreto", column = @Column(name = "id_decreto", nullable = false)) })
	public DecretosresolucionId getId() {
		return this.id;
	}

	public void setId(DecretosresolucionId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "decretosresolucion")
	public Decreto getDecreto() {
		return this.decreto;
	}

	public void setDecreto(Decreto decreto) {
		this.decreto = decreto;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "documento")
	public Resolucion getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(Resolucion resolucion) {
		this.resolucion = resolucion;
	}

}
