import java.util.*;

public class SecondLargest {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>=b&&a>=c){
            System.out.println("first largest number"+a);
            if(b>=c){
                System.out.println("second largest number"+b);
            }
            else{
                System.out.println("second largest number"+c);
            }
        }
        else if(b>=a&&b>=c)
        {System.out.println("first largest number"+b);
            if(a>=c)
            {
                System.out.println("second largest number"+a);
            }
            else
            {
               System.out.println("second largest number"+c);
            }
        }
        else{
            System.out.println("first largest number"+c);
            if(a>=b){
                System.out.println("second largest number"+a);
            }
            else{
                System.out.println("second largest number"+b);
            }
        }

    }
}