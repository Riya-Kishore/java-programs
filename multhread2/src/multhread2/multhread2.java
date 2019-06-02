package multhread2;
class newthread implements Runnable
{
	Thread t;
	String n;
	static int i;
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
			for(i=0;i<5;i++)
			{
				System.out.println( n+"="+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
				System.out.println("Child interrupted");
		}
		System.out.println("Child " + n +" exits");
	}
}
public class multhread2 
{
	public static void main(String args[])
	{
		int i;
		newthread obj1=new newthread("One");
		newthread obj2=new newthread("Two");
		newthread obj3=new newthread("Three");
		obj1.t.start();
		
		try 
		{
			obj1.t.join();
			obj2.t.start();
			obj2.t.join();
			obj3.t.start();
			obj3.t.join();
			for(i=0;i<5;i++)
			{
				System.out.println("main="+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
				System.out.println("main interrupted");
		}
		System.out.println("main exits");
	}
}

