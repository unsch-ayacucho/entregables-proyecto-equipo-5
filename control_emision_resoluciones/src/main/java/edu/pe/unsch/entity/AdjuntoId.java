package edu.pe.unsch.entity;
// Generated 04-jul-2019 20:41:25 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AdjuntoId generated by hbm2java
 */
@Embeddable
public class AdjuntoId implements java.io.Serializable {

	private int idDocumento;
	private int idDocumentoAdjunto;

	public AdjuntoId() {
	}

	public AdjuntoId(int idDocumento, int idDocumentoAdjunto) {
		this.idDocumento = idDocumento;
		this.idDocumentoAdjunto = idDocumentoAdjunto;
	}

	@Column(name = "id_documento", nullable = false)
	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Column(name = "id_documento_adjunto", nullable = false)
	public int getIdDocumentoAdjunto() {
		return this.idDocumentoAdjunto;
	}

	public void setIdDocumentoAdjunto(int idDocumentoAdjunto) {
		this.idDocumentoAdjunto = idDocumentoAdjunto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AdjuntoId))
			return false;
		AdjuntoId castOther = (AdjuntoId) other;

		return (this.getIdDocumento() == castOther.getIdDocumento())
				&& (this.getIdDocumentoAdjunto() == castOther.getIdDocumentoAdjunto());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDocumento();
		result = 37 * result + this.getIdDocumentoAdjunto();
		return result;
	}

}