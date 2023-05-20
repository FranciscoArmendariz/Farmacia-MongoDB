package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

	private int puntoDeVenta;
	private Empleado empleadoEncargado;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private String domicilio;

	public Sucursal(int puntoDeVenta, Empleado empleadoEncargado, String domicilio) {
		super();
		this.puntoDeVenta = puntoDeVenta;
		this.empleadoEncargado = empleadoEncargado;
		this.domicilio = domicilio;
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
	

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setCalle(String domicilio) {
		this.domicilio = domicilio;
	}

	public boolean equals(Sucursal s) {
		return puntoDeVenta == s.puntoDeVenta;
	}

	
	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
	}
}