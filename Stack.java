package Project14;

public class Stack {
private int top=-1;
private char stack[]=new char[6];
public void push(char a)
{   synchronized(this){
	top++;
	stack[top]=a;}
}
public synchronized char pop()
{
	return stack[top--];
}
}
