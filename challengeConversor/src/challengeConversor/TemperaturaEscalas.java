package challengeConversor;

public enum TemperaturaEscalas {
	CELSIUS(0,100),
	FAHRENHEIT(32,212),
	KELVIN(273,373);
	
	
	private double puntoFusion;
	private double puntoEbullicion;
	
	TemperaturaEscalas(double puntoFusion, double puntoEbullicion){
		
		this.puntoEbullicion=puntoEbullicion;
		this.puntoFusion=puntoFusion;
	}


	public double getPuntoFusion() {
		return puntoFusion;
	}

	public double getPuntoEbullicion() {
		return puntoEbullicion;
	}
	
	

}
