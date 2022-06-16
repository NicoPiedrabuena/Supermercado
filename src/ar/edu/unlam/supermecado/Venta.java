package ar.edu.unlam.supermecado;

import java.util.ArrayList;

public class Venta {

	private Integer dniDelComprado;
	private String nombreDelComprador;
	private ArrayList<Producto>comprados;


	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprado = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		comprados = new ArrayList<Producto>();
	}
	

	public Integer getDniDelComprado() {
		return dniDelComprado;
	}

	public void setDniDelComprado(Integer dniDelComprado) {
		this.dniDelComprado = dniDelComprado;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

	public Double getImporte() {
		Double total=0.0;
		for (Producto producto : comprados) {
			total+=producto.getPrecio();
		}
		return total;
	}
	public void agregarProducto(Producto nuevo) {
		comprados.add(nuevo);
	}

}
