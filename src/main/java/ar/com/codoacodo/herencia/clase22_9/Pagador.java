package ar.com.codoacodo.herencia.clase22_9;

public class Pagador {

	public static void pagar(Venta venta) throws TimeOutException, InvalidPaymentMethod, AmountInvalidException{
		System.out.println("invocando al medio de pago.....");
		System.out.println("comunicando con mercadopago....");
		
		if(venta.getMontoVenta() < 0) {
			throw new AmountInvalidException("monto ivalido: " + venta.getMontoVenta());
		}
		
		if(venta.getMontoVenta() > 1400) {
			throw new TimeOutException("No se pudo pagar....porque se corte internet");
		}
		
		if("visa".equals(venta.getMedioDePago().getNombre())) {
			throw new InvalidPaymentMethod("No se pudo pagar....porque se corte internet");
		}
	}
}
