package ar.com.codoacodo.clase12;

import java.util.HashMap;
import java.util.Map;

public abstract class IdIomaBase implements IIDioma {
	protected String nombre;
	protected Map<String, String> mapDePalabras;
	
	//vamos a usar un enum!!
	public IdIomaBase(String nombre) {
		setNombre(nombre);
		inicializarMapaVacio();
		crearMapaDePalabras();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, String> getMapDePalabras() {
		return mapDePalabras;
	}

	private void inicializarMapaVacio() {
		this.mapDePalabras = new HashMap<>();
	}

	public abstract void crearMapaDePalabras();
}
