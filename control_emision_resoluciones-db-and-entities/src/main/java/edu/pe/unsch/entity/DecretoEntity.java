package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "decreto", schema = "cer-db", catalog = "")
public class DecretoEntity {
    private int idDecreto;
    private int nroArticulo;
    private String decretoTexto;

    @Id
    @Column(name = "id_decreto")
    public int getIdDecreto() {
        return idDecreto;
    }

    public void setIdDecreto(int idDecreto) {
        this.idDecreto = idDecreto;
    }

    @Basic
    @Column(name = "nro_articulo")
    public int getNroArticulo() {
        return nroArticulo;
    }

    public void setNroArticulo(int nroArticulo) {
        this.nroArticulo = nroArticulo;
    }

    @Basic
    @Column(name = "decreto_texto")
    public String getDecretoTexto() {
        return decretoTexto;
    }

    public void setDecretoTexto(String decretoTexto) {
        this.decretoTexto = decretoTexto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecretoEntity that = (DecretoEntity) o;
        return idDecreto == that.idDecreto &&
                nroArticulo == that.nroArticulo &&
                Objects.equals(decretoTexto, that.decretoTexto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDecreto, nroArticulo, decretoTexto);
    }
}
