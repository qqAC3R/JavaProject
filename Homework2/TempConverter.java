public class TempConverter
{
	// Function to convert Celsius into Fahrenheit
	// Formula = (X × 9/5) + 32
	public double convertToFahr(double celsius)
	{
		return (celsius * 9/5) + 32;
	}

	// Function to convert Fahrenheit into Celsius
	// Formula = (X - 32) * 5/9
	public double convertToCelsius(double fahr)
	{
		return (fahr - 32) * 5/9;
	}
}