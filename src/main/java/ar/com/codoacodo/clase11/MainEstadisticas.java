package ar.com.codoacodo.clase11;

import java.util.Collection;
import java.util.List;

public class MainEstadisticas {

	public static void main(String[] args) {
		
		//interace i = new clase()..
		
		SearchService search = new EstatisticaSearchServiceImpl();
		
		Collection<Turno> turnos = search.search();

		EstadisticaBuilder estadisticaBuilder = new EstadisticaBuilder(turnos);
		
		List<Estadistica> estaditicas = estadisticaBuilder.generar();
		
		for (Estadistica estadistica : estaditicas) {
			System.out.println(estadistica);
		}
	}

}
