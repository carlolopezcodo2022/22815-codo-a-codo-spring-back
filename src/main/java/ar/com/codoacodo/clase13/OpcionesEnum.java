package ar.com.codoacodo.clase13;

public enum OpcionesEnum {
	ALTA("ALTA"),
	BAJA("BAJA"),
	MODIFICAR("MODIFICAR"),
	ELIMINAR("ELIMINAR")
	;
	
	private String key;
	
	private OpcionesEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public static OpcionesEnum getEnumByString(String filtro) {//lower_case
		OpcionesEnum[] _enums = OpcionesEnum.values();
		for(OpcionesEnum unEnum : _enums) {
			if(unEnum.getKey().equals(filtro)) {
				//logica!
				return unEnum;
			}
		}
		throw new RuntimeException("no existe el enum " + filtro);
	}
	//setter
}
