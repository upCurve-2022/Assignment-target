import java.util.Scanner;
class Swap_3
{
   static int a, b, c;

    static void swapThree()
    {
        a = a + b + c;

        b = a - (b + c);

        c = a - (b + c);

        a = a - (b + c);
    }
    public static void main(String []args)
    {

        a = 20; b = 30; c = 40;
        System.out.println("Before swapping a = " + a + ", b = " + b + ", c = " + c);

        swapThree();

        System.out.println("After swapping a = " + a + ", b = " + b + ", c = " + c);
    }
}




