import java.util.*;
class rat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height");
        double H=sc.nextDouble();
        System.out.println("Enter base");
        double B=sc.nextDouble();
        
        double A=0.5*B*H;
        System.out.println("Area is:"+A);

    }
}