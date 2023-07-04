package Project14;

public class Test2 {
	public static void main(String args[])
	{   Test1 t=new Test1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		
		t2.start();
	}

}
