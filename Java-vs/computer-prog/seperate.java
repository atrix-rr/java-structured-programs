import java.util.*;
class seperate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an even number");
        int n=sc.nextInt();
        int a=n/10;
        int b=n%10;
        System.out.println("Two numbers are:"+a+" and "+b);            
    }
}