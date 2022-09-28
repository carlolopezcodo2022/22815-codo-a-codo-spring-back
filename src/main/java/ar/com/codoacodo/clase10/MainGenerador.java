package ar.com.codoacodo.clase10;

public class MainGenerador {

	public static void main(String[] args) {

		GeneradorString g = new GeneradorString();
		
		String v = g.generar();
		
		System.out.println(v);
		
		GeneradorNumeros gn = new GeneradorNumeros();
		Long ng = gn.generar();
		System.out.println(ng);
	}

}
