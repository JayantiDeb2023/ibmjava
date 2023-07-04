package Project14;

public class Queue {
	private int top=0;
	private int bottom=-1;
	private char queue[]=new char[8];
public void insert(char a)
{
	synchronized(this)
	{   bottom++;
		queue[bottom]=a;
	}
}
public synchronized char delete()
{
	return queue[top++];
}
}
