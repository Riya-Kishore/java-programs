package multhread;

class newthread implements Runnable{
	Thread t;
	String n;
	newthread(String name)
	{
		n=name;
		t= new Thread(this,n);
		System.out.println("Child thread=" + t);
	}
	public void run()
	{
		try 
		{
			int i;
			for(i=0;i<5;i++)
			{
				System.out.println( n +"=" + i);
				Thread.sleep(1000);
			}	
		}
		catch(InterruptedException e)
		{
				System.out.println("Child interrupted");
		}
		System.out.println("Child " + n +" exits");
	}
}
public class multhread 
{
	public static void main(String args[])
	{
		newthread obj1=new newthread("one");
		newthread obj2=new newthread("two");
		newthread obj3=new newthread("three");
		obj1.t.start();
		obj2.t.start();
		obj3.t.start();
		try 
		{
			System.out.println("Waiting for threads to finish");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch(InterruptedException e)
		{
				System.out.println("main interrupted");
		}
		System.out.println("main exits");
	}

}

