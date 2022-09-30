package ar.com.codoacodo.clase11;

import java.util.Collection;

public abstract class EstadisticaBase implements IGenerador{

	private String titulo;
	private String tipo;
	
	//LOGICA COMUN PARA SUS HIJOS
	
	public EstadisticaBase(String titulo, String tipo) {
		this.titulo = titulo;
		this.tipo = tipo;
	}
	
	public EstadisticaItem generar(Collection<Turno> turnos) {
		
		//lo comun a todas las estadisticas
		Integer valor = 0;
		
		if(!turnos.isEmpty()) {
			//le digo al hijo que haga su parte
			valor = doGenerar(turnos);
		}
		
		return new EstadisticaItem(this.titulo, valor, this.tipo);
	}
	
	//metodo abstracto
	public abstract Integer doGenerar(Collection<Turno> turnos);
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
