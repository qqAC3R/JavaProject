public class ArrayChar {

    public ArrayChar()
    {
        m_Array = new char[100];

        for(int i = 0; i < 100; i++)
        {
            m_Array[i] = (char)(i+31);
        }
    }

    public void Print()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.print(m_Array[i] + " ");
        }
    }


    private char m_Array[];

}
