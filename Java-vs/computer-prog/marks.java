import java.util.*;
class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");    
        int m=sc.nextInt();
        if(m>100)
        {
            System.out.println("Invalid Marks");
        }

        else if(m==100)
        {
            System.out.println("A+ Grade");
        }
        else if(m>90)
        {
            System.out.println("A Grade");
        }
        else if(m>80)
        {
            System.out.println("B Grade");
        }
        else if(m>70)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("Work Hard");
        }
    } 
}