import java.util.Scanner;
public class TernaryOperator {
    public static void main(String args[])
    {
        int a, b, c , max;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a=s.nextInt();
        System.out.println("Enter number 2: ");
        b=s.nextInt();
        System.out.println("Enter number 3: ");
        c=s.nextInt();
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum number among is " + max);
    }
}