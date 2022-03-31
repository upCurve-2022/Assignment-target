import java.util.Scanner;
public class RevNum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int rev=0;
        if(n%10==0)
            System.out.print(0);
        while(n!=0){
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n/10;
        }
        System.out.println(rev);
    }
}