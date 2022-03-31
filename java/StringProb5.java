import java.util.Scanner;
public class StringProb5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        int len=0;
        System.out.println("Enter a string");
        str=s.nextLine();
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length;i++)
            len++;
        System.out.println("The length of given string is "+len);
    }
}