package ar.com.codoacodo.herencia.clase7;

public class XBox extends Consola implements IJugable {

	public XBox(String nombre, String marca) {
		super(nombre, marca);
	}

	/*por implementar IJugable esta obligada a escribir el metodo jugar()*/
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando...");
	}
}
