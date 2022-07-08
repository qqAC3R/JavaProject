public class TempConverter
{
	public static void main(String[] args)
	{
		// Initializing the values
		float varCelsius = 20.0f;
		float varFahrenheit = 75.55f;

		// Variable `varCelsius` converted from Celsius into Fahrenheit
		// by the formula (X × 9/5) + 32
		float varCToF = (varCelsius * 9/5) + 32;

		// Variable `varFahrenheit` converted from Fahrenheit into Celsius
		// by the formula (X - 32) * 9/5
		float varFToC = (varFahrenheit - 32) * 5/9;

		// Printing the output
		System.out.println("C (" + varCelsius + ")" + " to F(" + varCToF + ")");
		System.out.println("F (" + varFahrenheit + ")" + " to C(" + varFToC + ")");
	}
}