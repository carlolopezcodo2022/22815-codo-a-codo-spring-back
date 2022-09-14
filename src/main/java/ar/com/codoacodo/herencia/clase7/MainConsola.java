package ar.com.codoacodo.herencia.clase7;

public class MainConsola {

	public static void main(String[] args) {
		VendedorConsolas vc = new VendedorConsolas();
		IJugable algo = vc.vender();
		algo.jugar();
		
		IJugable[] jugables =  vc.venderVarios();
		for(IJugable aux : jugables  ) {
			aux.jugar();
		}
	}
}
