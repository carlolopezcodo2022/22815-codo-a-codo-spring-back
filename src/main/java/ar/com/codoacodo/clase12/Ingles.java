package ar.com.codoacodo.clase12;

public class Ingles extends IdIomaBase implements IIDioma {

	public Ingles() {
		super("Ingles");
	}
	
	public void decir(String palabra) {
		String valor = getMapDePalabras().get(palabra);
		if(valor != null) 
			System.out.println(palabra +" en " + getNombre()+ " = " +  valor);
		else
			System.out.println("Error");
	}

	@Override
	public void crearMapaDePalabras() {
		//clave-valor
		getMapDePalabras().put("hola","hello");
		getMapDePalabras().put("adios","good bye");
		getMapDePalabras().put("gracias","thanks you");
	}
}
