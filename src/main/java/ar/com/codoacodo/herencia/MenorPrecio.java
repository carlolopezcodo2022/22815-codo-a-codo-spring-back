package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MenorPrecio extends FiltroBase implements IFiltro {

	public MenorPrecio() {
		super("Mayor Precio");
	};	
	
	public MenorPrecio(Articulo[] lista) {
		super("Mayor Precio",lista);
	};
	
	public void ordenar() {
		
		System.out.println("ordenando por mayor precio");
		//_3_|__5__|__4__|__2__|_9___|
		
		//_9_|__5__|__4__|__3__|_2___|
		
		//algoritmos de ordenamiento
		
		//bubuja/secuncial/(binaria?)/mergesort/heapsort/quicksort
		
		// a - b = 0 => iguales
		// a - b > 0 => a es mayor que b
		// a - b < 0 => b es mayor que a 
		Arrays.sort(lista, (a, b) -> Float.compare(a.getPrecio(),b.getPrecio()));
	}
}
