package edu.pe.unsch.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DocumentoadjuntodatoadicionalEntityPK implements Serializable {
    private int idDatoAdicional;
    private int idDocumentoAdjunto;

    @Column(name = "id_dato_adicional")
    @Id
    public int getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(int idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
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
        DocumentoadjuntodatoadicionalEntityPK that = (DocumentoadjuntodatoadicionalEntityPK) o;
        return idDatoAdicional == that.idDatoAdicional &&
                idDocumentoAdjunto == that.idDocumentoAdjunto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDatoAdicional, idDocumentoAdjunto);
    }
}
