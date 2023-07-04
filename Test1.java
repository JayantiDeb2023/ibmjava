package Project14;
import java.util.Scanner;
public class Test1 implements Runnable {
public void run()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter character");
	char a=ob.next().charAt(0);
	Stack s=new Stack();
	s.push(a);
	Queue q=new Queue();
	char c=s.pop();
	q.insert(c);
	System.out.println("Item deleted from queue"+q.delete());
	
}
}
