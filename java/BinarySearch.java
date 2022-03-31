import java.util.Scanner;
 public class BinarySearch{
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first+ (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);
            }else{
                return binarySearch(arr, mid+1, last, key);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n,key;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=s.nextInt();
        int[] array = new int[15];
        System.out.println("Enter the elements of the array in sorted order: ");
        for(int i=0; i<n; i++)
        {
            array[i]=s.nextInt();
        }
        System.out.println("Enter the key to be searched");
        key = s.nextInt();
        int last=n-1;
        int result = binarySearch(array,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}
