import java.util.Scanner;
public class StringProb3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        int count=0,i;
        System.out.println("Enter your String:");
        str=s.nextLine();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                count++;
            }
        }
        if(count==str.length())
            System.out.print("String contains only digits.");
        else
            System.out.print("String does not contains only digits.");
    }
}