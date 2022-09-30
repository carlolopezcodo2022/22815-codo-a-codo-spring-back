package ar.com.codoacodo.clase11;

public class EstadisticaItem {

	private String titulo;
	private Integer valor;
	private String tipo;
	
	public EstadisticaItem(String titulo, Integer valor, String tipo) {
		this.titulo = titulo;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "EstadisticaItem [titulo=" + titulo + ", valor=" + valor + ", tipo=" + tipo + "]";
	}
	
	
	
}
