package ar.edu.unlam.supermecado;

public class Heladera extends Electrodomestico {

	private Boolean esNoFrost;

	public Heladera(Integer id, String marca, Boolean esNoFrost , Integer garantia, String descripcion, Double precio) {
		super(id,descripcion,marca,precio,garantia);
		this.esNoFrost = esNoFrost;
	}

	public Boolean isNoFrost() {
		return esNoFrost;
	}

	public void setEsNoFrost(Boolean esNoFrost) {
		this.esNoFrost = esNoFrost;
	}
	

}
