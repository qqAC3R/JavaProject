public class Main 
{
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();

		int x = 5;
		int y = 2;

		System.out.println("Adunare: "    + calculator.Add(x, y));
		System.out.println("Scadere: "    + calculator.Substitute(x, y));
		System.out.println("Inmultire: "  + calculator.Multiply(x, y));
		System.out.println("Impartire: "  + calculator.Divide(x, y));

	}
}