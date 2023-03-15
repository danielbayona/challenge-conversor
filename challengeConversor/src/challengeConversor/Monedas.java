package challengeConversor;

import java.util.HashMap;

public enum Monedas {
	/*el valor double en cada moneda indica la cantidad de pesos colombianos que 
	 * representa una moneda en particular*/
	COP("PESO COLOMBIANO"),
	USD("DOLAR"),	
	EUR("EURO"),
	GBP("LIBRA ESTERLINA"),
	JPY("YEN JAPONÉS"),
	KRW("WON SURCOREANO");
	
	private String nombre;
	private double valorCOP;

	
	Monedas(String nombre) {
		this.nombre=nombre;
		setValorReferencia(Monedas.this.name());
	}
	
	private void setValorReferencia(String nombre) {
		// de momento esta funcion usa un hashmap para recuperar valores, pero puede modificarse
		// para conectar con otro origen de datos
		HashMap<String,Double> baseDatos= new HashMap<>();
		baseDatos.put("COP",1.0);
		baseDatos.put("USD",4745.6);
		baseDatos.put("EUR",5092.4);
		baseDatos.put("GBP",5768.0);
		baseDatos.put("JPY",35.3);
		baseDatos.put("KRW",3.6);
		
		this.valorCOP=baseDatos.get(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public double getValorReferencia() {
		return valorCOP;
	}

	
	
	
	
	
	
	

}
