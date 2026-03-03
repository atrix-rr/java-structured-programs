import java.io.*;
class math
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num=Integer.parseInt(br.readLine());

        double square=Math.sqrt(num);
        double cube=Math.cbrt(num);

        System.out.println("Square is:"+square);
        System.out.println("Cube is:"+cube);
    }
}