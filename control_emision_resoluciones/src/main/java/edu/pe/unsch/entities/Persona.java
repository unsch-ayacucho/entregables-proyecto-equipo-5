package edu.pe.unsch.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persona")
@Access(AccessType.FIELD)
public class Persona implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para q el id sea Autoincrementable
	private Long idpersona;
	
		// column es como debe ir en la BD
		@Basic(optional = false)
		@NotNull
		@Size(min = 1, max = 150)
		@Column(name = "nombre")
		private String nombre; // este es como debe venir desde Angular	
		
		@Column(name = "apellidos")
		private String apellidos;
		
		@Column(name = "dni")
		private int dni;
		
		@Column(name = "codeuniversidad")
		private int codeuniversidad;
		
		@Column(name = "direction")
		private String direction;
		
		public Persona() {
			
		}


		public Persona(Long idpersona) {
			super();
			this.idpersona = idpersona;
		}


		public Persona(Long idpersona, @NotNull @Size(min = 1, max = 150) String nombre, String apellidos, int dni,
				int codeuniversidad, String direction) {
			
			this.idpersona = idpersona;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
			this.codeuniversidad = codeuniversidad;
			this.direction = direction;
		}

		public Long getIdpersona() {
			return idpersona;
		}

		public void setIdpersona(Long idpersona) {
			this.idpersona = idpersona;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
		}

		public int getCodeuniversidad() {
			return codeuniversidad;
		}

		public void setCodeuniversidad(int codeuniversidad) {
			this.codeuniversidad = codeuniversidad;
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		@Override
	    public String toString() {
	        return "Persona{" +
	                "idpersona=" + idpersona +
	                ", nombre='" + nombre + '\'' +
	                ", apellidos='" + apellidos + '\'' +
	                ", dni='" + dni + '\''   +   
	                ", codeuniversidad='" + codeuniversidad + '\''   + 
	                ", direction='" + direction + '\''   + 
	                '}';
	    }

		
		
		
}