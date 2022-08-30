import java.util.Scanner;

public class ArrayFinder {

    public ArrayFinder()
    {
        m_Array = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Array[" + i + "] = ");
            m_Array[i] = scanner.nextInt();
        }
    }

    boolean IsNumberInArray(int x)
    {
        for(int i = 0; i < 5; i++)
        {
            if(m_Array[i] == x)
            {
                return true;
            }
        }
        return false;
    }

    private int m_Array[];
}
