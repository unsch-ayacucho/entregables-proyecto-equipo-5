package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "datoadicional", schema = "cer-db", catalog = "")
public class DatoadicionalEntity {
    private int idDatoAdicional;
    private String tipoDato;
    private String datoAdicional;
    private String descripcionOpcional;

    @Id
    @Column(name = "id_dato_adicional")
    public int getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(int idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
    }

    @Basic
    @Column(name = "tipo_dato")
    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    @Basic
    @Column(name = "dato_adicional")
    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    @Basic
    @Column(name = "descripcion_opcional")
    public String getDescripcionOpcional() {
        return descripcionOpcional;
    }

    public void setDescripcionOpcional(String descripcionOpcional) {
        this.descripcionOpcional = descripcionOpcional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatoadicionalEntity that = (DatoadicionalEntity) o;
        return idDatoAdicional == that.idDatoAdicional &&
                Objects.equals(tipoDato, that.tipoDato) &&
                Objects.equals(datoAdicional, that.datoAdicional) &&
                Objects.equals(descripcionOpcional, that.descripcionOpcional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDatoAdicional, tipoDato, datoAdicional, descripcionOpcional);
    }
}
