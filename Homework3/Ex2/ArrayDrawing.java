public class ArrayDrawing {

    public ArrayDrawing()
    {
        ArraySizeY = 9;
        ArraySizeX = 9;
        m_2DArray = new char[ArraySizeY][ArraySizeX];

        InitDrawing();
    }

    private void InitDrawing()
    {
        for(int i = 0; i < ArraySizeY; i++)
        {
            for(int j = 0; j < ArraySizeX; j++)
            {
                if((j == 4 || i == 4) || (i == j || ((ArraySizeX-1) - j) == i))
                {
                    m_2DArray[j][i] = '*';
                }
                else
                {
                    m_2DArray[j][i] = ' ';
                }
            }
        }
    }

    public void PrintDrawing()
    {
        for(int i = 0; i < ArraySizeY; i++)
        {
            for(int j = 0; j < ArraySizeX; j++)
            {
                System.out.print(m_2DArray[j][i] + "  ");
            }
            System.out.println();
        }
    }


    private char m_2DArray[][];
    private int ArraySizeX;
    private int ArraySizeY;

}
