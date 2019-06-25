package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "memorando", schema = "cer-db", catalog = "")
public class MemorandoEntity {
    private int idMemorando;
    private Integer idDocumento;
    private String asuntoMemorando;

    @Id
    @Column(name = "id_memorando")
    public int getIdMemorando() {
        return idMemorando;
    }

    public void setIdMemorando(int idMemorando) {
        this.idMemorando = idMemorando;
    }

    @Basic
    @Column(name = "id_documento")
    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Basic
    @Column(name = "asunto_memorando")
    public String getAsuntoMemorando() {
        return asuntoMemorando;
    }

    public void setAsuntoMemorando(String asuntoMemorando) {
        this.asuntoMemorando = asuntoMemorando;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemorandoEntity that = (MemorandoEntity) o;
        return idMemorando == that.idMemorando &&
                Objects.equals(idDocumento, that.idDocumento) &&
                Objects.equals(asuntoMemorando, that.asuntoMemorando);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMemorando, idDocumento, asuntoMemorando);
    }
}
