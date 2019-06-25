package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "destinatario", schema = "cer-db", catalog = "")
public class DestinatarioEntity {
    private int idDestinatario;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String cargo;

    @Id
    @Column(name = "id_destinatario")
    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    @Basic
    @Column(name = "nombres")
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellido_paterno")
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @Basic
    @Column(name = "apellido_materno")
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Basic
    @Column(name = "cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DestinatarioEntity that = (DestinatarioEntity) o;
        return idDestinatario == that.idDestinatario &&
                Objects.equals(nombres, that.nombres) &&
                Objects.equals(apellidoPaterno, that.apellidoPaterno) &&
                Objects.equals(apellidoMaterno, that.apellidoMaterno) &&
                Objects.equals(cargo, that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDestinatario, nombres, apellidoPaterno, apellidoMaterno, cargo);
    }
}
