package ar.com.codoacodo.clase11;

import java.util.Collection;

public class ClienteEnCaja extends EstadisticaBase implements IGenerador {

	public ClienteEnCaja() {
		//cumple porque le paso los dos parametros
		super("Clientes En Caja","numero");
	}
	
	public Integer doGenerar(Collection<Turno> turnos) {
		
		int cantidad = 0;
		for (Turno turno : turnos) {
			if("CAJA".equalsIgnoreCase(turno.getSector())){
				cantidad++;
			}
		}
		
		return cantidad;
	}

}
