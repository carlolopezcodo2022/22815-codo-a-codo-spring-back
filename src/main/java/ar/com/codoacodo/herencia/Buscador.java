package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.clase8.CreadorDeFiltros;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados;//esto es nulo porque es un array
	private IFiltro filtros;

	//default: visibles en mismo paquete y por ser usadas por cualquier clase 
	public Buscador(String claveDelUsuario){
		this.setClaveBusqueda(claveDelUsuario);
		this.setResultados(new Articulo[]{});
		
		this.setFiltros(CreadorDeFiltros.crearFiltroDefault());
	}
	
	private void setFiltros(IFiltro filtro) {	
		this.filtros = filtro;
	}

	public void cambiarFiltro(IFiltro nuevoFiltro) {
		setFiltros(nuevoFiltro);
	}
	
	public void ordenar() {
		//down casting de IFiltro a FiltroBase
		((FiltroBase)(this.filtros)).setLista(getResultados());
		this.filtros.ordenar();
	}
	
	/*firma del metodo: */
	public void buscar() {
		/*simular que busco en una db*/
		
		DBUtil db = new DBUtil();
		
		this.setResultados(db.obtenerResultado(this.claveBusqueda));
	}
	
	public void mostrarResultados() {
		System.out.println("Hemos Encontrado " +this.cantidadResultados()+ "Resultados Para " + this.getClaveBusqueda());
		
		//ahora que tengo los resultados en el objeto miBuscador, recorro
		for(Articulo aux : this.getResultados() ) {
			System.out.println("Titulo: " + aux.getTitulo());
			System.out.println("Autor: " + aux.getAutor());
			System.out.println("Img: " + aux.getImg());
			System.out.println("Precio: " + aux.getPrecio());
			System.out.println("Cant. Vendidos: " + aux.getCantidadVendido());
			System.out.println("Fecha publicación:  " + aux.getFechaPublicacion());
			System.out.println("---------------");
		}
	}
	
	int cantidadResultados() {
		return this.resultados.length;
	}
	
	//getters/setters: metodos	
	String getClaveBusqueda() {
		return this.claveBusqueda;
	}
	
	public Articulo[] getResultados() {
		return this.resultados;
	}

	void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
}
