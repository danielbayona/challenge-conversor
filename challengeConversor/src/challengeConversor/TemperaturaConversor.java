package challengeConversor;

public class TemperaturaConversor implements Conversor{

	@Override
	public double convertir(double entrada, String unidadEntrada, String unidadRequerida) {
		/*usa la ecuacion de una recta que pasa por dos puntos para establecer la conversion
		 * entre escalas de temperatura*/
		
		double pendiente= (TemperaturaEscalas.valueOf(unidadRequerida).getPuntoEbullicion()-TemperaturaEscalas.valueOf(unidadRequerida).getPuntoFusion())/(TemperaturaEscalas.valueOf(unidadEntrada).getPuntoEbullicion()-TemperaturaEscalas.valueOf(unidadEntrada).getPuntoFusion());
		//System.out.println("s:" + pendiente);
		double valor = pendiente*(entrada-TemperaturaEscalas.valueOf(unidadEntrada).getPuntoFusion())+TemperaturaEscalas.valueOf(unidadRequerida).getPuntoFusion();
		return valor;
	}

}
