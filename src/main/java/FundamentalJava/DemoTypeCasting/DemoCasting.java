package FundamentalJava.DemoTypeCasting;

public class DemoCasting
{
    public static void main(String[] args)
    {
        int alpha=89878;
        double cosmo=0;
        cosmo=alpha;
        System.out.println("my double value is"+cosmo);

        char myvalue1='a'; int myvalue2=0;
        myvalue2=myvalue1;
        System.out.println("my value is :"+myvalue2);

        double percentage1=89.8;
        int value=(int)percentage1;
        System.out.println("double value is converted by integer :"+value);
        float percentage=(float)(percentage1+value);
        System.out.println("convert two datas"+percentage);
        char change=(char) percentage;
        System.out.println("my character is "+change);

    }
}
