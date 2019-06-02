package primenum;

class checkprime
{
	void check()
	{
		int i,j;
		System.out.println("The prime numbers between 100 and 200 are : ");
		for(i=100;i<=200;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(j>i/2)
				System.out.print(i+" ");
		}
	}
}
public class primenum
{
	public static void main(String[] args) {
		checkprime ob=new checkprime();
		ob.check();
	}
}

