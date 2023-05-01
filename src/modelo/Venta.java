package modelo;

import java.time.LocalDate;

public class Venta {
	private int ticket;
	private Sucursal puntoDeVenta;
	private LocalDate fecha;
	private String formaDePago;
	private float total;
	private Empleado atencion;
	private Empleado caja;
	private Persona cliente;

	public Venta(int ticket, Sucursal puntoDeVenta, LocalDate fecha, String formaDePago, float total, Empleado atencion,
			Empleado caja, Persona cliente) {
		super();
		this.ticket = ticket;
		this.puntoDeVenta = puntoDeVenta;
		this.fecha = fecha;
		this.formaDePago = formaDePago;
		this.total = total;
		this.atencion = atencion;
		this.caja = caja;
		this.cliente = cliente;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public Sucursal getPuntoDeVenta() {
		return puntoDeVenta;
	}

	public void setPuntoDeVenta(Sucursal puntoDeVenta) {
		this.puntoDeVenta = puntoDeVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Empleado getAtencion() {
		return atencion;
	}

	public void setAtencion(Empleado atencion) {
		this.atencion = atencion;
	}

	public Empleado getCaja() {
		return caja;
	}

	public void setCaja(Empleado caja) {
		this.caja = caja;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

}