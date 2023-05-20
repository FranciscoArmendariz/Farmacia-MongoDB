package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
	private int ticket;
	private Sucursal puntoDeVenta;
	private LocalDate fecha;
	private String formaDePago;
	private float total;
	private Empleado atencion;
	private Empleado caja;
	private Persona cliente;
	private List<ProductoEnVenta> productos = new ArrayList<ProductoEnVenta>();

	public Venta(int ticket, Sucursal puntoDeVenta, LocalDate fecha, String formaDePago, Empleado atencion,
			Empleado caja, Persona cliente) {
		super();
		this.ticket = ticket;
		this.puntoDeVenta = puntoDeVenta;
		this.fecha = fecha;
		this.formaDePago = formaDePago;
		this.total = 0;
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

	public List<ProductoEnVenta> getProductos() {
		return productos;
	}

	
	public float calcularTotal() {
		float total =0;
		for (int i=0;i<productos.size();i++) {
			total+=productos.get(i).getTotalProducto();
		}
		return total;
	} 
	
	public void agregarProducto(Producto producto,int cantidad) {
		productos.add(new ProductoEnVenta(producto, cantidad));
		this.setTotal(calcularTotal());
	}
	
	
}