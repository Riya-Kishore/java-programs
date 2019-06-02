package maxnum;
import java.util.Scanner;

class arry {
	void max(int n[])
	{
		int max=0;
		for(int num:n)
		{
			if(num>max)
				max=num;
		}
		System.out.println("The maximum number is "+ max);
	}
}

class maxnum
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
		arry ob=new arry();
		ob.max(n);
		
	}
}

