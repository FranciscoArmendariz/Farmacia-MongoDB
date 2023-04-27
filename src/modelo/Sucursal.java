package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	
	private int puntoDeVenta;
	private Empleado empleadoEncargado;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private String calle;
	private int numero;
	private String localidad;
	private String provincia;
	
	public Sucursal(int puntoDeVenta, Empleado empleadoEncargado, String calle, int numero,
			String localidad, String provincia) {
		this.puntoDeVenta = puntoDeVenta;
		this.empleadoEncargado = empleadoEncargado;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public int getPuntoDeVenta() {
		return puntoDeVenta;
	}

	public void setPuntoDeVenta(int puntoDeVenta) {
		this.puntoDeVenta = puntoDeVenta;
	}

	public Empleado getEmpleadoEncargado() {
		return empleadoEncargado;
	}

	public void setEmpleadoEncargado(Empleado empleadoEncargado) {
		this.empleadoEncargado = empleadoEncargado;
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
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public boolean equals(Sucursal s) {
		return puntoDeVenta==s.puntoDeVenta;
	}

	@Override
	public String toString() {
		return "Sucursal [puntoDeVenta=" + puntoDeVenta + ", empleadoEncargado=" + empleadoEncargado + ", empleados="
				+ empleados + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", provincia="
				+ provincia + "]";
	}
	
	
}
