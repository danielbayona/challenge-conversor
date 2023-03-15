# challenge-conversor
Se trata de un conversor de moneda y temperatura programado en Java
utilizando la librería javax.Swing.JOptionPane

los conversores están organizados en clases que implementan la interfaz
Conversor que contiene el método convertir y que recibe un valor de entrada,
la unidad de entrada y la unidad requerida.

para implementar cada conversor además de la clase, se utiliza un Enum que
describe cada una de las posibles unidades y algunos parámetros requeridos
para la conversion. En el caso de las monedas se indica la cantidad de COP
que representa una moneda de determinado valor, mientras que para las 
temperaturas se indican las temperaturas de fusion y ebullición del agua
para realizar las respectivas conversiones entre escalas.

el conversor de monedas implementa las monedas COP("PESO COLOMBIANO"), USD("DOLAR"),
EUR("EURO"), GBP("LIBRA ESTERLINA"), JPY("YEN JAPONÉS"), KRW("WON SURCOREANO");
mientras que el conversor de temperatura utiliza las escalas CELSIUS, FAHRENHEIT Y
KELVIN.
----------------------------------------------------------------------------------------
it's about a currency and temperature conversor programmed in Java using 
javax.Swing.JOptionPane library

Conversor are organized in classes that implements Conversor interface which has the
convertir method who receives an input value, input type and required type

Each Conversor requires an Enum apart of the class, this Enum has the available types
for conversion and some parameters required to make the conversion. In currencies, it is
indicated the quantity of COP (colombian currency) that equals 1 unity of the interest
currency, for temperatures, instead, the parameters are the melting and boiling temperatures
for water.

the currency conversor accepts this currencies: COP("PESO COLOMBIANO"), USD("DOLAR"),
EUR("EURO"), GBP("LIBRA ESTERLINA"), JPY("YEN JAPONÉS"), KRW("WON SURCOREANO"); while 
temperature conversor uses Celsius, Fahrenheit and Kelvin.


