import java.io.*;
class spy
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a 3-Digit number");
        int N=Integer.parseInt(br.readLine());
        int H=N/100;
        int T=(N/10)%10;
        int O=N%10;
        
        int Sum=H+T+O;
        int Product=H*T*O;

        if(Sum==Product)
        {
            System.out.println("Spy no.");
        }
        else
        {
            System.out.println("Not a Spy no.");
        }
    }
            

}