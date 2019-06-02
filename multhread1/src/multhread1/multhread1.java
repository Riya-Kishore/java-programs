package multhread1;
class excp extends Thread 
{
	int count;
	String name;
	excp()
	{
		super("DEMO thread");
		System.out.println("Child thread="+this);
	}
	public void run()
	{
		try 
		{
			for(count=1;count<=10;count++)
			{
				System.out.println("Child thread=" +count);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted");
		}
		System.out.println("Child thread  exiting");
	}
}
public class multhread1
{
	public static void main(String args[])
	{
		excp obj=new excp();
		obj.start();
		try 
		{
			obj.join();
			for(int i=0;i<10;i++)
				System.out.println("Main thread="+i);
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
