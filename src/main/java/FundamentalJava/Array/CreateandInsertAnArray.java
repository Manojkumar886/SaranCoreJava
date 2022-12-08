package FundamentalJava.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CreateandInsertAnArray
{
    public static void main(String[] args)
    {
        // datatype [] arrayname={...............};//compile time value assigned
        // datatype [] arrayname=new datatype[size];//runtime value assigned

        String [] chocolateName={"Munch","KitKat","Nestle","FiveStar","DiaryMilk","MilkyBar"};

//        for(int index=0;index< chocolateName.length;index++)
//        {
//            System.out.println(chocolateName[index]);
//        }

     //   System.out.println(Arrays.toString(chocolateName));
        //for(datatype variablename:ArrayName)
//        {
//            System.out.println(variable);
//        }

//        for(String Chocho:chocolateName)
//        {
//            System.out.print(Chocho+",");
//        }
//        String[] base=new String[6];
//        System.out.println(Arrays.toString(base));
        double []Inchecs=new double[15];
//        Inchecs[3]=89.9;
//        Inchecs[10]=99.9;
//        Inchecs[1]=65.8;
        Scanner scan=new Scanner(System.in);

        for(int index=0;index<Inchecs.length;index+=3)
        {
            System.out.println("enter your Inches");
            Inchecs[index]= scan.nextDouble();
          //  System.out.println(Inchecs[index]);
        }

        System.out.println(Arrays.toString(Inchecs));

    }

}
