package FundamentalJava.Array;

import java.util.Scanner;

public class SearchingAnArray
{
    public static void main(String[] args)
    {
        String [] CastMembers={"Vijay","Ajith","Rajini","Kamal","PrabhuDeva"};

        System.out.println("my array length is "+CastMembers.length);

        int mycount=CastMembers.length;

        Scanner scan=new Scanner(System.in);
        System.out.println("Tell us what is your favoriate actor");
        String favoriate=scan.next();

        for(int pos=0;pos<mycount;pos++)
        {
            if(favoriate.equalsIgnoreCase(CastMembers[pos]))
            {
                System.out.println(favoriate+" your actor value is founded "+pos);
                return;
            }
        }
        System.out.println(favoriate+" actor not founded ");


    }
}
