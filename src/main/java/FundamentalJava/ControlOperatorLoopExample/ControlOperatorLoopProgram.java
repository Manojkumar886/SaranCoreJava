package FundamentalJava.ControlOperatorLoopExample;

import java.util.Scanner;

public class ControlOperatorLoopProgram
{
    static {
        System.out.println("________welcome to Indian Bank_____");
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int count2000s=5,count500s=10,count200s=30,count100s=50,reqcount=0;
        String record="";
        int total=(count2000s*2000)+(count500s*500)+(count200s*200)+(count100s*100);
        System.out.println("Total Amount is "+total);
        do
        {
            System.out.println("please tell us how much amount you want need");
            int cash=scan.nextInt();
            if(total>=cash)
            {
                if(cash/2000!=0 && count2000s>0)
                {
                    reqcount=cash/2000;
                    if(reqcount>count2000s)
                    {
                        cash-=(count2000s*2000);
                        record+="2000 X"+count2000s+"\n";
                        count2000s=0;
                    }
                    else
                    {
                        cash-=(reqcount*2000);
                        record+="2000 X"+reqcount+"\n";
                        count2000s-=reqcount;
                    }
                    System.out.println("withdraw youe amount \n"+record);
                }
                if(cash>0 && cash/500!=0 && count500s>0)
                {
                    reqcount=cash/500;
                    if(reqcount>count500s)
                    {
                        cash-=(count500s*500);
                        record+="500 X"+count500s+"\n";
                        count500s=0;
                    }
                    else {
                        cash-=(reqcount*500);
                        record+="500 X "+reqcount+"\n";
                        count500s-=reqcount;

                    }
                    System.out.println("withdraw youe amount \n"+record);

                    System.out.println("welcome to anitha enterprises");
                    System.out.println("please tell us which purpose of laptop you need \n It \n Account \n  Games");
                    String purpose=scan.next();
                    switch (purpose)
                    {
                        case "It":
                            System.out.println("your asked IT professional laptop is currently available...");
                            System.out.println("which amount laptop you need....");
                            int price= scan.nextInt();
                            if(price>40000 && 60000>price)
                            {
                                System.out.println(price+" this price laptops are \n Hp \n Lenovo");
                                String usage=scan.next();
                                switch (usage)
                                {
                                    case "Hp":
                                        System.out.println("your choose a laptop are hp,specification are new generation........");
                                        break;
                                    default:
                                        System.out.println("Nothing to search");
                                }
                            }
                            else {
                                System.out.println("not available");
                            }
                            break;
                        case "Account":
                        default:
                            System.out.println("nothing ");
                    }
                }
            }
            else
            {
                System.out.println("Insuffient amount");
            }

        }
        while (true);
    }
}
