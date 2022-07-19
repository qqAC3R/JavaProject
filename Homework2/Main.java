public class Main
{
	public static void main(String[] args)
	{
		TempConverter tempConverter = new TempConverter();

		double celsius = 100.0;
		double fahr = 100.0;

		double celsiusConvertedFahr = tempConverter.convertToFahr(celsius);
		double fahrConvertedCelsius = tempConverter.convertToCelsius(fahr);

		System.out.println("C (" + celsius + ")" + " to F(" + celsiusConvertedFahr + ")");
		System.out.println("F (" + fahr + ")" + " to C(" + fahrConvertedCelsius + ")");
	}
}