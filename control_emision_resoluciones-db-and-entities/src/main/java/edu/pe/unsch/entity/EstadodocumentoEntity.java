package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "estadodocumento", schema = "cer-db", catalog = "")
public class EstadodocumentoEntity {
    private int idEstadoDocumento;
    private String estadoDocumento;

    @Id
    @Column(name = "id_estado_documento")
    public int getIdEstadoDocumento() {
        return idEstadoDocumento;
    }

    public void setIdEstadoDocumento(int idEstadoDocumento) {
        this.idEstadoDocumento = idEstadoDocumento;
    }

    @Basic
    @Column(name = "estado_documento")
    public String getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(String estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadodocumentoEntity that = (EstadodocumentoEntity) o;
        return idEstadoDocumento == that.idEstadoDocumento &&
                Objects.equals(estadoDocumento, that.estadoDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstadoDocumento, estadoDocumento);
    }
}
