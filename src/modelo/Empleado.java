package modelo;

public class Empleado extends Persona {
	
	private String cuil;
	
	public Empleado(int dni, String apelido, String nombre, String obraSocial, Domicilio domicilio, String cuil) {
		super(dni, apelido, nombre, obraSocial, domicilio);
		this.cuil = cuil;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) throws Exception {
		if (cuil.length()!=13)
			throw new Exception("Error el cuil debe tener 13 caracteres con los guines incluidos");
		this.cuil = cuil;
	}
	
	public boolean equals(Empleado e) {
		return cuil==e.cuil;
	}
	@Override
	public String toString() {
		return "Empleado [cuil=" + cuil + "]";
	}

	
	
	
	
	
	

	

	
	
	
	
}
