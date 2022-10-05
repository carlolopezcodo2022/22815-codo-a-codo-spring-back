package ar.com.codoacodo.clase12;

public class IdiomasMain {

	public static void main(String[] args) throws IdiomaDuplicadoException {
		
		//creando los idiomas disponibles
		IIDioma chino = new Chino();
		Ingles ingles = new Ingles();
		Espanol espanol = new Espanol();
		
		Persona persona = new Persona("juan",ingles);
		
		String algo = "hola";
		
		//ahora le decimso que digo "loro"
		persona.decir(algo); 
		
		persona.aprender(chino);
		persona.aprender(espanol);
		
		persona.decir(algo); 
	}

}
