package edu.pe.unsch.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "detalledocumento", schema = "cer-db", catalog = "")
public class DetalledocumentoEntity {
    private int idDetalleDocumento;
    private Timestamp fechaPresentacion;
    private String cuerpo;

    @Id
    @Column(name = "id_detalle_documento")
    public int getIdDetalleDocumento() {
        return idDetalleDocumento;
    }

    public void setIdDetalleDocumento(int idDetalleDocumento) {
        this.idDetalleDocumento = idDetalleDocumento;
    }

    @Basic
    @Column(name = "fecha_presentacion")
    public Timestamp getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(Timestamp fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    @Basic
    @Column(name = "cuerpo")
    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalledocumentoEntity that = (DetalledocumentoEntity) o;
        return idDetalleDocumento == that.idDetalleDocumento &&
                Objects.equals(fechaPresentacion, that.fechaPresentacion) &&
                Objects.equals(cuerpo, that.cuerpo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetalleDocumento, fechaPresentacion, cuerpo);
    }
}
