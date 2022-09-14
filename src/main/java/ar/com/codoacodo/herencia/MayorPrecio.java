package ar.com.codoacodo.herencia;

public class MayorPrecio implements IFiltro {
	
	public Articulo[] ordenar(Articulo[] lista) {
		System.out.println("ordenando por mayor precio");
		return lista;
	}
}
