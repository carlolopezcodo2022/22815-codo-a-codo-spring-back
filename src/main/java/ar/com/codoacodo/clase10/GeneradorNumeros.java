package ar.com.codoacodo.clase10;

public class GeneradorNumeros implements IGenerador<Long> {

	@Override
	public Long generar() {
		return 100l;
	}

}
