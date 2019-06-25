package edu.pe.unsch.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ConsideracionresolucionEntityPK implements Serializable {
    private int idResolucion;
    private int idConsideracion;

    @Column(name = "id_resolucion")
    @Id
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    @Column(name = "id_consideracion")
    @Id
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
        ConsideracionresolucionEntityPK that = (ConsideracionresolucionEntityPK) o;
        return idResolucion == that.idResolucion &&
                idConsideracion == that.idConsideracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResolucion, idConsideracion);
    }
}
