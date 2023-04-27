package modelo;

public class Domicilio {
	
	private String calle;
	private int numero;
	private String Localidad;
	private String provincia;
	
	public Domicilio(String calle, int numero, String localidad, String provincia) {
		this.calle = calle;
		this.numero = numero;
		Localidad = localidad;
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", Localidad=" + Localidad + ", provincia="
				+ provincia + "]";
	}
	
	
	
	
	
	
}
