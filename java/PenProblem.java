import java.util.Scanner;
public class PenProblem {
    public static void main(String args[])
    {
        double  dis,amount,pencost,s,p;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter pencost ");

        pencost=sc.nextDouble();

        System.out.println("enter discount percentage ");

        dis=sc.nextDouble();

        s=100-dis;

        amount= (s*pencost)/100;

        System.out.println("amount after discount="+amount);
        p=pencost*dis/100;
        System.out.println("selling price of pen is"+p);
    }
}