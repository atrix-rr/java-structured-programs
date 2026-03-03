import java.util.*;
class bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter MRP");
        int MRP=sc.nextInt();
        double B=MRP+(18/100)*MRP;
        System.out.println("Bill is:"+B);
    }
}