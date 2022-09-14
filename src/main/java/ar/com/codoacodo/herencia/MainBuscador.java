package ar.com.codoacodo.herencia;

public class MainBuscador {

	public static void main(String[] args) {
		
		//simular que el usario escribio "algo"
		String claveDelUsuario = "iron man";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
			
		miBuscador.setClaveBusqueda(claveDelUsuario);
		
		miBuscador.buscar();

		//ahora que tengo los resultados en el objeto miBuscador, recorro
		miBuscador.mostrarResultados();
	}

}
