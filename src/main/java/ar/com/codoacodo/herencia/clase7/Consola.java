package ar.com.codoacodo.herencia.clase7;

public class Consola {

	private String nombre;
	private String marca;
	
	public Consola(String nombre, String marca) {
		this.nombre = nombre;
		this.marca = marca;
	}

	private boolean encendida;
		
	public String getNombre() {
		return this.nombre;
	}
	
	public String getMarca() {
		return this.marca;
	}
}
