import java.util.*;
 public class Palindrome{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String n=str;
        String c="";
        char b;
        for(int i=0;i<str.length();i++){
            b=str.charAt(i);
            c=b+c;
        }
        if(n.equals(c)){
            System.out.println("Yes");  }
        else
            System.out.println("No");
    }
}