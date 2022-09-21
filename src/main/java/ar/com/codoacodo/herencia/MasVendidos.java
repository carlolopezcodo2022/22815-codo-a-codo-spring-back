package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MasVendidos extends FiltroBase implements IFiltro {
	
	public MasVendidos () {
		super("Mas Vendido",new Articulo[]{});
	}
	public MasVendidos (Articulo[] lista) {
		super("Mas Vendido",lista);
	}
	
	public void ordenar() {
		System.out.println("ordenando por: " + getNombre());
		Arrays.sort(lista, (a, b) -> Integer.compare(b.getCantidadVendido(), a.getCantidadVendido()));
	}
}
