package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "solicitud", schema = "cer-db", catalog = "")
public class SolicitudEntity {
    private int idSolicitud;
    private Integer idDocumento;
    private String sumilla;
    private String lugar;

    @Id
    @Column(name = "id_solicitud")
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
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
    @Column(name = "sumilla")
    public String getSumilla() {
        return sumilla;
    }

    public void setSumilla(String sumilla) {
        this.sumilla = sumilla;
    }

    @Basic
    @Column(name = "lugar")
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolicitudEntity that = (SolicitudEntity) o;
        return idSolicitud == that.idSolicitud &&
                Objects.equals(idDocumento, that.idDocumento) &&
                Objects.equals(sumilla, that.sumilla) &&
                Objects.equals(lugar, that.lugar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSolicitud, idDocumento, sumilla, lugar);
    }
}
