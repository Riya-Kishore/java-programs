package showinheritance;
class publication 
{
	String title;
	double price;
	publication()
	{
		title="ABC";
		price=150.50;
	}
	publication(String name,double p)
	{
		title=name;
		price=p;
	}
	void writedata()
	{
		System.out.println("The title of the book is : " + title);
		System.out.println("The price of the book is : " + price);
	}
}
class book extends publication
{
	int nop,nob;
	book()
	{
		super();
		nop=500;
		nob=25;
	}
	book(String name,double p,int n1,int n2)
	{
		super(name,p);
		nop=n1;
		nob=n2;
	}
	void writedata()
	{
		super.writedata();
		System.out.println("The no. of pages is " + nop);
		System.out.println("The no. of books is " + nob);
	}
}
class recording extends publication
{
	int time,not;
	recording()
	{
		super();
		time=50;
		not=20;
	}
	recording(String name,double p,int t,int n3)
	{
		super(name,p);
		time=t;
		not=n3;
	}
	void writedata()
	{
		System.out.println(" ");
		System.out.println("2nd book--");
		super.writedata();
		System.out.println("The time of recording in minutes is :"+time);
		System.out.println("The no. of tapes is "+not);
	}
}
public class showinheritance
{
	public static void main(String args[])
	{
		book obj1 = new book();
		book obj2 = new book("English",250.50,150,22);
		recording ob1 = new recording();
		recording ob2 = new recording("Science",400,50,20);
		obj2.writedata();
		ob2.writedata();
		
	}
}
