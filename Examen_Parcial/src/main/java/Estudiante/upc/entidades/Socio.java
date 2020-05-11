package Estudiante.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Socio_TP")
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idSocio;
	private int dni;
	private String nombreSocio;
	private String email;
	private String direccion;
	private int nDependientes;
	
	
	
	
	public Long getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(Long idSocio) {
		this.idSocio = idSocio;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombreSocio() {
		return nombreSocio;
	}
	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getnDependientes() {
		return nDependientes;
	}
	public void setnDependientes(int nDependientes) {
		this.nDependientes = nDependientes;
	}
	
	
	
	
}
