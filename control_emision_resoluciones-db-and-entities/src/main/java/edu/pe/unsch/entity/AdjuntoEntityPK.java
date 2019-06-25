package edu.pe.unsch.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AdjuntoEntityPK implements Serializable {
    private int idDocumento;
    private int idDocumentoAdjunto;

    @Column(name = "id_documento")
    @Id
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Column(name = "id_documento_adjunto")
    @Id
    public int getIdDocumentoAdjunto() {
        return idDocumentoAdjunto;
    }

    public void setIdDocumentoAdjunto(int idDocumentoAdjunto) {
        this.idDocumentoAdjunto = idDocumentoAdjunto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdjuntoEntityPK that = (AdjuntoEntityPK) o;
        return idDocumento == that.idDocumento &&
                idDocumentoAdjunto == that.idDocumentoAdjunto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocumento, idDocumentoAdjunto);
    }
}
