import java.util.Scanner;
public class Series3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,startEven=-2,startOdd=1;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        System.out.println(startOdd+" ");
        System.out.println(startEven+" ");
        for(int i=3;i<n;i++)
        {
            if(i%2==1)
            {
                //System.out.println(1);
                startOdd=startOdd+3;
                System.out.println(startOdd+" ");
            }
            else
            {
                startEven=startEven-4;
                System.out.println(startEven+" ");
            }
        }
    }
}
