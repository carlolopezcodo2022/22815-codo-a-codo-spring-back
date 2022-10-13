package ar.com.codoacodo.clase13;

import java.util.HashMap;
import java.util.Map;

public class FiltrosManager {

	private static Map<OpcionesEnum, IFiltro> filtros;
	
	//bloques estaticos
	static {
		filtros = new HashMap<>();
		//filtros.put(OpcionesEnum.ALTA, new Alta());
		//filtros.put(OpcionesEnum.ALTA, new Modificar());
		//filtros.put(OpcionesEnum.ALTA, new Baja());
	}
	
	//antes del constructor!!!!!
	
	public static IFiltro getFiltroByEnum(OpcionesEnum _enum) {
		if(_enum == null) {
			throw new RuntimeException("No existe enum");
		}
		return filtros.get(_enum);
	}
}
