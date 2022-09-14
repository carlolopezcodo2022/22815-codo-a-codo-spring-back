package ar.com.codoacodo.herencia.clase7;

public class Wii extends Consola implements IJugable {

	private int cantidadMandos;
	
	public Wii(String nombre, String marca) {
		super(nombre,marca);
		this.setCantidadMandos(2);
	}
	
	/*por implementar IJugable esta obligada a escribir el metodo jugar()*/
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando...");
	}
	
	public void setCantidadMandos(int cantidadMandos) {
		this.cantidadMandos = cantidadMandos;
	}
	
	public int getCantidadMandos() {
		return cantidadMandos;
	}
	
}
