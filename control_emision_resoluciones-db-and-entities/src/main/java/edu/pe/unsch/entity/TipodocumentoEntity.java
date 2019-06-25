package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipodocumento", schema = "cer-db", catalog = "")
public class TipodocumentoEntity {
    private int idTipoDocumento;
    private String tipoDocumento;

    @Id
    @Column(name = "id_tipo_documento")
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Basic
    @Column(name = "tipo_documento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipodocumentoEntity that = (TipodocumentoEntity) o;
        return idTipoDocumento == that.idTipoDocumento &&
                Objects.equals(tipoDocumento, that.tipoDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoDocumento, tipoDocumento);
    }
}
