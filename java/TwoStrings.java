import java.util.*;
class TwoStrings {
    public static void main(String[] args) {

        String txt,str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text");
        txt=sc.nextLine();
        System.out.println("Enter string1");
        str1=sc.nextLine();
        System.out.println("Enter string2");
        str2=sc.nextLine();
        boolean result = txt.contains(str1);
        if(result) {
            System.out.println(str1 + " is present in the string.");
        }
        else {
            System.out.println(str1 + " is not present in the string.");
        }

        result = txt.contains(str2);
        if(result) {
            System.out.println(str2 + " is present in the string.");
        }
        else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
}