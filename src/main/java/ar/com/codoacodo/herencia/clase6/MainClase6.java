package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class MainClase6 {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("/libro.jpg","Iron Man","Alguien",3500);
		Musica musica  = new Musica("/libro.jpg","Iron Man","Alguien",3500);
		
		Articulo articulo = new Articulo("/libro.jpg","Iron Man","Alguien",3500);//@32123
		
		
		articulo = libro1;//padre puede contener la referencia de un hijo
		articulo = musica;
		
		//libro1 = musica; //un hermano no puede contener la ref de otro hno
		
		//libro1 = articulo;//un hijo no puede contener la referencia de un padre
		
		articulo = new Libro("/libro.jpg","Iron Man","Alguien",3500);//@asdasd
	}
}
