import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("x = ");
        Scanner scanner = new Scanner(System.in);

        SumArray sumArray = new SumArray(scanner.nextInt());

        System.out.print("Sum Array = " + sumArray.Sum());
    }
}
