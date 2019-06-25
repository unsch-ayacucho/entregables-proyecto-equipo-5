package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "resolucion", schema = "cer-db", catalog = "")
public class ResolucionEntity {
    private int idResolucion;
    private int idTipoResolucion;
    private String codigoResolucion;
    private String codFacultad;

    @Id
    @Column(name = "id_resolucion")
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    @Basic
    @Column(name = "id_tipo_resolucion")
    public int getIdTipoResolucion() {
        return idTipoResolucion;
    }

    public void setIdTipoResolucion(int idTipoResolucion) {
        this.idTipoResolucion = idTipoResolucion;
    }

    @Basic
    @Column(name = "codigo_resolucion")
    public String getCodigoResolucion() {
        return codigoResolucion;
    }

    public void setCodigoResolucion(String codigoResolucion) {
        this.codigoResolucion = codigoResolucion;
    }

    @Basic
    @Column(name = "cod_facultad")
    public String getCodFacultad() {
        return codFacultad;
    }

    public void setCodFacultad(String codFacultad) {
        this.codFacultad = codFacultad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResolucionEntity that = (ResolucionEntity) o;
        return idResolucion == that.idResolucion &&
                idTipoResolucion == that.idTipoResolucion &&
                Objects.equals(codigoResolucion, that.codigoResolucion) &&
                Objects.equals(codFacultad, that.codFacultad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResolucion, idTipoResolucion, codigoResolucion, codFacultad);
    }
}
