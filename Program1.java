package Project5;
import java.util.Scanner;
public class Program1 {
  public enum weeks
  {
	  sunday,monday,tuesday,wednesday,thursday,friday,saturday
  }
  public static void main(String args[])
  {
	  Scanner ob=new Scanner(System.in);
	  System.out.println("Enter the day");
	  int a=ob.nextInt();
	  int c=0;
	  weeks a1[]=weeks.values();
	  if(a<=7)
	  System.out.println(a1[a-1]);
	  
  }
}
