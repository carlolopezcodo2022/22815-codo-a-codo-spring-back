package ar.com.codoacodo.herencia.clase7;

public class PlayStation extends Consola implements IJugable {

	public PlayStation(String nombre, String marca) {
		super(nombre, marca);
	}

	private boolean chipeada;

	public boolean isChipeada() {
		return chipeada;
	}

	public void chipear() {
		if(!isChipeada()) {
			setChipeada(true);
		}
	}

	public void setChipeada(boolean chipeada) {
		this.chipeada = chipeada;
	}
	
	/*por implementar IJugable esta obligada a escribir el metodo jugar()*/
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando...");
	}
}
