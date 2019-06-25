package edu.pe.unsch.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "documentoadjunto", schema = "cer-db", catalog = "")
public class DocumentoadjuntoEntity {
    private int idDocumentoAdjunto;
    private String codigoDocumentoAdjunto;
    private String detalleContenido;
    private Date fechaEmision;
    private byte[] archivoAdjunto;
    private Integer idDatoAdicional;

    @Id
    @Column(name = "id_documento_adjunto")
    public int getIdDocumentoAdjunto() {
        return idDocumentoAdjunto;
    }

    public void setIdDocumentoAdjunto(int idDocumentoAdjunto) {
        this.idDocumentoAdjunto = idDocumentoAdjunto;
    }

    @Basic
    @Column(name = "codigo_documento_adjunto")
    public String getCodigoDocumentoAdjunto() {
        return codigoDocumentoAdjunto;
    }

    public void setCodigoDocumentoAdjunto(String codigoDocumentoAdjunto) {
        this.codigoDocumentoAdjunto = codigoDocumentoAdjunto;
    }

    @Basic
    @Column(name = "detalle_contenido")
    public String getDetalleContenido() {
        return detalleContenido;
    }

    public void setDetalleContenido(String detalleContenido) {
        this.detalleContenido = detalleContenido;
    }

    @Basic
    @Column(name = "fecha_emision")
    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @Basic
    @Column(name = "archivo_adjunto")
    public byte[] getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public void setArchivoAdjunto(byte[] archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    @Basic
    @Column(name = "id_dato_adicional")
    public Integer getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(Integer idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentoadjuntoEntity that = (DocumentoadjuntoEntity) o;
        return idDocumentoAdjunto == that.idDocumentoAdjunto &&
                Objects.equals(codigoDocumentoAdjunto, that.codigoDocumentoAdjunto) &&
                Objects.equals(detalleContenido, that.detalleContenido) &&
                Objects.equals(fechaEmision, that.fechaEmision) &&
                Arrays.equals(archivoAdjunto, that.archivoAdjunto) &&
                Objects.equals(idDatoAdicional, that.idDatoAdicional);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idDocumentoAdjunto, codigoDocumentoAdjunto, detalleContenido, fechaEmision, idDatoAdicional);
        result = 31 * result + Arrays.hashCode(archivoAdjunto);
        return result;
    }
}
