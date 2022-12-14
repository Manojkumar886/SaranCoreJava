package FundamentalJava.Array;

public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        int[][] KM={{12,43,23},{34,5,7},{3,4,65},{34,56,45}};

        System.out.println(KM[3][2]);

        for(int row=0;row<4;row++)
        {
            for(int column=0;column<3;column++)
            {
                System.out.print(KM[row][column]+" ");
            }
            System.out.println();
        }
    }
}
