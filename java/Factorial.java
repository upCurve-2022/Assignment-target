import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter a number: ");
        n=s.nextInt();
        for(int i=n;i>=1;i--)
            fact*=i;
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
