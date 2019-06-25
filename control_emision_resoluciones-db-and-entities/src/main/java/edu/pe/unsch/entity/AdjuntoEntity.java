package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "adjunto", schema = "cer-db", catalog = "")
@IdClass(AdjuntoEntityPK.class)
public class AdjuntoEntity {
    private int idDocumento;
    private int idDocumentoAdjunto;

    @Id
    @Column(name = "id_documento")
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Id
    @Column(name = "id_documento_adjunto")
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
        AdjuntoEntity that = (AdjuntoEntity) o;
        return idDocumento == that.idDocumento &&
                idDocumentoAdjunto == that.idDocumentoAdjunto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocumento, idDocumentoAdjunto);
    }
}
