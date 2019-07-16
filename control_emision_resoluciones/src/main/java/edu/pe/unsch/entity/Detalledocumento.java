package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Detalledocumento generated by hbm2java
 */
@Entity
@Table(name = "detalledocumento", catalog = "cer_db")
public class Detalledocumento implements java.io.Serializable {

	private Integer idDetalleDocumento;
	private Date fechaPresentacion;
	private String cuerpo;
	private Set<Documento> documentos = new HashSet<Documento>(0);

	public Detalledocumento() {
	}

	public Detalledocumento(Date fechaPresentacion, String cuerpo, Set<Documento> documentos) {
		this.fechaPresentacion = fechaPresentacion;
		this.cuerpo = cuerpo;
		this.documentos = documentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_detalle_documento", unique = true, nullable = false)
	public Integer getIdDetalleDocumento() {
		return this.idDetalleDocumento;
	}

	public void setIdDetalleDocumento(Integer idDetalleDocumento) {
		this.idDetalleDocumento = idDetalleDocumento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_presentacion", length = 19)
	public Date getFechaPresentacion() {
		return this.fechaPresentacion;
	}

	public void setFechaPresentacion(Date fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}

	@Column(name = "cuerpo", length = 65535)
	public String getCuerpo() {
		return this.cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "detalledocumento")
	public Set<Documento> getDocumentos() {
		return this.documentos;
	}

	public void setDocumentos(Set<Documento> documentos) {
		this.documentos = documentos;
	}

}