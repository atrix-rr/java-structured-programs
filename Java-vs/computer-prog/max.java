import java.util.Scanner;

class max
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        
        int d1 = num % 10;          
        int d2 = (num / 10) % 10;  
        int d3 = num / 100;         
        
        int greatest = Math.max(d1, Math.max(d2, d3));
        int smallest = Math.min(d1, Math.min(d2, d3));
        
        System.out.println("Greatest digit: " + greatest);
        System.out.println("Smallest digit: " + smallest);
        
        sc.close();
    }
}