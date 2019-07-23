package edu.pe.unsch.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "resolution")
@Access(AccessType.FIELD)
public class Resolution implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para q el id sea Autoincrementable
	private Long idresolution;
	
	@Basic(optional = false)
	@NotNull
	@Size(max = 50)
	@Column(name = "coderesolution")
	private String coderesolution; // este es como debe venir desde Angular
	
	@NotNull
	@Size(max = 50)
	@Column(name = "fechacreation")
	private String fechacreation; // este es como debe venir desde Angular
	
	@NotNull
	@Size(max = 1000)
	@Column(name = "visto")
	private String visto; // este es como debe venir desde Angular
	
	
	@Size(max = 1000)
	@Column(name = "presentado")
	private String presentado; // este es como debe venir desde Angular
	
	
	@Size(max = 1000)
	@Column(name = "considerando")
	private String considerando; // este es como debe venir desde Angular
	
	
	@Size(max = 1000)
	@Column(name = "resuelve")
	private String resuelve; // este es como debe venir desde Angular
	
	
	@Size(max = 1000)
	@Column(name = "cc")
	private String cc; // este es como debe venir desde Angular
	
	
	@Size(max = 1000)
	@Column(name = "tipo")
	private int tipo; // este es como debe venir desde Angular
	
	@Column(name = "	estado")
	private boolean	estado; // este es como debe venir desde Angular
	
	@Column(name = "idorigen")
	private Origen	idorigen; // este es como debe venir desde Angular

	
	
	public Resolution() {
		
	}



	public Resolution(Long idresolution, @NotNull @Size(max = 50) String coderesolution,
			@NotNull @Size(max = 50) String fechacreation, @NotNull @Size(max = 1000) String visto,
			@Size(max = 1000) String presentado, @Size(max = 1000) String considerando,
			@Size(max = 1000) String resuelve, @Size(max = 1000) String cc, @Size(max = 1000) int tipo, boolean estado,
			Origen idorigen) {
		super();
		this.idresolution = idresolution;
		this.coderesolution = coderesolution;
		this.fechacreation = fechacreation;
		this.visto = visto;
		this.presentado = presentado;
		this.considerando = considerando;
		this.resuelve = resuelve;
		this.cc = cc;
		this.tipo = tipo;
		this.estado = estado;
		this.idorigen = idorigen;
	}



	public Long getIdresolution() {
		return idresolution;
	}

	public void setIdresolution(Long idresolution) {
		this.idresolution = idresolution;
	}

	public String getCoderesolution() {
		return coderesolution;
	}

	public void setCoderesolution(String coderesolution) {
		this.coderesolution = coderesolution;
	}

	public String getFechacreation() {
		return fechacreation;
	}

	public void setFechacreation(String fechacreation) {
		this.fechacreation = fechacreation;
	}

	public String getVisto() {
		return visto;
	}

	public void setVisto(String visto) {
		this.visto = visto;
	}

	public String getPresentado() {
		return presentado;
	}

	public void setPresentado(String presentado) {
		this.presentado = presentado;
	}

	public String getConsiderando() {
		return considerando;
	}

	public void setConsiderando(String considerando) {
		this.considerando = considerando;
	}

	public String getResuelve() {
		return resuelve;
	}

	public void setResuelve(String resuelve) {
		this.resuelve = resuelve;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Origen getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(Origen idorigen) {
		this.idorigen = idorigen;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "Resolution{" +
                "idresolution=" + idresolution +
                ", coderesolution='" + coderesolution + '\'' +
                ", fechacreation='" + fechacreation + '\'' +
                ", visto='" + visto + '\'' +
                ", presentado='" + presentado + '\'' +
                ", considerando='" + considerando + '\'' +
                ", resuelve='" + resuelve + '\'' +
                ", cc='" + cc + '\'' +
                ", tipo='" + tipo + '\''   +   
                ", estado='" + estado + '\''   + 
                ", idorigen='" + idorigen + '\''   + 
                '}';
    }

	
	
}