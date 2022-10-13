package ar.com.codoacodo.clase10.buscador;

import java.util.Map;

public class MainBuscadorGenerico {

	public static void main(String[] args) {
		
		String tipoDeBusqueda = "isbn";
		
		TipoBuscadorEnum opcion = TipoBuscadorEnum.valueOf(tipoDeBusqueda.toUpperCase());//mayuscula
		
		Map<TipoBuscadorEnum, IBuscador> mapBuscadores  = BuscadoBuilder.buildMapBuscador();
		
		IBuscador buscador = mapBuscadores.get(opcion);
		
		if(buscador != null) {
			String dato = buscador.buscar();
			System.out.println(dato);
		}
		
	}
}
