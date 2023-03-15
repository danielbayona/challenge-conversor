package challengeConversor;

import javax.swing.JOptionPane;

public class ConversorGui {
	public static void main(String[] args) {
		
		menuPrincipal();

	}

	static void menuPrincipal() {
		Conversor conversor;
		Enum[] opciones;
		String[] conversores = { "TEMPERATURA", "MONEDA" };
		while (true) {

			// mostrar el menu principal para seleccionar el tipo de conversión
			
			String seleccion = JOptionPane
					.showInputDialog(null, "Seleccione una opción", "Menu", 1, null, conversores, "temperatura")
					.toString();	

			if (seleccion.equals(conversores[0])) {
				opciones = TemperaturaEscalas.values();
				conversor = new TemperaturaConversor();

			} else {
				opciones = Monedas.values();
				conversor = new MonedasConversor();
			}
			
			// solicitar los datos al usuario: unidad de entrada, salida y valor a convertir

			String unidadEntrada = JOptionPane.showInputDialog(null, "Seleccione la opción de entrada", "Unidad origen", 1,
					null, opciones, opciones[0]).toString();
			System.out.println(unidadEntrada);
			String unidadSalida = JOptionPane.showInputDialog(null, "Seleccione el tipo de moneda que quiere obtener",
					"Moneda destino", 1, null, opciones, opciones[0]).toString();
			System.out.println(unidadSalida);
			
			try {
				double valor = Double.parseDouble(JOptionPane
						.showInputDialog(null, "Ingrese el valor que desea convertir, sin espacios ni símbolos",
								"Ingresar valor", 1, null, null, 0)
						.toString());
				String respuesta = "%.3f %s equivalen a %.3f %s".formatted(valor,unidadEntrada,conversor.convertir(valor, unidadEntrada, unidadSalida),unidadSalida);
				JOptionPane.showMessageDialog(null, respuesta);

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ha ingresado un caracter inválido.");
				// e.printStackTrace();
			}

			// desea continuar//yes,no,cancel
			if (JOptionPane.showConfirmDialog(null, "¿Desea continuar?") != 0) {
				// cuadro de dialogo de salida
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			}
		}
	}
}
