import java.util.Scanner;
public class StringProb2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=s.nextLine();
        System.out.println("Enter the character to be removed");
        char x = s.next().charAt(0);
        System.out.println(removeChar(str,x));
    }

    public static String removeChar(String str, char x){
        StringBuilder strBuilder=new StringBuilder();
        char[] newString = str.toCharArray();
        for(int i=0; i<newString.length; i++){
            if(newString[i] == x){
                continue;
            } else {
                strBuilder.append(newString[i]);
            }
        }
        return strBuilder.toString();
    }
}
