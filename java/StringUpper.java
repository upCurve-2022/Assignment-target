import java.util.*;
public class StringUpper{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter string to covert uppercase");
        str=sc.nextLine();
        String strUpper = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: "+ strUpper);
    }
}

