import java.util.*;
class tech
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4-Digit number");
        int n=sc.nextInt();
        int F=n/100;
        int S=n%100;

        int sum=F+S;
        int A=(int)Math.pow(sum,2);
        if(A==n)
        {
            System.out.println("Tech number");
        }
        else
        {
            System.out.println("Not a Tech number");
        }
    }
}