import java.util.Scanner;
public class Seq1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        for(int i=2;i<=2*n;i++)
        {
            if(i%2==0)
                System.out.println(i*i+" ");
        }
    }
}
