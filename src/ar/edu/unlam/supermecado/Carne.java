package ar.edu.unlam.supermecado;

public class Carne extends Comestible  {

	
	
	
	private Double kilos;

	public Carne(int id, String marca, String descripcion, String fechaElaboracion, String fechaVencimiento, Double kilos, Double precio) {
		super(id,marca,descripcion,precio,fechaVencimiento,fechaElaboracion);
		this.kilos = kilos;
	}

	

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}
	

}
