import java.util.Scanner;
import java.lang.Math;
public class Seq3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print((int)Math.pow(i,i)+" ");
        }
    }
}
