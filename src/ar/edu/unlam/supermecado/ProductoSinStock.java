package ar.edu.unlam.supermecado;

public class ProductoSinStock extends Exception {
	public ProductoSinStock (String msj) {
		super(msj);
	}
}
