package FundamentalJava.Array;

import java.util.Arrays;

public class PassingAnArrayValueInMethod
{
    public void Passing(String[] StudName)
    {
        StudName[0]="Thilak";
        StudName[5]="Swathy";
      //  System.out.println(StudName);

    }
    public void basic(String name)
    {
        System.out.println("my name is "+name);
    }
    public static void main(String[] args)
    {
        String[] StudentName={"Thivin","Saran","Vineth","Vimal","Apsheya","Haripriya"};
        System.out.println("before updating value"+ Arrays.toString(StudentName));
        PassingAnArrayValueInMethod Passing=new PassingAnArrayValueInMethod();
        Passing.Passing(StudentName);
        System.out.println(Arrays.toString(StudentName));
        Passing.basic("Saran");

    }
}
