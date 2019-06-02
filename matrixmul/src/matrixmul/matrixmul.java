package matrixmul;
import java.util.Scanner;
class mulmat {
	void prod(int x[][],int y[][]) 
	{
		int i,j,k;
		int c[][]=new int[3][3];
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				for(k=0; k<3; k++)
					c[i][j] += x[i][k] * y[k][j];
			}
		}
	System.out.println("The resultant matrix is : ");
	for( i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			System.out.print(c[i][j] + " ");
		System.out.println(" ");
	}
}
}
public class matrixmul
{
	public static void main(String args[])
	{
		int i,j;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the matrix a : ");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.print("Enter the matrix b : ");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		mulmat obj=new mulmat();
		obj.prod(a,b);
	}
}