package ar.com.codoacodo.clase11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EstadisticaBuilder {

	private Map<String, Set<IGenerador>> mapGeneradores;
	
	private Collection<Turno> turnos;
	
	public EstadisticaBuilder(Collection<Turno> turnos) {
		this.turnos = turnos;
		construirMapa();
	}

	private void construirMapa() {
		
		//creo mi mapa y comienzo a cargar clave-valor
		mapGeneradores = new HashMap<>();
	
		//creo los generadores que son parte de Asistencia a Sucursal
		Set<IGenerador> asistenciaEnSucursal = Set.of(new ClienteEnCaja(), new ClienteEnOficial());
		
		//cargar el mapa
		mapGeneradores.put("Asistencia a Sucursal", asistenciaEnSucursal);
		
		//otros grupos
		//mapGeneradores.put("Tiempo Promedio", );
	}
	
	
	public List<Estadistica> generar() {
		//debe recorrer el mapa e ir invocando para cada clave las 
		//lista de IGeneradores
		//cargar en una lista comun los resultados para darle al controlador
		//clase main
		
		 List<Estadistica> estadisticas = new ArrayList<>();
		 
		 Set<Entry<String, Set<IGenerador>>> generadores = this.mapGeneradores.entrySet();//clave-valor
		 
		 for(Entry<String, Set<IGenerador>> gen : generadores) {
			 
			 Set<EstadisticaItem> itemsDelAgrupador = new HashSet<>();
			 
			 String agrupador = gen.getKey();//
			 
			 Set<IGenerador> items = gen.getValue();
			 for(IGenerador aGen : items) {
				 EstadisticaItem item = aGen.generar(this.turnos); 
				 itemsDelAgrupador.add(item);
			 }
			 
			 Estadistica unaEstadistica = new Estadistica(agrupador, itemsDelAgrupador);
			 estadisticas.add(unaEstadistica);
		 }
		 
		 return estadisticas;
	}
}
