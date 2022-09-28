package ar.com.codoacodo.clase10.buscador;

import java.util.HashMap;
import java.util.Map;

public class BuscadoBuilder {

	public static Map<String,IBuscador> buildMapBuscador() {
		
		Map<String, IBuscador> mapBuscadores  = new HashMap<>();
		
		//cargar
		mapBuscadores.put("titulo", new BuscadorTitulo());
		mapBuscadores.put("isbn", new BuscadorISBN());
		mapBuscadores.put("autor", new BuscadorAutor());
		
		return mapBuscadores;
	}
}
