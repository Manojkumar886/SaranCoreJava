package FundamentalJava.Array;

import java.util.Arrays;
import java.util.Scanner;

//inserting an array value is ordered...
public class BinarySearch
{

    public void traverse(int[] value1)
    {
        for(int get :value1)
        {
            System.out.println(get);
        }
    }

    public int searching(int[] value2,int start,int end,int key)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            if(value2[mid]==key)
                return mid;
            else if (value2[mid]>key)
                return searching(value2,start,mid,key);
            else if (value2[mid]<key)
            return  searching(value2,mid+1,end,key);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int [] orderedValues={10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(orderedValues));
        Scanner scan=new Scanner(System.in);
        System.out.println("tell us which number of index you want");
        int key=scan.nextInt();
        BinarySearch binary=new BinarySearch();
        System.out.println(key+" that index is "+binary.searching(orderedValues,0, orderedValues.length, key));

    }
}
