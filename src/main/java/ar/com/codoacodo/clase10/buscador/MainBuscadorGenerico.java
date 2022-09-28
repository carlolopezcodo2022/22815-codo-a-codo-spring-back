package ar.com.codoacodo.clase10.buscador;

import java.util.Map;

public class MainBuscadorGenerico {

	public static void main(String[] args) {
		
		String tipoDeBusqueda = "isbn";
		
		Map<String, IBuscador> mapBuscadores  = BuscadoBuilder.buildMapBuscador();
		
		IBuscador buscador = mapBuscadores.get(tipoDeBusqueda);
		
		if(buscador != null) {
			String dato = buscador.buscar();
			System.out.println(dato);
		}
		
	}
}
