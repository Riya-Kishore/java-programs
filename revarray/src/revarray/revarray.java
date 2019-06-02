package revarray;
import java.util.Scanner;

class revv {
	void reverse(int n[])
	{
		int i;
		System.out.println("The array in reverse order is : ");
		for( i=n.length-1;i>=0;i--)
		{
			System.out.print(n[i]+" ");
		}

	}
}
public class revarray 
{
	public static void main (String args[])
	{
		int n[]=new int[5];
		int i;
		System.out.print("Enter the array : ");
		Scanner sc1 = new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			n[i]= sc1.nextInt();
		}
		revv ob=new revv();
		ob.reverse(n);
	}
}

