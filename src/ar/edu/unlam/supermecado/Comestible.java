package ar.edu.unlam.supermecado;

public class Comestible extends Producto {
	
	private String fechaElaboracion;
	private String fechaVencimiento;

	public Comestible(Integer id, String marca, String descripcion, Double precio,String fechaElaboracion,String fechaVencimiento) {
		super(id, descripcion, marca, precio);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaElaboracion() {
		return fechaElaboracion;
	}

	public void setFechaElaboracion(String fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	

}
