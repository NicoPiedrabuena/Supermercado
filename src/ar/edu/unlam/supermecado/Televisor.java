package ar.edu.unlam.supermecado;

public class Televisor extends Electrodomestico {
	
	private Integer pulgadas;

	public Televisor(Integer id,String descripcion,Integer pulgadas,Integer garantia,String marca,Double precio) {
		super(id,marca,descripcion,precio,garantia);
		this.pulgadas = pulgadas;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	

}
