package ar.com.codoacodo.clase13;

public class MainEnums {

	public static void main(String[] args) {
		
		//algo desde el front
		String filtro = "BAJA";
		
		//valueOf
		//pcionesEnum _enum = OpcionesEnum.valueOf(filtro);
		
		//busqueda de un enum dado una clave
		OpcionesEnum _enum  = OpcionesEnum.getEnumByString(filtro);
		
		//pedir al manager
		IFiltro ifiltro =  FiltrosManager.getFiltroByEnum(_enum);
		
		//usar los valores
		//nombre.valor
		seleccionar(OpcionesEnum.ALTA);
	}
	
	public static void seleccionar(OpcionesEnum opciones) {
		
	}

}
