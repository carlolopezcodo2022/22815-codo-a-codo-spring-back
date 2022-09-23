package ar.com.codoacodo.herencia.clase22_9;

import java.util.Date;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;
import ar.com.codoacodo.herencia.clase6.Libro;
import ar.com.codoacodo.herencia.clase6.Musica;

public class MainPago {

	public static void main(String[] args) {
		
		String nombre ="carlos";
		
		//datos de la orden
		String producto = "termo lumilagro";
		
		MedioDePago medioDePago = new MedioDePago("otromedio");
		
		Venta venta = new Venta(nombre, medioDePago, new Date(), 1d);
		
		int cantidadReintentos = 3;
		boolean success = false;
		do {
			try {
				Pagador.pagar(venta);
				success = true;
			}catch (TimeOutException te) {
				System.err.println(te.getMessage());
				cantidadReintentos--;
			}catch (InvalidPaymentMethod ipm) {
				System.err.println(ipm.getMessage());
				/*if(imp instaceof VisaException) {
					//algo diff
				}*/
				break;
			}catch (AmountInvalidException aie) {
				System.err.println(aie.getMessage());
				break;
			}finally {
				System.out.println("siempre va a ajecutarse");
			}
		}while(cantidadReintentos > 0 && !success);
		
		if(success) {
			System.out.println("pago realizado"); 
		}else {
			System.err.println("pago fallido");
		}
	}

}
