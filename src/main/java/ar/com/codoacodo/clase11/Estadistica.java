package ar.com.codoacodo.clase11;

import java.util.Set;

public class Estadistica {

	private String agrupador;
	private Set<EstadisticaItem> items;
	
	public Estadistica(String agrupador, Set<EstadisticaItem> items) {
		this.agrupador = agrupador;
		this.items = items;
	}
	
	public String getAgrupador() {
		return agrupador;
	}
	public void setAgrupador(String agrupador) {
		this.agrupador = agrupador;
	}
	public Set<EstadisticaItem> getItems() {
		return items;
	}
	public void setItems(Set<EstadisticaItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Estadistica [agrupador=" + agrupador + ", items=" + items + "]";
	}
	
	
}
