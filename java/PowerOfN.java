import java.util.*;
public class PowerOfN{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X value:");
        int X=sc.nextInt();
        System.out.println("Enter the N value:");
        int N=sc.nextInt();
        int a=1;
        while(N>0){
            a=a*X;
            N--;
        }
        System.out.println(a);
    }
}
