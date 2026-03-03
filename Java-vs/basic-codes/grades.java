import java.util.*;
class grades
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS");
        int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("GRADE A");
        }
        else if(marks>=80)
        {
            System.out.println("B GRADE");
        }
        else if(marks>=70)
        {
            System.out.println("C GRADE");
        }
        else if(marks< 70)
        {
            System.out.println("WORK HARD");
        }
    }
}