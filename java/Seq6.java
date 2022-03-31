import java.util.Scanner;
public class Seq6{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        int a=1;
        for(int i=0;i<n;i++)
        {
            int b=4*i;
            a=a+b;
            if(b%3!=0||i==0)
                System.out.print(a+" ");
            else
            {
                a=a-b;
                n=n+1;
            }
        }
    }
}
