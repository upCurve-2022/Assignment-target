import java.util.Scanner;
class assignment6 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc= new Scanner (System.in);
        double n=sc.nextDouble();
        int a=(int)(n/1);
        double b=(n%1);
        int c=(int)(b/0.01);
        System.out.println(a+" "+c);
    }
}