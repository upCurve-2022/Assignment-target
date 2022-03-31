import java.util.Scanner;
public class SumOfEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("\nthe odd sum is"+sum);
    }
}
