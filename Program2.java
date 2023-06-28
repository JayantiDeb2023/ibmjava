package Project5;
import java.util.Scanner;
public class Program2 {
public enum shape
{
	triangle,
	rectangle,
	pentagon,
	hexagon,
	septagon
}
public static void main(String args[])
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter order of shapes");
	int a=ob.nextInt();
	shape a2[]=shape.values();
	if (a<a2.length)
		System.out.println(a2[a]);
		
	
}
}
