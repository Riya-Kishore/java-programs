package revnum;
import java.util.Scanner;

class revv {
	void reverse(int n)
	{
		int i,x,r=0;
		System.out.print("The number in reverse order is : ");
		while(n>0)
		{	
			x=n%10;
			r=r*10+x;
			n=n/10;
		}
		System.out.print(r);

	}
}
public class revnum
{
	public static void main (String args[])
	{
		int i;
		System.out.print("Enter the number : ");
		Scanner sc1 = new Scanner(System.in);
		int num=sc1.nextInt();
		revv ob=new revv();
		ob.reverse(num);
	}
}
