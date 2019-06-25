package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "documento", schema = "cer-db", catalog = "")
public class DocumentoEntity {
    private int idDocumento;
    private int idTipoDocumento;
    private int idSolicitante;
    private int idDestinatario;
    private int idResolucion;
    private String codigoSeguimiento;

    @Id
    @Column(name = "id_documento")
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Basic
    @Column(name = "id_tipo_documento")
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Basic
    @Column(name = "id_solicitante")
    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Basic
    @Column(name = "id_destinatario")
    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    @Basic
    @Column(name = "id_resolucion")
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    @Basic
    @Column(name = "codigo_seguimiento")
    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentoEntity that = (DocumentoEntity) o;
        return idDocumento == that.idDocumento &&
                idTipoDocumento == that.idTipoDocumento &&
                idSolicitante == that.idSolicitante &&
                idDestinatario == that.idDestinatario &&
                idResolucion == that.idResolucion &&
                Objects.equals(codigoSeguimiento, that.codigoSeguimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocumento, idTipoDocumento, idSolicitante, idDestinatario, idResolucion, codigoSeguimiento);
    }
}
