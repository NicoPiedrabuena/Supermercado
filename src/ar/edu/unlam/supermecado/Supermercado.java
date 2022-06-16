package ar.edu.unlam.supermecado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	private static Integer contadorDeVentas=0; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		productosExistentes = new HashSet<Producto>();
		productosDisponibles = new ArrayList<Producto>();
		ventasRealizadas = new HashMap<Integer,Venta>();
	}

	public void ingresarProducto(Producto nuevo) {
		if(!productosExistentes.contains(nuevo)) {
			productosExistentes.add(nuevo);
			productosDisponibles.add(nuevo);
		}else {
			productosDisponibles.add(nuevo);
		}
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer contadorStock = 0;
		for (Producto producto : productosDisponibles) {
			if(producto.getId().equals(codigo)) {
				contadorStock++;
			}
		}
		return contadorStock;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		return ventasRealizadas.get(nueroDeVenta);
		// Devuelve una venta en función de su número identificatorio
	}
	public Producto traerProducto(Integer id) {
		for (Producto producto : productosDisponibles) {
			if(producto.getId().equals(id)) {
				return producto;
			}
		}
		return null;
	}
	

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		if(productosExistentes.contains(traerProducto(codigoDeProducto))) {
		ventasRealizadas.get(numeroDeVenta).agregarProducto(traerProducto(codigoDeProducto));
		productosDisponibles.remove(traerProducto(codigoDeProducto));
		}else {
			throw new ProductoInexistente("no Existe tal producto");
		} 
		if(!productosDisponibles.contains(traerProducto(codigoDeProducto))){
			throw new ProductoSinStock("No hay stock en estos momentos");
		}
	}
	

}
