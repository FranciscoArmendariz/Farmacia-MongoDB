package modelo;

public class Persona {

	protected int dni;
	protected String apelido;
	protected String nombre;
	protected String obraSocial;
	protected String domicilio;
	
 Persona(int dni, String apelido, String nombre, String obraSocial, String domicilio) {
		this.dni = dni;
		this.apelido = apelido;
		this.nombre = nombre;
		this.obraSocial = obraSocial;
		this.domicilio = domicilio;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public boolean equals(Persona p) {
		return dni==p.dni;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apelido=" + apelido + ", nombre=" + nombre + ", obraSocial=" + obraSocial
				+ ", domicilio=" + domicilio + "]";
	}
}