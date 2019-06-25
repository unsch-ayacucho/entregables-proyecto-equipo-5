package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tiporesolucion", schema = "cer-db", catalog = "")
public class TiporesolucionEntity {
    private int idTipoResolucion;
    private String tipoResolucion;

    @Id
    @Column(name = "id_tipo_resolucion")
    public int getIdTipoResolucion() {
        return idTipoResolucion;
    }

    public void setIdTipoResolucion(int idTipoResolucion) {
        this.idTipoResolucion = idTipoResolucion;
    }

    @Basic
    @Column(name = "tipo_resolucion")
    public String getTipoResolucion() {
        return tipoResolucion;
    }

    public void setTipoResolucion(String tipoResolucion) {
        this.tipoResolucion = tipoResolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiporesolucionEntity that = (TiporesolucionEntity) o;
        return idTipoResolucion == that.idTipoResolucion &&
                Objects.equals(tipoResolucion, that.tipoResolucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoResolucion, tipoResolucion);
    }
}
