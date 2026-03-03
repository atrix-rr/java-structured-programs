import java.util.*;
class t
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A 4 DIGIT NUMBER");
        int num=sc.nextInt();
        
    int f=num/100;
    int s=num%100;
    int sum=f+s;
        int S=sum*sum;
        
        if(S==num)
        {
            System.out.println("IT IS A TECH NUM");
        }
        else{
            System.out.println("IT IS NOT A TECH NUM");
        }
    }
    
}