import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import modelo.Empleado;
import modelo.Persona;
import modelo.Producto;
import modelo.ProductoEnVenta;
import modelo.Sucursal;
import modelo.Venta;

public class TestV3 {

	public static void main(String[] args) throws IOException {

		// JACKSON ES UNA LIBRERIA QUE TAMBIEN SE AGREGÃ“ AL POM
				// RECUERDEN HACER EL POM > MAVEN > UPDATE PROYECT.
				
				// EN LA LIST OBJETOS SE ALMACENARÃ�N TODOS LOS OBJETOS QUE
				// DESPUES SERÃ�N MAPEADOS AL ARCHIVO FARMACIA.JSON
				// CADA NSTANCIA DE LAS CLASES SE AGREGA A ESA LISTA
				
				/****************************************************
				 *   			GENERACION DE CALSES				*
				 ****************************************************/
				
		
				// Creamos Empleados
				Empleado empleado1 = new Empleado(43890524, "Gomez", "Sofia", "Ioma", "Astrada 182", "27-43890524-4");
				Empleado empleado2 = new Empleado(42891522, "Diaz", "Pablo", "Osde", "Correa 182", "27-42891522-1");
				Empleado empleado3 = new Empleado(41891127, "Romero", "Tomas", "Osde", "Av. Libertador 18422", "27-41891127-9");
				
				
				
				
				// Creamos sucursales y les agregamos empleados
				Sucursal sucursal1 = new Sucursal(1, empleado1, "Florida 1243");
				sucursal1.agregarEmpleado(empleado2);
				sucursal1.agregarEmpleado(empleado3);
				
				
				// Creamos productos
				
				Producto producto1 = new Producto(1, true, "Gel refrescabte", 180.1f, "Pasteur");
				
				// Creamos clientes
				Persona Cliente = new Persona(43850891, "Gonzalez", "Matias", "Osde", "Santa fe 2035");
				
				
				//creamos ventas y agregamps los productos
				List<Venta> ventas = new ArrayList<>();

				Venta venta1 = new Venta(1, sucursal1, LocalDate.now(), "Efectivo", empleado2, empleado3, Cliente);
				venta1.agregarProducto(producto1, 5);
				ventas.add(venta1);
				
				
				/****************************************************
				 *   			GENERACION DE JSON   				*
				 ****************************************************/
				
				ObjectMapper mapper = new ObjectMapper();
				mapper.registerModule(new JavaTimeModule());
				
				String jsonVentas = mapper.writeValueAsString(ventas);
				FileWriter fileWriter2 = new FileWriter("Ventas.json");
				fileWriter2.write(jsonVentas);
				fileWriter2.close();
				System.out.println("\nLISTADO DE VENTAS \n" + jsonVentas + "\n");

		
	}

}
