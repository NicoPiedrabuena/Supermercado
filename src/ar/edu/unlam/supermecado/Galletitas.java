package ar.edu.unlam.supermecado;

public class Galletitas extends Comestible {

	private String fechaElaboracion;
	private String fechaVencimiento;

	public Galletitas(Integer id, String marca, String fechaElaboracion, String fechaVencimiento, String descripcion, Double precio) {
		super(id,marca,descripcion,precio,fechaElaboracion,fechaVencimiento);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String getFechaElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaElaboracion;
	}

	@Override
	public String getFechaVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaVencimiento;
	}

	public void setFechaElaboracion(String fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	

}
