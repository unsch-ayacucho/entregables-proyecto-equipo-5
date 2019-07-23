package edu.pe.unsch.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "origen")
@Access(AccessType.FIELD)
public class Origen implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para q el id sea Autoincrementable
	private Long idorigen;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 200)
	@Column(name = "codedocorigen")
	private String codedocorigen; // este es como debe venir desde Angular	
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "fechapresen")
	private String fechapresen;
	
	@JoinColumn(name = "idpersona",referencedColumnName = "idpersona") //esto es para que no solo venga el ID si no toda la informacion de su llave foranea
	@ManyToOne
	private Persona idpersona;

	
	
	public Origen() {
		
	}



	public Origen(Long idorigen, @NotNull @Size(min = 1, max = 200) String codedocorigen, String description,
			String fechapresen, Persona idpersona) {
		super();
		this.idorigen = idorigen;
		this.codedocorigen = codedocorigen;
		this.description = description;
		this.fechapresen = fechapresen;
		this.idpersona = idpersona;
	}



	public Long getIdorigen() {
		return idorigen;
	}



	public void setIdorigen(Long idorigen) {
		this.idorigen = idorigen;
	}



	public String getCodedocorigen() {
		return codedocorigen;
	}



	public void setCodedocorigen(String codedocorigen) {
		this.codedocorigen = codedocorigen;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getFechapresen() {
		return fechapresen;
	}



	public void setFechapresen(String fechapresen) {
		this.fechapresen = fechapresen;
	}



	public Persona getIdpersona() {
		return idpersona;
	}



	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
    public String toString() {
        return "Origen{" +
                "idorigen=" + idorigen +
                ", codedocorigen='" + codedocorigen + '\'' +
                ", description='" + description + '\''   + 
                ", fechapresen='" + fechapresen + '\''   +  
                ",idpersona=" + idpersona +
                '}';
    }
	
	
}
