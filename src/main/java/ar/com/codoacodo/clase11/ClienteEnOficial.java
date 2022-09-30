package ar.com.codoacodo.clase11;

import java.util.Collection;

public class ClienteEnOficial extends EstadisticaBase implements IGenerador {

	public ClienteEnOficial() {
		super("Clientes En Oficial","numero");
	}
	
	public Integer doGenerar(Collection<Turno> turnos) {
		
		int cantidad = 0;
		for (Turno turno : turnos) {
			if("OFICIAL".equalsIgnoreCase(turno.getSector())){
				cantidad++;
			}
		}
		
		return cantidad;
	}

}
