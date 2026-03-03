import java.util.*;
class firstandthird
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3-Digit number");
        int n=sc.nextInt();
        int H=n/100;
        int T=n%100;
        int O=n%10;

        System.out.println("First digit is:"+H);
        System.out.println("Third digit is:"+O);
    }
}