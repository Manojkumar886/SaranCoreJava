package FundamentalJava.Variables;

public class DemoVariableTypes
{
    static  long myaccountno=6357567368263l;//static variable
    String address="7/1333-23,Salem";
    public void print()
    {
        String ifscCode="IDB09000645";//local variables
        System.out.println("my ifsc code is :"+ifscCode);
        System.out.println(",my address is :"+address);//global variables....
    }public static  void print1()
    {
        System.out.println("your account is not connected in yout mobile number........so your account is expired....");
    }
    public static void main(String[] args)
    {
       // System.out.println("welcome to java variable types.....!");
        int mynumber=100;//Instance variables
        char charcter=(char)mynumber;
        System.out.println("my charcter is :"+charcter);
        System.out.println("my account no is :"+myaccountno);
        DemoVariableTypes obj=new DemoVariableTypes();//object creation
        obj.print();
        print1();
    }
    static {
        System.out.println("welcome to saran.......");
    }
}
