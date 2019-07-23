package edu.pe.unsch.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "origen")
@Access(AccessType.FIELD)
public class Emitido implements java.io.Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para q el id sea Autoincrementable
	private Long idemitido;
	
	@Basic(optional = false)	
	@Column(name = "fechaemitida")
	private String fechaemitida; // este es como debe venir desde Angular	
	
	@Column(name = "idresolution")
	private Resolution idresolution; // este es como debe venir desde Angular

		
	public Emitido() {
		
	}
	

	public Emitido(Long idemitido, String fechaemitida, Resolution idresolution) {
		super();
		this.idemitido = idemitido;
		this.fechaemitida = fechaemitida;
		this.idresolution = idresolution;
	}

	public Long getIdemitido() {
		return idemitido;
	}

	public void setIdemitido(Long idemitido) {
		this.idemitido = idemitido;
	}

	public String getFechaemitida() {
		return fechaemitida;
	}

	public void setFechaemitida(String fechaemitida) {
		this.fechaemitida = fechaemitida;
	}

	public Resolution getIdresolution() {
		return idresolution;
	}

	public void setIdresolution(Resolution idresolution) {
		this.idresolution = idresolution;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
    public String toString() {
        return "Emitido{" +
                "idemitido=" + idemitido +
                ", fechaemitida='" + fechaemitida + '\'' +
                ", idresolution='" + idresolution + '\'' +                
                '}';
    }

	
	
}
