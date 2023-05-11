package test;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class TestV2 {
	public static void main(String[] args) throws IOException {
		
		// JACKSON ES UNA LIBRERIA QUE TAMBIEN SE AGREGÓ AL POM
		// RECUERDEN HACER EL POM > MAVEN > UPDATE PROYECT.
		
		// EN LA LIST OBJETOS SE ALMACENARÁN TODOS LOS OBJETOS QUE
		// DESPUES SERÁN MAPEADOS AL ARCHIVO FARMACIA.JSON
		// CADA NSTANCIA DE LAS CLASES SE AGREGA A ESA LISTA
		
		/****************************************************
		 *   			LISTADO DE EMPLEADOS				*
		 ****************************************************/
		
		List<Empleado> empleados = new ArrayList<>();

		Empleado Empleado0 = new Empleado(43890524, "Gomez", "Sofia", "Ioma", "Astrada 182", "27-43890524-4");
		empleados.add(Empleado0);

		Empleado Empleado1 = new Empleado(42891522, "Diaz", "Pablo", "Osde", "Correa 182", "27-42891522-1");
		empleados.add(Empleado1);

		Empleado Encargado = new Empleado(41891127, "Romero", "Tomas", "Osde", "Av. Libertador 18422", "27-41891127-9");
		empleados.add(Encargado);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		String jsonEmpleados = mapper.writeValueAsString(empleados);
		FileWriter fileWriter = new FileWriter("Empleados.json");
		fileWriter.write(jsonEmpleados);
		fileWriter.close();
		System.out.println("\nLISTADO DE EMPLEADOS \n" + jsonEmpleados + "\n");
		
		
		/****************************************************
		 *   			LISTADO DE SUCURSALES				*
		 ****************************************************/
		
		List<Sucursal> sucursales = new ArrayList<>();
		
		Sucursal Sucursal1 = new Sucursal(1, Encargado, "Florida 1243");
		Sucursal1.getEmpleados().add(Empleado0);
		Sucursal1.getEmpleados().add(Empleado1);
		sucursales.add(Sucursal1);
		
		String jsonSucursales = mapper.writeValueAsString(sucursales);
		FileWriter fileWriter1 = new FileWriter("Sucursales.json");
		fileWriter1.write(jsonSucursales);
		fileWriter1.close();
		System.out.println("\nLISTADO DE SUCURSALES \n" + jsonSucursales + "\n");
		
		
		/****************************************************
		 *   			LISTADO DE VENTAS					*
		 ****************************************************/
		
		List<Venta> ventas = new ArrayList<>();
		
		Persona Cliente = new Persona(43850891, "Gonzalez", "Matias", "Osde", "Santa fe 2035");
		
		Producto Producto1 = new Producto(1, true, "Gel refrescabte", 180.1f, "Pasteur");

		ProductoEnVenta ProductoEnVenta1 = new ProductoEnVenta(Producto1, 5);
		
		Venta venta1 = new Venta(1, Sucursal1, LocalDate.now(), "Efectivo", 180.1f, Empleado0, Empleado1, Cliente);
		venta1.getProductos().add(ProductoEnVenta1);
		ventas.add(venta1);
		
		String jsonVentas = mapper.writeValueAsString(ventas);
		FileWriter fileWriter2 = new FileWriter("Ventas.json");
		fileWriter2.write(jsonVentas);
		fileWriter2.close();
		System.out.println("\nLISTADO DE VENTAS \n" + jsonVentas + "\n");

	}

}
