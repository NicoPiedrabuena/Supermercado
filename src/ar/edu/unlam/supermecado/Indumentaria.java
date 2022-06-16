package ar.edu.unlam.supermecado;

public class Indumentaria extends Producto {

	private Integer talle;
	private String color;

	public Indumentaria(Integer id, String marca, String descripcion, Double precio,Integer talle, String color) {
		super(id, marca, descripcion, precio);
		this.talle= talle;
		this.color= color;
	}


	public Integer getTalle() {
		return talle;
	}

	public void setTalle(Integer talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
