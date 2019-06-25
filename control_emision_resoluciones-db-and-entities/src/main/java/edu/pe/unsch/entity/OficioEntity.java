package edu.pe.unsch.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "oficio", schema = "cer-db", catalog = "")
public class OficioEntity {
    private int idOficio;
    private Integer idDocumento;
    private String membrete;
    private String asunto;
    private String despedida;

    @Id
    @Column(name = "id_oficio")
    public int getIdOficio() {
        return idOficio;
    }

    public void setIdOficio(int idOficio) {
        this.idOficio = idOficio;
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
    @Column(name = "membrete")
    public String getMembrete() {
        return membrete;
    }

    public void setMembrete(String membrete) {
        this.membrete = membrete;
    }

    @Basic
    @Column(name = "asunto")
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Basic
    @Column(name = "despedida")
    public String getDespedida() {
        return despedida;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OficioEntity that = (OficioEntity) o;
        return idOficio == that.idOficio &&
                Objects.equals(idDocumento, that.idDocumento) &&
                Objects.equals(membrete, that.membrete) &&
                Objects.equals(asunto, that.asunto) &&
                Objects.equals(despedida, that.despedida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOficio, idDocumento, membrete, asunto, despedida);
    }
}
