package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "consideracionresolucion", schema = "cer-db", catalog = "")
@IdClass(ConsideracionresolucionEntityPK.class)
public class ConsideracionresolucionEntity {
    private int idResolucion;
    private int idConsideracion;

    @Id
    @Column(name = "id_resolucion")
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    @Id
    @Column(name = "id_consideracion")
    public int getIdConsideracion() {
        return idConsideracion;
    }

    public void setIdConsideracion(int idConsideracion) {
        this.idConsideracion = idConsideracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsideracionresolucionEntity that = (ConsideracionresolucionEntity) o;
        return idResolucion == that.idResolucion &&
                idConsideracion == that.idConsideracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResolucion, idConsideracion);
    }
}
