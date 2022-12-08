package FundamentalJava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArrayValue
{
    public static void main(String[] args)
    {
        int [] myage={12,24,36,48,60,72,84,96,108,120};

        System.out.println("before updating value"+ Arrays.toString(myage));

        Scanner scan=new Scanner(System.in);
        System.out.println("Tell us which position you want update");
        int index=scan.nextInt();
        System.out.println("what is value you need update/replace");
        int newvalue=scan.nextInt();
        myage[index]=newvalue;
        System.out.println("After updating value"+ Arrays.toString(myage));


    }
}
