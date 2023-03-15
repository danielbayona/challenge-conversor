package challengeConversor;

public class TestTempertaturaConversor {
	
	public static void main(String[] args) {
		TemperaturaConversor tc = new TemperaturaConversor();
		System.out.println(tc.convertir(100, "CELSIUS", "FAHRENHEIT"));
		System.out.println(tc.convertir(0, "CELSIUS", "KELVIN"));
		System.out.println(tc.convertir(212, "FAHRENHEIT", "CELSIUS"));
		System.out.println(tc.convertir(32, "FAHRENHEIT", "KELVIN"));
		System.out.println(tc.convertir(273, "KELVIN", "FAHRENHEIT"));
		System.out.println(tc.convertir(0, "KELVIN", "CELSIUS"));
		System.out.println(tc.convertir(0, "KELVIN", "KELVIN"));
		System.out.println(tc.convertir(0, "CELSIUS", "CELSIUS"));
		System.out.println(tc.convertir(0, "FAHRENHEIT", "FAHRENHEIT"));
		
	}

}
