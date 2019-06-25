package edu.pe.unsch.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DecretosresolucionEntityPK implements Serializable {
    private int idResolucion;
    private int idDecreto;

    @Column(name = "id_resolucion")
    @Id
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    @Column(name = "id_decreto")
    @Id
    public int getIdDecreto() {
        return idDecreto;
    }

    public void setIdDecreto(int idDecreto) {
        this.idDecreto = idDecreto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecretosresolucionEntityPK that = (DecretosresolucionEntityPK) o;
        return idResolucion == that.idResolucion &&
                idDecreto == that.idDecreto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResolucion, idDecreto);
    }
}
