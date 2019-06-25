package edu.pe.unsch.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "facultad", schema = "cer-db", catalog = "")
public class FacultadEntity {
    private String nombreFacultad;

    @Basic
    @Column(name = "nombre_facultad")
    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultadEntity that = (FacultadEntity) o;
        return Objects.equals(nombreFacultad, that.nombreFacultad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreFacultad);
    }
}
