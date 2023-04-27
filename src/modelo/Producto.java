package modelo;

public class Producto {

	private int codigo;
	//tipo: 0=medicamento, 1=perfumeria
	private boolean tipo;
	private String descripcion;
	private float precio;
	private String laboratorio;
	
	public Producto(int codigo, boolean tipo, String descripcion, float precio, String laboratorio) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.laboratorio = laboratorio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	public boolean equals(Producto p) {
		return codigo==p.codigo;
	}
	
	public String toString() {
		String tipoS ="medicamento";
		if (tipo)
			tipoS ="perfumeria";
		return "Producto N°" + codigo + "\n" + descripcion + " " + laboratorio + "\n tipo: " + tipoS + " $" + precio;
	}
	
	
}
