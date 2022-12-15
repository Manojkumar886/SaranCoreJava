package FundamentalJava.Array;

import java.util.Scanner;

public class MultiDimensionalArray
{
    static Scanner scan=new Scanner(System.in);
    public static void AddingValues(String[][] adding)
    {
        for(int floor=0;floor< adding.length;floor++)
        {
            for(int house=0;house< adding[floor].length;house++)
            {
                System.out.println("floor is "+floor+" house no is "+house+ " what your tenent name");
                adding[floor][house]=scan.next();
            }
        }
    }

    public static void list(String[][] Pass)
    {
        for(String pass1[]:Pass)
        {
            for(String Pass2:pass1)
            {
                System.out.print(Pass2+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
//        int[][] KM={{12,43,23},{34,5,7},{3,4,65},{34,56,45}};
//
//        System.out.println(KM[3][2]);
//
//        for(int row=0;row<4;row++)
//        {
//            for(int column=0;column<3;column++)
//            {
//                System.out.print(KM[row][column]+" ");
//            }
//            System.out.println();
//        }
        String [][] Apartment=new String[2][3];
        MultiDimensionalArray.AddingValues(Apartment);
        MultiDimensionalArray.list(Apartment);

    }
}
