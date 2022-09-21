package ar.com.codoacodo.herencia.clase7;

import ar.com.codoacodo.herencia.Buscador;

public class MainBuscador {

	/*
	 *POST > 
	 *claveOrden > input
	 * */
	public static void main(String[] args) {
		
		String clave = "harry potter";
		String claveOrden = "MAYORPRECIO";
		
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();
		
		buscador.ordenar();
	
		claveOrden = "MASVENDIDOS";		
		buscador.ordenar();
	}
}
