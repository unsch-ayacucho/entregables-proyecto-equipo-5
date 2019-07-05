package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Solicitud generated by hbm2java
 */
@Entity
@Table(name = "solicitud", catalog = "cer_db", uniqueConstraints = @UniqueConstraint(columnNames = "id_documento"))
public class Solicitud implements java.io.Serializable {

	private Integer idSolicitud;
	private Integer idDocumento;
	private String sumilla;
	private String lugar;
	private Documento documento;

	public Solicitud() {
	}

	public Solicitud(String sumilla, String lugar) {
		this.sumilla = sumilla;
		this.lugar = lugar;
	}

	public Solicitud(Integer idDocumento, String sumilla, String lugar, Documento documento) {
		this.idDocumento = idDocumento;
		this.sumilla = sumilla;
		this.lugar = lugar;
		this.documento = documento;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_solicitud", unique = true, nullable = false)
	public Integer getIdSolicitud() {
		return this.idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	@Column(name = "id_documento", unique = true)
	public Integer getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Column(name = "sumilla", nullable = false)
	public String getSumilla() {
		return this.sumilla;
	}

	public void setSumilla(String sumilla) {
		this.sumilla = sumilla;
	}

	@Column(name = "lugar", nullable = false)
	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Documento getDocumento() {
		return this.documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

}
