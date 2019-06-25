package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "decretosresolucion", schema = "cer-db", catalog = "")
@IdClass(DecretosresolucionEntityPK.class)
public class DecretosresolucionEntity {
    private int idResolucion;
    private int idDecreto;

    @Id
    @Column(name = "id_resolucion")
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    @Id
    @Column(name = "id_decreto")
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
        DecretosresolucionEntity that = (DecretosresolucionEntity) o;
        return idResolucion == that.idResolucion &&
                idDecreto == that.idDecreto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResolucion, idDecreto);
    }
}
