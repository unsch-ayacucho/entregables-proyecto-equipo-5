package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "consideracion", schema = "cer-db", catalog = "")
public class ConsideracionEntity {
    private int idConsideracion;
    private String consideracionText;

    @Id
    @Column(name = "id_consideracion")
    public int getIdConsideracion() {
        return idConsideracion;
    }

    public void setIdConsideracion(int idConsideracion) {
        this.idConsideracion = idConsideracion;
    }

    @Basic
    @Column(name = "consideracion_text")
    public String getConsideracionText() {
        return consideracionText;
    }

    public void setConsideracionText(String consideracionText) {
        this.consideracionText = consideracionText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsideracionEntity that = (ConsideracionEntity) o;
        return idConsideracion == that.idConsideracion &&
                Objects.equals(consideracionText, that.consideracionText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConsideracion, consideracionText);
    }
}
