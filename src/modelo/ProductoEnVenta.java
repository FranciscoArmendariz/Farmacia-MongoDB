package modelo;

public class ProductoEnVenta {
	private Producto producto;
	private int cantidad;
	private float totalProducto;

	public ProductoEnVenta(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.totalProducto = producto.getPrecio() * cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getTotalProducto() {
		return totalProducto;
	}

	public void setTotalProducto(float totalProducto) {
		this.totalProducto = totalProducto;
	}

}