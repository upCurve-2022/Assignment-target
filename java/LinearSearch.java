import java.util.Scanner;
 public class LinearSearch{
    public static int linearSearch(int arr[], int first, int last, int key){
        for(int i=first;i<=last;i++)
            if(arr[i]==key)
                return i;
        return -1;
    }
    public static void main(String args[]){
        int n,key;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=s.nextInt();
        int[] array = new int[15];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=s.nextInt();
        }
        System.out.println("Enter the key to be searched");
        key = s.nextInt();
        int last=n-1;
        int result = linearSearch(array,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}
