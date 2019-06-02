package transposematrix;
import java.util.Scanner;
class trans 
{
	void tpose(int x[][]) 
	{
		int i,j;
		int c[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				c[j][i]=x[i][j];
		}
		System.out.println("The transpose of the matrix is : ");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(c[i][j] + " ");
			System.out.println(" ");
		}
	}
}
public class transposematrix
{
	public static void main(String args[])
	{
		int i,j;
		int a[][]=new int[3][3];
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the matrix a : ");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		trans obj=new trans();
		obj.tpose(a);
	}
}
