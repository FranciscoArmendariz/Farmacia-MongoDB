package modelo;


public class ObraSocial {

	private int id;
	private String nombre;
	
	public ObraSocial(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean equals(ObraSocial o) {
		return id==o.id;
	}
	
	@Override
	public String toString() {
		return nombre + ", ID:" + id;
	}
	
	
	
	
}
