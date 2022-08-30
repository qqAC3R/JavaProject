import java.util.Scanner;

public class SumArray {

    public SumArray(int x)
    {
        m_Array = new int[x];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < x; i++)
        {
            System.out.print("Array[" + i + "] = ");
            m_Array[i] = scanner.nextInt();
        }
    }

    int Sum()
    {
        int sum = 0;
        for (int var : m_Array)
        {
            sum += var;
        }
        return sum;
    }


    private int m_Array[];
}
