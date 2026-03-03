import java.io.*;
class input
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First No.");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Second No.");
        int b=Integer.parseInt(br.readLine());
    }
}