import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ArrayFinder arrayFinder = new ArrayFinder();

        System.out.print("Number = ");
        Scanner scanner = new Scanner(System.in);

        if(arrayFinder.IsNumberInArray(scanner.nextInt()))
        {
            System.out.print("Number is in the array");
        }
        else
        {
            System.out.print("Number is not in the array");
        }

    }
}
