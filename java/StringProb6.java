import java.util.Scanner;
public class StringProb6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1,str2;
        int len1=0,len2=0,count=0;
        System.out.println("Enter string 1: ");
        str1=s.nextLine();
        len1=str1.length();
        System.out.println("Enter string 2: ");
        str2=s.nextLine();
        len2=str2.length();
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        if(len1==len2){
            for(int i=0;i<len1;i++)
            {
                if(charArray1[i]==charArray2[i])
                    count++;
            }
        }
        if(count==len1)
            System.out.println("The given strings are same");
        else
            System.out.println("The given strings are not same");
    }
}