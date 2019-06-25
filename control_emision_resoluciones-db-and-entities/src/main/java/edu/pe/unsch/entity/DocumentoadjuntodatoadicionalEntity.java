package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "documentoadjuntodatoadicional", schema = "cer-db", catalog = "")
@IdClass(DocumentoadjuntodatoadicionalEntityPK.class)
public class DocumentoadjuntodatoadicionalEntity {
    private int idDatoAdicional;
    private int idDocumentoAdjunto;

    @Id
    @Column(name = "id_dato_adicional")
    public int getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(int idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
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
        DocumentoadjuntodatoadicionalEntity that = (DocumentoadjuntodatoadicionalEntity) o;
        return idDatoAdicional == that.idDatoAdicional &&
                idDocumentoAdjunto == that.idDocumentoAdjunto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDatoAdicional, idDocumentoAdjunto);
    }
}
