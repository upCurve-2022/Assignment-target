import java.util.Scanner;
public class StringProb7 {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=s.nextLine();
        System.out.println(removeHyphen(str));
    }

    public static String removeHyphen(String str){
        StringBuilder strBuilder=new StringBuilder();
        char[] newString = str.toCharArray();
        for(int i=0; i<newString.length; i++){
            if(newString[i] == '-' && str.charAt(i-1) >= '0' && str.charAt(i-1) <= '9' && str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9'){
                continue;
            } else {
                strBuilder.append(newString[i]);
            }
        }
        return strBuilder.toString();
    }
}