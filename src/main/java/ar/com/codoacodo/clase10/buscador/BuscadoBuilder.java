package ar.com.codoacodo.clase10.buscador;

import java.util.HashMap;
import java.util.Map;

public class BuscadoBuilder {

	public static Map<TipoBuscadorEnum,IBuscador> buildMapBuscador() {
		
		Map<TipoBuscadorEnum, IBuscador> mapBuscadores  = new HashMap<>();
		
		//cargar
		mapBuscadores.put(TipoBuscadorEnum.TITULO, new BuscadorTitulo());
		mapBuscadores.put(TipoBuscadorEnum.ISBN, new BuscadorISBN());
		mapBuscadores.put(TipoBuscadorEnum.AUTOR, new BuscadorAutor());
		
		return mapBuscadores;
	}
}
