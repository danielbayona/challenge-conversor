package challengeConversor;

public class TestMonedasConversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MonedasConversor mc = new MonedasConversor();
		
		System.out.println(String.format("%f",mc.convertir(4500, Monedas.COP.name(), Monedas.USD.name())));
		System.out.println(String.format("%f",mc.convertir(1, Monedas.USD.name(), Monedas.COP.name())));
		System.out.println(String.format("%f",mc.convertir(1, Monedas.USD.name(), Monedas.EUR.name())));
		System.out.println(String.format("%f",mc.convertir(1, Monedas.EUR.name(), Monedas.USD.name())));
		System.out.println(String.format("%f",mc.convertir(1, Monedas.EUR.name(), Monedas.COP.name())));
		
		for(Monedas m: Monedas.values()) {
			System.out.println(m.getNombre());
		}
		boolean x = Monedas.values() instanceof Monedas[];
		System.out.println(x);
		

	}

}
