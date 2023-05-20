package test;
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
import modelo.Sucursal;
import modelo.Venta;

public class CreacionDeJson {

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
				Empleado empleado1 = new Empleado(43890524, "Gomez", "Sofia", "IOMA", "San Martin 1075, Morón, Buenos Aires", "20-43890524-4");
				Empleado empleado2 = new Empleado(42891522, "Diaz", "Pablo", "OSDE", "Avellaneda 3549, CABA", "20-42891522-5");
				Empleado empleado3 = new Empleado(41891127, "Romero", "Tomas", "Osde", "Gaetán Gutiérrez 949, San Isidro, Buenos Aires", "20-41891127-2");
				Empleado empleado4 = new Empleado(43890524, "Franco", "Gloria ", "TV-sauld", "Fischetti 5266, Caseros, Buenos Aires", "27-398362124-3");
				Empleado empleado5 = new Empleado(43890524, "Balaguer", "Juan Pablo", "OSPIC", "Calderón de la Barca 1732, Temperley, Buenos Aires", "20-44010534-4");
				Empleado empleado6 = new Empleado(43890524, "Laguna", "Tatiana ", "OSDE", "Hernandarias 2747, Lomas de Zamora, Buenos Aires", "27-40450123-8");
				Empleado empleado7 = new Empleado(43890524, "Artega", "Ines ", "IOMA", "Av. Presidente Néstor Kirchner 2802, Berazategui, Buenos Aires", "27-39219919-0");
				
				
				
				// Creamos sucursales y les agregamos empleados
				Sucursal sucursal1 = new Sucursal(1, empleado1, "Av. Sta. Fe 1740, CABA");
				sucursal1.agregarEmpleado(empleado2);
				sucursal1.agregarEmpleado(empleado3);
				Sucursal sucursal2 = new Sucursal(2, empleado4, "Av, Belgrano 1194, CABA");
				sucursal2.agregarEmpleado(empleado5);
				sucursal2.agregarEmpleado(empleado6);
				sucursal2.agregarEmpleado(empleado7);
				
				
				// Creamos productos
				
				Producto producto1 = new Producto(1, true, "Gel Hidrantante Dermaglos 150g", 2830.00f, "Andrómaco");
				Producto producto2 = new Producto(1, true, "Protector Solar fps50 250ml Dermaglos", 3270.20f, "Andrómaco");
				Producto producto3 = new Producto(1, true, "Pasta dental Sensodyne 90g", 790.50f, "GSK");
				Producto producto4 = new Producto(1, true, "Shampoo Dove 200ml", 687.00f, "Unilever");
				Producto producto5 = new Producto(1, true, "Jabon de mano Dove 90g", 250.00f, "Unilever");
				Producto producto6 = new Producto(1, false, "Ibuprofeno 400 x 30comprimidos", 690.75f, "ISA");
				Producto producto7 = new Producto(1, false, "Paracetamol x 30 Comprimidos", 694.00f, "ISA");
				Producto producto8 = new Producto(1, false, "Actron Plus X 8 Capsulas Blandas", 630.0f, "Bayer");
				Producto producto9 = new Producto(1, false, "Oralsone Topico Solucion 20ml", 1992.25f, "Gramon Millet");
				
				// Creamos clientes
				Persona Cliente1 = new Persona(43850891, "Gonzalez", "Matias", "OSDE", "Rodríguez Peña 1075, CABA");
				Persona Cliente2 = new Persona(43850891, "Barbera", "Victoria", "Mefide", "Arenales 1701, CABA");
				Persona Cliente3 = new Persona(43850891, "Segarra", "Marco", "OSPIC", "Moreno 1169, CABA");
				Persona Cliente4 = new Persona(43850891, "Quesada", "Maximino", "OSPIC", "San José 431, CABA");
				Persona Cliente5 = new Persona(43850891, "Alvaro", "Nadia", "OSPIC", "Salta 333, CABA");

				
				
				//creamos ventas y agregamps los productos
				List<Venta> ventas = new ArrayList<>();

				Venta venta1 = new Venta(1, sucursal1, LocalDate.now(), "Efectivo", empleado2, empleado3, Cliente1);
				venta1.agregarProducto(producto1, 2);
				venta1.agregarProducto(producto2, 1);
				venta1.agregarProducto(producto3, 3);
				ventas.add(venta1);
				
				Venta venta2 = new Venta(2, sucursal2, LocalDate.now(), "Debito", empleado5, empleado6, Cliente4);
				venta2.agregarProducto(producto4, 2);
				venta2.agregarProducto(producto5, 2);
				venta2.agregarProducto(producto7, 1);
				venta2.agregarProducto(producto8, 3);
				ventas.add(venta2);
				
				Venta venta3 = new Venta(3, sucursal2, LocalDate.now(), "Debito", empleado5, empleado7, Cliente3);
				venta3.agregarProducto(producto6, 3);
				venta3.agregarProducto(producto7, 2);
				ventas.add(venta3);
				
				Venta venta4 = new Venta(4, sucursal1, LocalDate.now(), "Efectivo", empleado2, empleado3, Cliente2);
				venta4.agregarProducto(producto8, 1);
				ventas.add(venta4);
				
				Venta venta5 = new Venta(5, sucursal2, LocalDate.now(), "Credito", empleado7, empleado6, Cliente5);
				venta5.agregarProducto(producto1, 2);
				venta5.agregarProducto(producto2, 3);
				venta5.agregarProducto(producto3, 2);
				venta5.agregarProducto(producto4, 5);
				venta5.agregarProducto(producto5, 6);
				venta5.agregarProducto(producto7, 2);
				venta5.agregarProducto(producto9, 3);
				ventas.add(venta5);
				
				Venta venta6 = new Venta(6, sucursal2, LocalDate.now(), "Credito", empleado4, empleado6, Cliente5);
				venta6.agregarProducto(producto1, 1);
				venta6.agregarProducto(producto4, 1);
				ventas.add(venta6);
				
				Venta venta7 = new Venta(7, sucursal1, LocalDate.now(), "Efectivo", empleado1, empleado2, Cliente2);
				venta7.agregarProducto(producto4, 2);
				venta7.agregarProducto(producto5, 2);
				venta7.agregarProducto(producto6, 1);
				ventas.add(venta7);
				
				Venta venta8 = new Venta(8, sucursal1, LocalDate.now(), "Debito", empleado1, empleado3, Cliente1);
				venta8.agregarProducto(producto3, 1);
				venta8.agregarProducto(producto9, 2);
				ventas.add(venta8);
				
				Venta venta9 = new Venta(9, sucursal2, LocalDate.now(), "Credito", empleado4, empleado6, Cliente4);
				venta9.agregarProducto(producto6, 1);
				ventas.add(venta9);
				
				Venta venta10 = new Venta(10, sucursal2, LocalDate.now(), "Debito", empleado5, empleado7, Cliente3);
				venta10.agregarProducto(producto2, 1);
				venta10.agregarProducto(producto3, 1);
				venta10.agregarProducto(producto4, 2);
				venta10.agregarProducto(producto5, 3);
				ventas.add(venta10);
				
				
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
