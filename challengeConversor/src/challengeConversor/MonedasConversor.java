package challengeConversor;

public class MonedasConversor implements Conversor {
	

	@Override
	public double convertir(double entrada, String unidadEntrada, String unidadRequerida) {
		/* unidadEntrada indica cuantos cop forman una unidad de la moneda, se calcula el inverso:x
		 * unidadRequerida indica cuantos cop forman una unidad de la moneda, se calcula el inverso:y
		 * 
		 * utiliza la ecuacion de la recta entre dos puntos para calcular el valor a convertir
		 * en x van la unidad de entrada y en y la unidad requerida, y ademas se conoce 0,0
		 * la pendiente es y/x, la interseccion con y es 0 y resulta m*valor
		 * Se toma x/y 
		 * 
		 *  */
		double pendiente;
		
		pendiente = Monedas.valueOf(unidadEntrada).getValorReferencia()/Monedas.valueOf(unidadRequerida).getValorReferencia();
		
		
		
		
		return pendiente*entrada;
	}

	

	

}
