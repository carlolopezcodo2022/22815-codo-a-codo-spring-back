package ar.com.codoacodo.clase12;

public class Espanol extends IdIomaBase implements IIDioma {

	public Espanol() {
		super("Español");
	}

	@Override
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
		getMapDePalabras().put("hola","hola");
		getMapDePalabras().put("adios","adios");
		getMapDePalabras().put("gracias","gracias");
	}
}
