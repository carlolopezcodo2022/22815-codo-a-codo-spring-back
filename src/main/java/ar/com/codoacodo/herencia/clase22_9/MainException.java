package ar.com.codoacodo.herencia.clase22_9;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;
import ar.com.codoacodo.herencia.clase6.Libro;
import ar.com.codoacodo.herencia.clase6.Musica;

public class MainException {

	public static void main(String[] args) {
	
		//EN TIEMPO DE COMPILACION NO HAY ERRORES
		int valor = 10;
		
		int divior = 1;
		
		int c = valor / divior;

		System.out.println(c);
		
		Buscador buscador = new Buscador("vacia");
		
		buscador.buscar();
		
		int[] edades = new int[] {10,20,30};
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);
		
		//System.out.println(edades[3]);
		Articulo articulo = new Libro("", "", "", 1);
		Libro l = (Libro) articulo;
		System.out.println(l.getIsbn());
		
		Musica musica = (Musica)articulo;
		System.out.println(musica.getAutor());
	}

}
