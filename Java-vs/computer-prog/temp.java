import java.util.*;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double C=sc.nextDouble();
        double F=(9/5)*C+32;
        System.out.println("Temperature in fahrenheit is:"+F);

    }
}