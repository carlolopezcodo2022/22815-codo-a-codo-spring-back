package ar.com.codoacodo.herencia.clase7;

public class VendedorConsolas {

	public IJugable vender() {
		return new Tablet();
	}
	
	public IJugable[] venderVarios() {
		PlayStation play = new PlayStation("play3","Sony");
		XBox xbox = new XBox("xbox","Microsoft");
		Wii wii = new Wii("nintendo wii","Nintendo");
		Tablet tablet = new Tablet();
		
		IJugable[] jugables = new IJugable[4];
		jugables[0] = play;
		jugables[1] = xbox;
		jugables[2] = wii;
		jugables[3] = tablet;
		
		return jugables;
	}
	
}
