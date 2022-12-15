package FundamentalJava.Array;

//datatype [][] arrayname=new datatype[n][];n no of rows=2
//arrayname[0]=new int[5];
//arrayname[1]=new int[7];// no of column count
public class JaggedArray
{
    public static void main(String[] args)
    {
        int [][] count1={{1,2},{3,4,5,6},{8}};//
        int [][] trainBoxCount=new int[5][];
        trainBoxCount[0]=new int[2];
        trainBoxCount[1]=new int[4];
        trainBoxCount[2]=new int[6];
        trainBoxCount[3]=new int[8];
        trainBoxCount[4]=new int[1];
        int count=0;
        //0 -0 ,0-1
        //Value collect
        for(int boxcount=0;boxcount<trainBoxCount.length;boxcount++)
        {
            for(int seatcount=0;seatcount< trainBoxCount[boxcount].length;seatcount++)
            {
                trainBoxCount[boxcount][seatcount]=count+=10;
            }
        }
        //value print
        for(int row=0;row<trainBoxCount.length;row++)
        {
            for(int col=0;col<trainBoxCount[row].length;col++)
            {
                System.out.print(trainBoxCount[row][col]+" ");
            }
            System.out.println();
        }


    }
}
