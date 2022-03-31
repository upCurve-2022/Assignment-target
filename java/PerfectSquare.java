import java.util.Scanner;
public class PerfectSquare
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();


        double root = Math.sqrt(num);

        if((Math.floor(root) - root)==0)
            System.out.println(num+" is a Perfect Square Number");

        else
            System.out.println(num+" is Not a Perfect Square Number");
    }
}