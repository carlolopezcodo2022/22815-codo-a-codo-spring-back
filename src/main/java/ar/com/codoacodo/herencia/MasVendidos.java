package ar.com.codoacodo.herencia;

public class MasVendidos extends Ordenador implements IFiltro {
	public MasVendidos (String nombre) {
		super(nombre);
	}
	
	public Articulo[] ordenar(Articulo[] lista) {
		System.out.println("ordenando por mas vendido");
		return lista;
	}
}
