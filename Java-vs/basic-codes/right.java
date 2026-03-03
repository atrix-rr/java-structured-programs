import java.io.*;
class right
{
    public static void main(String args[])
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER BASE");
    double b=Double.parseDouble(br.readLine());
    System.out.println("ENTER HEIGHT");
    double h=Double.parseDouble(br.readLine());

    double A=0.5*b*h;
    System.out.println("AREA OF RIGHT ANGLED TRIANGLE IS "+A);
    }
}