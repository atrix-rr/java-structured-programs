import java.io.*;
class area
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Base");
        double B=Double.parseDouble(br.readLine());
        System.out.println("Enter Height");
        double H=Double.parseDouble(br.readLine());

        double A=0.5*B*H;
        System.out.println("Area is:"+A);
    }
}