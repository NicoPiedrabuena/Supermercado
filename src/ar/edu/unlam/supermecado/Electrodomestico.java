package ar.edu.unlam.supermecado;

public class Electrodomestico extends Producto {

	private Integer garantia;

	public Electrodomestico(Integer id, String marca, String descripcion, Double precio,Integer garantia) {
		super(id, descripcion, marca, precio);
		this.garantia = garantia;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}
	

}
