package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

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

/**
 * Estadodocumento generated by hbm2java
 */
@Entity
@Table(name = "estadodocumento", catalog = "cer_db")
public class Estadodocumento implements java.io.Serializable {

	private Integer idEstadoDocumento;
	private String estadoDocumento;
	private Set<Documento> documentos = new HashSet<Documento>(0);

	public Estadodocumento() {
	}

	public Estadodocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}

	public Estadodocumento(String estadoDocumento, Set<Documento> documentos) {
		this.estadoDocumento = estadoDocumento;
		this.documentos = documentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_estado_documento", unique = true, nullable = false)
	public Integer getIdEstadoDocumento() {
		return this.idEstadoDocumento;
	}

	public void setIdEstadoDocumento(Integer idEstadoDocumento) {
		this.idEstadoDocumento = idEstadoDocumento;
	}

	@Column(name = "estado_documento", nullable = false, length = 20)
	public String getEstadoDocumento() {
		return this.estadoDocumento;
	}

	public void setEstadoDocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadodocumento")
	public Set<Documento> getDocumentos() {
		return this.documentos;
	}

	public void setDocumentos(Set<Documento> documentos) {
		this.documentos = documentos;
	}

}
