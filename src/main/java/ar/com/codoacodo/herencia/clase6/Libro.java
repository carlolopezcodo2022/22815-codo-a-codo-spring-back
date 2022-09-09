package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class Libro extends Articulo{

	//atributos propios al libro
	private int nroPaginas;//0
	private String isbn;
	
	public Libro(String img, String titulo, String autor, float precio) {		
		super(img, titulo,autor,precio);
	}
	
	public Libro(String img, String titulo, String autor, float precio, int nroPaginas,String isbn) {	
		//la primer linea de codigo del constructor debe ser "invocar contrcutor del padre"
		super(img, titulo,autor,precio);
		//seteo lo que es propio de hijo
		this.setNroPaginas(nroPaginas);
		this.setIsbn(isbn);		
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		//invocar al padre + hijo
		return super.toString() + ", Libro [nroPaginas=" + nroPaginas + ", isbn=" + isbn + "]";
	}
	
}
