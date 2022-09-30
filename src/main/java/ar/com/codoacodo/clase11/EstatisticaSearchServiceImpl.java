package ar.com.codoacodo.clase11;

import java.util.Collection;
import java.util.List;

public class EstatisticaSearchServiceImpl implements SearchService {

	@Override
	public Collection<Turno> search() {
		
		//busca en alguno lugar y trae la data
		Turno turno1 = new Turno(1l, "caja");
		Turno turno2 = new Turno(2l, "oficial");
		Turno turno3 = new Turno(3l, "oficial");
		
		return List.of(turno1,turno2,turno3);		
	}

}
