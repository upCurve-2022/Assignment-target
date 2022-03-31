import java.util.Scanner;
public class StringProb4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter your String:");
        str=s.nextLine();

        if(str.isEmpty())
            System.out.print("String is empty");
        else
            System.out.print("String is not empty");
    }
}