package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;

public class MainBuscador {

	/*
	 *POST > 
	 *claveOrden > input
	 * */
	public static void main(String[] args) {
		
		String clave = "harry potter";
		
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();
		
		Articulo[] resultados = buscador.getResultados();
		
		//simulo la pantalla de resultados
		for(Articulo unResultado : resultados) {

			//propio de ARTICULO
			unResultado.getAutor();
			unResultado.getImg();
			unResultado.getPrecio();
			unResultado.getImg();

			if(unResultado instanceof Libro) {
				Libro l = (Libro)unResultado;
				l.getIsbn();
				l.getNroPaginas();
			}
			
			if(unResultado instanceof Musica) {
				
			}
			
			if(unResultado instanceof Pelicula ) {
				
			}
		}
	}
}
