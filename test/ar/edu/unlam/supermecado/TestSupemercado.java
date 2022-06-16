package ar.edu.unlam.supermecado;

import static org.junit.Assert.*;

import org.junit.Test;
public class TestSupemercado {

	@Test
	public void queSePuedaInstanciarUnComestible() {
		Comestible producto = new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0);
		assertEquals("Cerealitas", ((Galletitas)producto).getMarca());
		assertEquals("22/06/2021", producto.getFechaElaboracion());
		assertEquals("31/01/2022", producto.getFechaVencimiento());
		assertEquals("Arcor", ((Galletitas)producto).getDescripcion());
	}
	@Test
	public void queSePuedaInstanciarOtroComestible() {
		Comestible producto = new Carne(2, "La Estancia", "Tapa de nalga", "15/07/2021", "07/07/2021", 2.0, 600.0);
		
		assertEquals("Tapa de nalga", ((Carne)producto).getDescripcion());
		assertEquals("07/07/2021", producto.getFechaElaboracion());
		assertEquals("15/07/2021", producto.getFechaVencimiento());
		assertEquals(2.0, ((Carne)producto).getKilos(), 0.1);
	}
	@Test
	public void queSePuedaInstanciarUnElectrodomestico() {
		Electrodomestico producto = new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0);
		
		assertEquals("Serie Dorada", ((Televisor)producto).getDescripcion());
		assertEquals((Integer)42, ((Televisor)producto).getPulgadas());
		assertEquals((Integer)12, producto.getGarantia());
		assertEquals("Samsung", ((Televisor)producto).getMarca());
	}
	@Test
	public void queSePuedaInstanciarOtroElectrodomestico() {
		Electrodomestico producto = new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0);
		
		assertEquals("Nuevo Modelo", ((Heladera)producto).getDescripcion());
		assertEquals(true, ((Heladera)producto).isNoFrost());
		assertEquals((Integer)12, producto.getGarantia());
		assertEquals("Samsung", ((Heladera)producto).getMarca());
	}
	@Test
	public void queSePuedaInstanciarUnaIndumentaria() {
		Indumentaria producto = new Remera(5, "Básica", 4, "Lacoste", "Azul", 2000.0);
		
		assertEquals("Básica", ((Remera)producto).getDescripcion());
		assertEquals((Integer)4, producto.getTalle());
		assertEquals("Lacoste", ((Remera)producto).getMarca());
	}
	@Test
	public void queSePuedaInstanciarOtraIndumentaria() {
		Indumentaria producto = new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0);
		
		assertEquals("De running", ((Zapatilla)producto).getDescripcion());
		assertEquals((Integer)42, producto.getTalle());
		assertEquals("Blancas", producto.getColor());
		assertEquals("Nike", ((Zapatilla)producto).getMarca());
	}
	@Test
	public void queSePuedaStockear() {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "La Estancia", "Tapa de nalga", "15/07/2021", "07/07/2021", 2.0, 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", 4, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 3, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 2, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 1, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		assertEquals(10, vital.getOfertaDeProductos().size());
		assertEquals((Integer)2, vital.getStock(1));
		assertEquals((Integer)1, vital.getStock(2));
		assertEquals((Integer)3, vital.getStock(9));
	}
	@Test
	public void queSePuedaGenerarUnaVenta() {
		
		final Integer PRODUCTO_A_COMPRAR_1 = 1;
		final Integer PRODUCTO_A_COMPRAR_2 = 2;
		
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "La Estancia", "Tapa de nalga", "15/07/2021", "07/07/2021", 2.0, 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", 4, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 3, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 2, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 1, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		
		try {
			vital.agregarAlCarrito(numeroDeVenta, PRODUCTO_A_COMPRAR_1);
			vital.agregarAlCarrito(numeroDeVenta, PRODUCTO_A_COMPRAR_2);
		} catch (ProductoSinStock e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProductoInexistente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		assertEquals((Integer)720, vital.getVenta(numeroDeVenta).getImporte(), 0.01);
	}
	@Test (expected = ProductoInexistente.class)
	public void queNoSePuedaVenderUnProductoInexistente() throws ProductoSinStock, ProductoInexistente {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "La Estancia", "Tapa de nalga", "15/07/2021", "07/07/2021", 2.0, 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", 4, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 3, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 2, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 1, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		
		vital.agregarAlCarrito(numeroDeVenta, 1);
		vital.agregarAlCarrito(numeroDeVenta, 11);
		
	}
	@Test (expected = ProductoSinStock.class)
	public void queNoSePuedaVenderUnProductoSinStock() throws ProductoSinStock, ProductoInexistente {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "La Estancia", "Tapa de nalga", "15/07/2021", "07/07/2021", 2.0, 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", 4, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 3, "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 2, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", 1, "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		
		vital.agregarAlCarrito(numeroDeVenta, 1);
		vital.agregarAlCarrito(numeroDeVenta, 1);
		vital.agregarAlCarrito(numeroDeVenta, 1);
		
	}
	
}
