package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Documentoadjunto generated by hbm2java
 */
@Entity
@Table(name = "documentoadjunto", catalog = "cer_db", uniqueConstraints = @UniqueConstraint(columnNames = "codigo_documento_adjunto"))
public class Documentoadjunto implements java.io.Serializable {

	private Integer idDocumentoAdjunto;
	private Documentoadjuntodatoadicional documentoadjuntodatoadicional;
	private String codigoDocumentoAdjunto;
	private String detalleContenido;
	private Date fechaEmision;
	private byte[] archivoAdjunto;
	private Integer idDatoAdicional;

	public Documentoadjunto() {
	}

	public Documentoadjunto(Documentoadjuntodatoadicional documentoadjuntodatoadicional, String detalleContenido) {
		this.documentoadjuntodatoadicional = documentoadjuntodatoadicional;
		this.detalleContenido = detalleContenido;
	}

	public Documentoadjunto(Documentoadjuntodatoadicional documentoadjuntodatoadicional, String codigoDocumentoAdjunto,
			String detalleContenido, Date fechaEmision, byte[] archivoAdjunto, Integer idDatoAdicional) {
		this.documentoadjuntodatoadicional = documentoadjuntodatoadicional;
		this.codigoDocumentoAdjunto = codigoDocumentoAdjunto;
		this.detalleContenido = detalleContenido;
		this.fechaEmision = fechaEmision;
		this.archivoAdjunto = archivoAdjunto;
		this.idDatoAdicional = idDatoAdicional;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "documentoadjuntodatoadicional"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "id_documento_adjunto", unique = true, nullable = false)
	public Integer getIdDocumentoAdjunto() {
		return this.idDocumentoAdjunto;
	}

	public void setIdDocumentoAdjunto(Integer idDocumentoAdjunto) {
		this.idDocumentoAdjunto = idDocumentoAdjunto;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Documentoadjuntodatoadicional getDocumentoadjuntodatoadicional() {
		return this.documentoadjuntodatoadicional;
	}

	public void setDocumentoadjuntodatoadicional(Documentoadjuntodatoadicional documentoadjuntodatoadicional) {
		this.documentoadjuntodatoadicional = documentoadjuntodatoadicional;
	}

	@Column(name = "codigo_documento_adjunto", unique = true, length = 20)
	public String getCodigoDocumentoAdjunto() {
		return this.codigoDocumentoAdjunto;
	}

	public void setCodigoDocumentoAdjunto(String codigoDocumentoAdjunto) {
		this.codigoDocumentoAdjunto = codigoDocumentoAdjunto;
	}

	@Column(name = "detalle_contenido", nullable = false, length = 65535)
	public String getDetalleContenido() {
		return this.detalleContenido;
	}

	public void setDetalleContenido(String detalleContenido) {
		this.detalleContenido = detalleContenido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_emision", length = 10)
	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	@Column(name = "archivo_adjunto")
	public byte[] getArchivoAdjunto() {
		return this.archivoAdjunto;
	}

	public void setArchivoAdjunto(byte[] archivoAdjunto) {
		this.archivoAdjunto = archivoAdjunto;
	}

	@Column(name = "id_dato_adicional")
	public Integer getIdDatoAdicional() {
		return this.idDatoAdicional;
	}

	public void setIdDatoAdicional(Integer idDatoAdicional) {
		this.idDatoAdicional = idDatoAdicional;
	}

}