import java.util.*;
public class CylinderVolume{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int height,radius;
        System.out.println("Enter height");
        height=sc.nextInt();

        System.out.println("enter radius");
        radius=sc.nextInt();
        double pie=3.14285714286;
        double volume=pie*(radius*radius)*height;
        System.out.println("Volume of the cylinder="+volume);
    }
}