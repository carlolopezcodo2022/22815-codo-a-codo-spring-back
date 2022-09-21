package ar.com.codoacodo.herencia.clase8;

import ar.com.codoacodo.herencia.IFiltro;
import ar.com.codoacodo.herencia.MasVendidos;
import ar.com.codoacodo.herencia.MayorPrecio;
import ar.com.codoacodo.herencia.MenorPrecio;

public class CreadorDeFiltros {

	//método estático: método que no le pertenece a una instancia, sino a la Clase
	
	public static IFiltro crearFiltro(String clave) {
		
		IFiltro filtro;
		
		//Interface i = new ClaseQueImplementa();
		
		switch (clave) {
			case "MASVENDIDOS"://enums
				filtro = new MasVendidos();
				break;
			case "MAYORPRECIO":
				filtro = new MayorPrecio();
				break;
			case "MENORPRECIO":
				filtro = new MenorPrecio();
				break;
			default:
				filtro = new MasVendidos();
				break;
		}
		return filtro;
	}

	public static IFiltro crearFiltroDefault() {
		return crearFiltro("MAYORPRECIO");
	}
	
}
