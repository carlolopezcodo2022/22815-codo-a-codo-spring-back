package ar.com.codoacodo.clase12;

import java.util.ArrayList;
import java.util.Collection;

public class Persona {

	private String nombre;
	private IIDioma idiomaNativo;
	private Collection<IIDioma> otrosIdiomas;
	
	public Persona(String nombre, IIDioma idioma) {
		if(nombre == null || idioma == null) {
			//lanzar una runtime
			throw new RuntimeException("Persona sin nombre o sin Idioma nativo");
		}
		setNombre(nombre);
		setIdiomaNativo(idioma);
		inicializarOtrosIdiomas();
	}
	
	public void aprender(IIDioma nuevoIdioma) throws IdiomaDuplicadoException {
		
		//debo si es el mismo que el nativo ctrl+shit+i
		if(getIdiomaNativo().getClass().equals(nuevoIdioma.getClass())) {
			throw new IdiomaDuplicadoException(getNombre() + " ya habla " + nuevoIdioma.getClass());
		}
		
		for(IIDioma idioma : getOtrosIdiomas()) {
			if(idioma.getClass().equals(nuevoIdioma.getClass())){
				throw new IdiomaDuplicadoException(getNombre() + " ya habla " + nuevoIdioma.getClass());	
			}
		}
		
		getOtrosIdiomas().add(nuevoIdioma);
	}
	
	public void decir(String algo) {
		//idioma nativo 
		getIdiomaNativo().decir(algo);//polimorfismo, porque el objeto persona no sabe cual es 
		//el idioma particular, solo sabe que es un IIDioma
		
		//otros idiomas que sabe hablar
		for(IIDioma idioma : getOtrosIdiomas()){
			idioma.decir(algo);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IIDioma getIdiomaNativo() {
		return idiomaNativo;
	}
	

	private void setIdiomaNativo(IIDioma idiomaNativo) {
		this.idiomaNativo = idiomaNativo;
	}

	public Collection<IIDioma> getOtrosIdiomas() {
		return this.otrosIdiomas;
	}

	private void inicializarOtrosIdiomas() {
		this.otrosIdiomas = new ArrayList<>();
	}
	
	
}
