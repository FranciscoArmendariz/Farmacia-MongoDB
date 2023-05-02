package test;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class Test {

	public static void main(String[] args) throws IOException {

		
		// JACKSON ES UNA LIBRERIA QUE TAMBIEN SE AGREGÓ AL POM
		// RECUERDEN HACER EL POM > MAVEN > UPDATE PROYECT.
		
		// EN LA LIST OBJETOS SE ALMACENARÁN TODOS LOS OBJETOS QUE
		// DESPUES SERÁN MAPEADOS AL ARCHIVO FARMACIA.JSON
		// CADA NSTANCIA DE LAS CLASES SE AGREGA A ESA LISTA
		List<Object> objetos = new ArrayList<>();

		Persona Cliente = new Persona(43850891, "Gonzalez", "Matias", "Osde", "Santa fe 2035");
		objetos.add(Cliente);

		Empleado Empleado0 = new Empleado(43890524, "Gomez", "Sofia", "Ioma", "Astrada 182", "27-43890524-4");
		objetos.add(Empleado0);

		Empleado Empleado1 = new Empleado(42891522, "Diaz", "Pablo", "Osde", "Correa 182", "27-42891522-1");
		objetos.add(Empleado1);

		Empleado Encargado = new Empleado(41891127, "Romero", "Tomas", "Osde", "Av. Libertador 18422", "27-41891127-9");
		objetos.add(Encargado);

		Producto Producto1 = new Producto(1, true, "Gel refrescabte", 180.1f, "Pasteur");
		objetos.add(Producto1);

		ProductoEnVenta ProductoEnVenta1 = new ProductoEnVenta(Producto1, 5);
		objetos.add(ProductoEnVenta1);

		Sucursal Sucursal1 = new Sucursal(1, Encargado, "Florida 1243");
		Sucursal1.getEmpleados().add(Empleado0);
		Sucursal1.getEmpleados().add(Empleado1);
		objetos.add(Sucursal1);

		Venta venta1 = new Venta(1, Sucursal1, LocalDate.now(), "Efectivo", 180.1f, Empleado0, Empleado1, Cliente);
		venta1.getProductos().add(ProductoEnVenta1);
		objetos.add(venta1);

		// OBJETO DE LA LIBRERIA JACKSON PARA MAPEAR A JSON
		ObjectMapper mapper = new ObjectMapper();
		
		// ESTE ES PARA LAS CLASES LOCAL DATE
		// SI LUEGO EN MONGO QUEDA FEO, SE PUEDE CAMBIAR POR String
		mapper.registerModule(new JavaTimeModule());
		
		// SE ESCRIBE EN LA VARIABLE JSON LOS OBJETOS YA MAPEADOS
		String json = mapper.writeValueAsString(objetos);

		// SE DECLARA UN ESCRITOR PARA PASAR LA VARIABLE JSON AL ARCHIVO Farmacia.json
		// AL EJECUTAR EL TEST, SE CREARÁ EL ARCHIVO EN LA RUTA RAIZ DEL PROYECTO
		FileWriter fileWriter = new FileWriter("Farmacia.json");
		
		// SE ESCRIBE
		fileWriter.write(json);
		
		// SE CIERRA
		fileWriter.close();
		
		//SE MUESTRA POR CONSOLA
		System.out.println(json);

	}
}